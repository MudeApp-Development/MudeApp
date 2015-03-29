package com.eaglesoft.mudeapp.mudeapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

/**
 * Created by JuanCarlos on 28/03/2015.
 */
public class GaleAbc extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pagerabc);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        ImageAdapterAbc adapter = new ImageAdapterAbc(this);
        viewPager.setAdapter(adapter);
    }
}
