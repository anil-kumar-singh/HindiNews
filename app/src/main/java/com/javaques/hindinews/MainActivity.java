package com.javaques.hindinews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.WindowManager;

import com.javaques.hindinews.data.DataCreater;
import com.javaques.hindinews.data.NewsPaper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    NewsPaperAdapter adapter;
    List<NewsPaper> listOfNewsPapers;
    private static final int PORTRAIT = 1;
    private static final int LANDSCAPE = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolbar();
        prepareNewsPapersList();
        setRecyclerView();
    }




    private void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private void setRecyclerView() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new NewsPaperAdapter(this, listOfNewsPapers);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(getGridColums(), StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

    }
    private int getGridColums(){
        if(getCurrentOrientation() == PORTRAIT){
            return 2;
        }else {
            return 3;
        }
    }

    private int getCurrentOrientation(){
        Display display = ((WindowManager) getSystemService(WINDOW_SERVICE))
                .getDefaultDisplay();

        int orientation = display.getRotation();

        if (orientation == Surface.ROTATION_90
                || orientation == Surface.ROTATION_270) {
           return LANDSCAPE;
        }else{
            return PORTRAIT;
        }
    }
    private void prepareNewsPapersList() {
        listOfNewsPapers = new ArrayList<NewsPaper>();
        listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_JAGRAN,"जागरण", R.drawable.logo_jagran, DataCreater.getListOfCategories(NewsPaper.NP_JAGRAN)));
        listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_AMAR_UJALA,"अमर उजाला", R.drawable.logo_amarujala, DataCreater.getListOfCategories(NewsPaper.NP_AMAR_UJALA)));
        //listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_NAVBHARAT_TIMES,"नवभारत टाइम्स", R.drawable.logo_navabharat));
        //listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_HINDUATAN,"हिन्दुस्तान", R.drawable.logo_livehindustan, null));
        listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_BHASKAR,"दैनिक भास्कर", R.drawable.logo_bhaskar, DataCreater.getListOfCategories(NewsPaper.NP_BHASKAR)));

        listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_NAI_DUNIYA,"नई दुनिया", R.drawable.logo_naidunia, DataCreater.getListOfCategories(NewsPaper.NP_NAI_DUNIYA)));
        //listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_PANJAB_KESHARI,"पंजाब केशरी", R.drawable.logo_punjabkesari));
        //listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_RASHTRIYA_SAHARA,"राष्‍ट्रीय सहारा", R.drawable.logo_rashtriyasahara, null));
        listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_JANSATTA,"जनसत्ता", R.drawable.logo_jansatta, DataCreater.getListOfCategories(NewsPaper.NP_JANSATTA)));
        listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_TEHELKA,"तहलका", R.drawable.logo_tehelkahindi, DataCreater.getListOfCategories(NewsPaper.NP_TEHELKA)));
        //listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_PATRIKA,"पत्रिका", R.drawable.logo_patrika, null));
        listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_NAVBHARAT,"नवभारत", R.drawable.logo_navbharattimes,DataCreater.getListOfCategories(NewsPaper.NP_NAVBHARAT)));
        listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_PRABHAT_KHABAR,"प्रभात खबर", R.drawable.logo_prabhatkhabar, DataCreater.getListOfCategories(NewsPaper.NP_PRABHAT_KHABAR)));
        listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_HARIBHOOMI,"हरिभूमि", R.drawable.logo_haribhoomi,DataCreater.getListOfCategories(NewsPaper.NP_HARIBHOOMI)));
        listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_NDTV,"एन डी टीवी इंडिया", R.drawable.logo_ndtv, DataCreater.getListOfCategories(NewsPaper.NP_NDTV)));
        listOfNewsPapers.add(new NewsPaper(NewsPaper.NP_ABP_NEWS,"एबीपी न्यूज़", R.drawable.logo_abp_news, DataCreater.getListOfCategories(NewsPaper.NP_ABP_NEWS)));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
