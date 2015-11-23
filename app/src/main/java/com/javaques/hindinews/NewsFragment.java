package com.javaques.hindinews;

import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.javaques.hindinews.data.News;
import com.javaques.hindinews.data.NewsPaper;
import com.javaques.hindinews.parsers.AmarUjalaFeedParser;
import com.javaques.hindinews.parsers.FeedXmlParser;
import com.javaques.hindinews.parsers.JagranFeedParser;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Anil on 22-Nov-15.
 */
public class NewsFragment extends Fragment {
    private RecyclerView recyclerView;
    ProgressBar progressBar;
    static int newsPaperId;
    LinearLayout parentLayout;
    String myurl;


    public static NewsFragment getInstance(int newspaperId, String url) {
        NewsFragment newsFragment = new NewsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("newspaper_id", newspaperId);
        bundle.putString("url", url);
        newsFragment.setArguments(bundle);
        return newsFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        progressBar = (ProgressBar) view.findViewById(R.id.progressBar);
        parentLayout = (LinearLayout) view.findViewById(R.id.parentLayout);

        myurl = getArguments().getString("url");
        newsPaperId = getArguments().getInt("newspaper_id");



        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        load(myurl);
    }

    private boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            return true;
        } else {
            return false;
        }

    }

    private void load( final String url){
        if (isOnline()) {
            new DownlodTask().execute(url);
        } else {
            Snackbar snackbar = Snackbar
                    .make(getView(), "No internet connection!", Snackbar.LENGTH_INDEFINITE)
                    .setAction("RETRY", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            load(url);
                        }
                    });

            // Changing message text color
            snackbar.setActionTextColor(Color.RED);

            // Changing action button text color
            View sbView = snackbar.getView();
            TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
            textView.setTextColor(Color.YELLOW);
            snackbar.show();
            // Toast.makeText(getActivity(), "unable to connect to internet", Toast.LENGTH_LONG).show();
        }
    }

    class DownlodTask extends AsyncTask<String, Void, List<News>> {

        @Override
        protected void onPreExecute() {
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected List<News> doInBackground(String... params) {
            FeedDownloader downloader = new FeedDownloader();
            List<News> newsList = null;
            FeedXmlParser parser = null;
            try {
                InputStream feed = downloader.run(params[0]);
                parser = getParser();
                newsList = parser.parse(feed);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
            return newsList;
        }

        @Override
        protected void onPostExecute(List<News> newsList) {
            progressBar.setVisibility(View.GONE);
            updateDisplay(newsList);
        }
    }

    private void updateDisplay(List<News> newsList) {

        NewsAdapter adapter = new NewsAdapter(getActivity(), newsList);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);


    }

    private FeedXmlParser getParser() {

        return new FeedXmlParser();
    }


}
