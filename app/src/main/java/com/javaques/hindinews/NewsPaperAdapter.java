package com.javaques.hindinews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.javaques.hindinews.data.NewsPaper;

import java.util.List;

/**
 * Created by deadman on 19/11/15.
 */
public class NewsPaperAdapter extends RecyclerView.Adapter<NewsPaperAdapter.MyViewHolder> {
    List<NewsPaper> newsPapers;
    private Context mContext;
    LayoutInflater inflater;
    int previousPosition = -1;
    public NewsPaperAdapter(Context c, List<NewsPaper> listOfNewsPapers){
        this.mContext = c;
        this.newsPapers = listOfNewsPapers;
        inflater = LayoutInflater.from(mContext);

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.website_list_item, viewGroup, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        myViewHolder.imageView.setImageResource(newsPapers.get(i).getLogo());
        myViewHolder.textView.setText(newsPapers.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return newsPapers.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }


}
