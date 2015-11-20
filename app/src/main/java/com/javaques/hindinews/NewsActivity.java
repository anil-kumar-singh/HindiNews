package com.javaques.hindinews;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.javaques.hindinews.data.NewsPaper;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    SlidingTabPagerAdapter adapter;
    static List<String> tabs  = new ArrayList<>();
    static NewsPaper newsPaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setToolbar();
        newsPaper = getIntent().getParcelableExtra("news_paper");


        setTabs();
    }

    private void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private void setTabs(){
        viewPager = (ViewPager) findViewById(R.id.pager);
        adapter = new SlidingTabPagerAdapter((FragmentManager)getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout = (TabLayout)findViewById(R.id.sliding_tabs);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

     static class SlidingTabPagerAdapter extends FragmentStatePagerAdapter {


         public SlidingTabPagerAdapter(FragmentManager fm) {
             super(fm);
             tabs.add("TAB 1");
             tabs.add("TAB 2");
             tabs.add("TAB 3");
             tabs.add("TAB 4");
             tabs.add("TAB 5");
             tabs.add("TAB 6");

         }

         @Override
        public Fragment getItem(int position) {
            return NewsFragment.getInstance(position);
        }

        @Override
        public int getCount() {
            return tabs.size();
        }
         @Override
         public CharSequence getPageTitle(int position) {
             return "Tab " + (position + 1);
         }
    }

    public static class NewsFragment extends Fragment{

        public static NewsFragment getInstance(int position){
            NewsFragment newsFragment = new NewsFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("position", position);
            newsFragment.setArguments(bundle);
            return newsFragment;
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_news, container, false);
            TextView tv = (TextView) view.findViewById(R.id.textView);
            tv.setText("this is tab "+(getArguments().getInt("position") + 1) + " of " + newsPaper.getName());
            return view;
        }
    }

}
