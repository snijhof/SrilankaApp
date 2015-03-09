package com.example.sjoerd.srilankavakantie.Activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.example.sjoerd.srilankavakantie.Fragment.*;
import com.example.sjoerd.srilankavakantie.Model.*;
import com.example.sjoerd.srilankavakantie.R;


public class MainActivity extends ActionBarActivity {

    PagerAdapter mPagerAdapter;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the adapter
        Fragment[] fragments = {
                new AgendaFragment(),
                new CityFragment(),
                new CostsFragment()};
        mPagerAdapter = new PagerAdapter(getSupportFragmentManager(), fragments);
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mPagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }
}
