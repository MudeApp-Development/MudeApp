package com.eaglesoft.mudeapp.mudeapp;

import android.app.Dialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Galeria_Aprende extends ActionBarActivity {

    public static int acerca = 0;
    public static int agrax = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mudeapp_galeria__aprende);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_galeria__aprende, menu);
        menu.add(Menu.NONE, acerca, Menu.NONE, "Acerca De MuteApp");
        menu.add(Menu.NONE, agrax, Menu.NONE, "Agradecimientos");
        super.onCreateOptionsMenu(menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 0:
                Dialog acerca = new Dialog(Galeria_Aprende.this);
                acerca.setContentView(R.layout.acercade);
                acerca.setTitle("Acerca De MuteApp");
                acerca.show();
                break;
            case 1:
                Dialog agrade = new Dialog(Galeria_Aprende.this);
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
