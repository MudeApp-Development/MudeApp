package com.eaglesoft.mudeapp.mudeapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class Sabiasque_Aprende extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mudeapp_sabiasque__aprende);
        TextView txtuno = (TextView)findViewById(R.id.txtuno);
        TextView txtdos = (TextView)findViewById(R.id.txtdos);
        TextView txttres = (TextView)findViewById(R.id.txttres);
        txtuno.setText(R.string.sabiasqueuno);
        txtdos.setText(R.string.sabiasquedos);
        txttres.setText(R.string.sabiasquetres);
        ImageView imauno= (ImageView)findViewById(R.id.imasabias);
        ImageView imados= (ImageView)findViewById(R.id.imasabiasdos);
        ImageView imatres= (ImageView)findViewById(R.id.imasabiastres);
        imauno.setImageResource(R.drawable.benitojuarez);
        imados.setImageResource(R.drawable.koko);
        imatres.setImageResource(R.drawable.mundo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sabiasque__aprende, menu);
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
