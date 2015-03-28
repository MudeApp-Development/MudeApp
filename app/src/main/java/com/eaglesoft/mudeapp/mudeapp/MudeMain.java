package com.eaglesoft.mudeapp.mudeapp;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MudeMain extends FragmentActivity {

    ViewPager pager = null;


    MyFragPageAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mudeapp_main);

        // Instantiate a ViewPager
        this.pager = (ViewPager) this.findViewById(R.id.pager);

        // Create an adapter with the fragments we show on the ViewPager
        MyFragPageAdapter adapter = new MyFragPageAdapter(
                getSupportFragmentManager());

        adapter.addFragment(SlidePageFragment.newInstance(getResources()
                .getColor(R.color.white), 0 ,R.drawable.aprende,getString(R.string.galeria)));
        adapter.addFragment(SlidePageFragmentJuego.newInstance(getResources()
                .getColor(R.color.white), 1, R.drawable.juega,getString(R.string.juega)));
        adapter.addFragment(SlidePageFragmentSabiasque.newInstance(getResources()
                .getColor(R.color.white), 2, R.drawable.sabiasque, getString(R.string.sabiasque)));


        this.pager.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mude_main, menu);
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

    @Override
    public void onBackPressed() {
        if (this.pager.getCurrentItem() == 0)
            super.onBackPressed();
        else
            this.pager.setCurrentItem(this.pager.getCurrentItem() - 1);
    }
    public void Showgaleria(View show)
    {
        Intent showpage = new Intent(this, Galeria_Aprende.class);
        startActivity(showpage);
    }
    public void Showjuego(View show)
    {
        Intent showpage = new Intent(this, Juega_Aprende.class);
        startActivity(showpage);
    }
    public void Showsabiasque(View show)
    {
        Intent showpage = new Intent(this, Sabiasque_Aprende.class);
        startActivity(showpage);
    }
}
