package com.javaques.hindinews;

import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.javaques.hindinews.data.News;
import com.javaques.hindinews.data.NewsPaper;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Anil on 22-Nov-15.
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {
List<News> newsList;
    private Context mContext;
    LayoutInflater inflater;
    int previousPosition = -1;
    public NewsAdapter(Context c, List<News> newsList){
        this.mContext = c;
        this.newsList = newsList;
        inflater = LayoutInflater.from(mContext);

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.news_list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final News news = newsList.get(position);

        holder.tvTitle.setText(news.getTitle());
        holder.tvDescription.setText(Html.fromHtml(news.getDescription()));
        holder.tvPubDate.setText(news.getPubDate());
        String imgUrl = news.getImage();
        if (imgUrl == null || imgUrl.length() == 0) {
            holder.imageView.setVisibility(View.GONE);
        } else {
            Picasso.with(mContext).load(imgUrl).into(holder.imageView);
            holder.imageView.setVisibility(View.VISIBLE);
        }
        //adding animation
        if (position > previousPosition) {
            AnimationUtil.animate(holder, true); // we are scrolling doun
        } else {
            AnimationUtil.animate(holder, false); // we are scrolling up
        }
        previousPosition = position;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(mContext, news.getLink(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvTitle;
        TextView tvDescription;
        TextView tvPubDate;


        public MyViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            tvTitle = (TextView) itemView.findViewById(R.id.title);
            tvDescription = (TextView) itemView.findViewById(R.id.description);
            tvPubDate = (TextView) itemView.findViewById(R.id.pub_date);
        }
    }
}
