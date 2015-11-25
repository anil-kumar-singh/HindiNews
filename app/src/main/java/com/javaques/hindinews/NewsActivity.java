package com.javaques.hindinews;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.javaques.hindinews.data.NewsCategory;
import com.javaques.hindinews.data.NewsPaper;
import com.squareup.okhttp.OkHttpClient;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    SlidingTabPagerAdapter adapter;
    static List<NewsCategory> tabs = new ArrayList<>();
    static NewsPaper newsPaper;
    static TextView tv;
    private static final String TAG = "NewsActivity";
    static private RecyclerView recyclerView;
    private static final String STATE_NEWS_PAPER_OBJ = "news_paper_obj";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        if(savedInstanceState != null) {
            newsPaper = savedInstanceState.getParcelable(STATE_NEWS_PAPER_OBJ);
        }else{
                newsPaper = getIntent().getParcelableExtra("news_paper");
        }
        setToolbar();
        tabs = newsPaper.getListOfCategories();
        setTabs();

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putParcelable(STATE_NEWS_PAPER_OBJ, newsPaper);
        super.onSaveInstanceState(outState);
    }



    private void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(newsPaper.getName());

    }

    private void setTabs() {
        viewPager = (ViewPager) findViewById(R.id.pager);
        adapter = new SlidingTabPagerAdapter((FragmentManager) getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_news, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_refresh) {
            return false;
        }

        return super.onOptionsItemSelected(item);
    }

    static class SlidingTabPagerAdapter extends FragmentStatePagerAdapter {


        public SlidingTabPagerAdapter(FragmentManager fm) {
            super(fm);


        }

        @Override
        public Fragment getItem(int position) {
            return NewsFragment.getInstance(newsPaper.getId(), newsPaper.getListOfCategories().get(position).getUrl());
        }

        @Override
        public int getCount() {
            return tabs.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabs.get(position).getTitle();
        }
    }


}
