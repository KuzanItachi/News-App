package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

        public NewsAdapter(Context context, List<News> news)
        {
                super(context,0,news);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View listItemView=convertView;
                if(listItemView==null)
                {
                        listItemView= LayoutInflater.from(getContext()).inflate(
                                R.layout.news_list_item,parent,false);
                }
                News currentnews=getItem(position);
                TextView headlineview=listItemView.findViewById(R.id.headline);
                String curtitle=currentnews.getmTitle();
                headlineview.setText(curtitle);
                TextView dateview=listItemView.findViewById(R.id.date);
                String newsdate=currentnews.getmWebPublicationDate();
                dateview.setText(newsdate);
                TextView sectionview=listItemView.findViewById(R.id.section);
                sectionview.setText(currentnews.getmSection());
                TextView authorview=listItemView.findViewById(R.id.author);
                authorview.setText(currentnews.getmAuthor());
                return listItemView;
        }
}
