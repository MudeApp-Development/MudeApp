package com.eaglesoft.mudeapp.mudeapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Juegosiete extends Activity {

    Button g,h,i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juegosiete);

        g = (Button)findViewById(R.id.respuestasiete);
        h = (Button)findViewById(R.id.respuestaocho);
        i = (Button)findViewById(R.id.respuestanueve);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.juegosiete, menu);
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

    public void respuestaCorrecta(View view) {

        h.setBackgroundColor(Color.parseColor("#d3ffce"));

        Thread splash = new Thread(){
            public void run(){
                try{
                    sleep(1100);
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    startActivity(new Intent(getApplicationContext(),JuegoOcho.class));
                    finish();
                }
            }
        };
        splash.start();
    }


    public void respuestaIncorrecta(View view) {

        i.setBackgroundColor(Color.parseColor("#ff7373"));
        g.setBackgroundColor(Color.parseColor("#ff7373"));
        Thread splash = new Thread(){
            public void run(){
                try{
                    sleep(1100);
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    startActivity(new Intent(getApplicationContext(),JuegoOcho.class));
                    finish();
                }
            }
        };
        splash.start();
    }
}

