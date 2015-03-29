package com.eaglesoft.mudeapp.mudeapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Juegodos extends Activity implements Metodos {
    Button d,e,f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juegodos);

        d = (Button)findViewById(R.id.respuestacuatro);
        e = (Button)findViewById(R.id.respuestacinco);
        f = (Button)findViewById(R.id.respuestaseis);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.juegodos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void respuestaCorrecta(View view) {
        e.setBackgroundColor(Color.parseColor("#d3ffce"));

        Thread splash = new Thread(){
            public void run(){
                try{
                    sleep(1100);
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    startActivity(new Intent(getApplicationContext(),Juegotres.class));
                    finish();
                }
            }
        };
        splash.start();
    }

    @Override
    public void respuestaIncorrecta(View view) {
        d.setBackgroundColor(Color.parseColor("#ff7373"));
        f.setBackgroundColor(Color.parseColor("#ff7373"));

        Thread splash = new Thread(){
            public void run(){
                try{
                    sleep(1100);
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    startActivity(new Intent(getApplicationContext(),Juegotres.class));
                    finish();
                }
            }
        };
        splash.start();
    }
}
