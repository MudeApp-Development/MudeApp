package com.eaglesoft.mudeapp.mudeapp;

/**
 * Created by JuanCarlos on 28/03/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * Created by Vicente Hernandez on 08/12/2014.
 */
public class Juegouno extends Activity implements Metodos{
    Button a,b,c;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juegouno);

        a = (Button)findViewById(R.id.respuestauno);
        b = (Button)findViewById(R.id.respuestados);
        c = (Button)findViewById(R.id.respuestatres);
    }

    @Override
    public void respuestaCorrecta(View vii) {
        b.setBackgroundColor(Color.parseColor("#d3ffce"));

        Thread splash = new Thread(){
            public void run(){
                try{
                    sleep(1100);
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    startActivity(new Intent(getApplicationContext(),Juegodos.class));
                    finish();
                }
            }
        };
        splash.start();
    }

    @Override
    public void respuestaIncorrecta(View vii) {

        a.setBackgroundColor(Color.parseColor("#ff7373"));
        c.setBackgroundColor(Color.parseColor("#ff7373"));

        Thread splash = new Thread(){
            public void run(){
                try{
                    sleep(1100);
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    startActivity(new Intent(getApplicationContext(),Juegodos.class));
                    finish();
                }
            }
        };
        splash.start();

    }

}
