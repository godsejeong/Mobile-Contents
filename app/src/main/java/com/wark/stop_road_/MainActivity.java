package com.wark.stop_road_;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.github.mikephil.charting.data.Entry;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
     //private SectionsPagerAdapter mSectionsPagerAdapter;
     private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adding Toolbar to the activity
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Initializing the TabLayout
        tabLayout = (TabLayout) findViewById(R.id.TabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("내 기록"));
        tabLayout.addTab(tabLayout.newTab().setText("순위"));
        tabLayout.addTab(tabLayout.newTab().setText("안전뉴스"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // Initializing ViewPager
        viewPager = (ViewPager) findViewById(R.id.ViewPager);

        // Creating TabPagerAdapter adapter
        TabPagerAdapter pagerAdapter = new TabPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        // Set TabSelectedListener
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //chart ArrayList
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add();
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id) {
            case R.id.warning:
                Intent intent = new Intent(MainActivity.this,Warning.class);
                startActivity(intent);
                return true;
            case R.id.my_information:
                Intent a = new Intent(MainActivity.this,Information.class);
                startActivity(a);
                return  true;
            case R.id.time_set:
                Intent b = new Intent(MainActivity.this,Time_Set.class);
                startActivity(b);
                return  true;
        }

        return super.onOptionsItemSelected(item);
    }
}
