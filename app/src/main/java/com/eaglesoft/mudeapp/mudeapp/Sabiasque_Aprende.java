package com.eaglesoft.mudeapp.mudeapp;

import android.app.Dialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class Sabiasque_Aprende extends ActionBarActivity {

    public static int acerca = 0;
    public static int agrax = 1;
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
        menu.add(Menu.NONE, acerca, Menu.NONE, "Acerca De MuteApp");
        menu.add(Menu.NONE, agrax, Menu.NONE, "Agradecimientos");
        super.onCreateOptionsMenu(menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 0:
                Dialog acerca = new Dialog(Sabiasque_Aprende.this);
                acerca.setContentView(R.layout.acercade);
                acerca.setTitle("Acerca De MuteApp");
                acerca.show();
                break;
            case 1:
                Dialog agrade = new Dialog(Sabiasque_Aprende.this);
                agrade.setContentView(R.layout.agradecimientos);
                agrade.setTitle("Agradecimientos");
                agrade.show();
                break;
            default:
                super.onOptionsItemSelected(item);

        }
        return super.onOptionsItemSelected(item);
    }
}
