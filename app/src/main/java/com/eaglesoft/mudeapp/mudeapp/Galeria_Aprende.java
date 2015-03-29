package com.eaglesoft.mudeapp.mudeapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Galeria_Aprende extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mudeapp_galeria__aprende);
    }



    public void abecedario(View v) {
        Intent i = new Intent(this, GaleAbc.class);
        startActivity(i);
    }
    public void animal(View v) {
        Intent i = new Intent(this, GaleAnima.class);
        startActivity(i);
    }
    public void casa(View v) {
        Intent i = new Intent(this, GaleCasa.class);
        startActivity(i);
    }
    public void dias(View v) {
        Intent i = new Intent(this, GaleDias.class);
        startActivity(i);
    }

}
