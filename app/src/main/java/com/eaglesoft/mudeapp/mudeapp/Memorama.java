package com.eaglesoft.mudeapp.mudeapp;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;
import java.util.Collections;


public class Memorama extends ActionBarActivity implements View.OnClickListener {
    //
    public static  boolean selected = false;
    public Carta[] lasCartas;
    public Button[] losBtn;
    public Drawable lineaDraw;
    public int posanterior;
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorama);
        //
        losBtn = findButtons();                   // llena vector de Botones
        lasCartas = findCartas();                 // llena vector de Cartas
        Collections.shuffle(Arrays.asList(lasCartas));          // los elementos del vector se acomodan aleatoriamentes
        asignarBackGround(losBtn);                // se agrega la imagen linea en todos los botnes

        //
    }

    public Button[] findButtons() {
        Button[] b = new Button[12];

        b[0] = (Button) findViewById(R.id.Button00);
        b[1] = (Button) findViewById(R.id.Button01);
        b[2] = (Button) findViewById(R.id.Button02);
        b[3] = (Button) findViewById(R.id.Button03);
        b[4] = (Button) findViewById(R.id.Button04);
        b[5] = (Button) findViewById(R.id.Button05);
        b[6] = (Button) findViewById(R.id.Button06);
        b[7] = (Button) findViewById(R.id.Button07);
        b[8] = (Button) findViewById(R.id.Button08);
        b[9] = (Button) findViewById(R.id.Button09);
        b[10] = (Button) findViewById(R.id.Button10);
        b[11] = (Button) findViewById(R.id.Button11);


        return b;
    }

    public Carta[] findCartas() {
        Carta[] c = new Carta[12];
        //las cartas
        c[0] = new Carta(R.drawable.a, getResources(),0);
        c[1] = new Carta(R.drawable.ac, getResources(),0);
        c[2] = new Carta(R.drawable.c, getResources(),1);
        c[3] = new Carta(R.drawable.cc, getResources(),1);
        c[4] = new Carta(R.drawable.ec, getResources(),2);
        c[5] = new Carta(R.drawable.e, getResources(),2);
        c[6] = new Carta(R.drawable.i, getResources(),3);
        c[7] = new Carta(R.drawable.ic, getResources(),3);
        c[8] = new Carta(R.drawable.f, getResources(),4);
        c[9] = new Carta(R.drawable.fc, getResources(),4);
        c[10] = new Carta(R.drawable.k, getResources(),5);
        c[11] = new Carta(R.drawable.kc, getResources(),5);


        return c;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public void asignarBackGround(Button[] botones){
        //Solo asigna el fondo de cada boton al inicio
        Bitmap foto = BitmapFactory.decodeResource(getResources(), R.drawable.reves);
        lineaDraw = new BitmapDrawable(getResources(),foto);

        for(int x=0; x<botones.length; x++){
            botones[x].setBackground(lineaDraw);
        }
        //
    }

    //
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onClick(View v) {
        int pos = -1;
        int x = 0;
        while (pos==-1){
            if(v.equals(losBtn[x])){
                pos=x;
            }
            x++;
        }

        if(selected==false)
        {
            v.setBackground(lasCartas[pos].getElDraw());
            v.setEnabled(false);
            posanterior = pos;
            selected=true;
        }
        else
        {
            v.setBackground(lasCartas[pos].getElDraw());

            //delay
            Handler handler = new Handler();
            handler.postDelayed(getRun(v,pos,posanterior), 500);
        /*/
            if(lasCartas[pos].getParner() == lasCartas[posanterior].getParner()){
                v.setEnabled(false);
            }else{
                losBtn[posanterior].setBackground(lineaDraw);
                v.setBackground(lineaDraw);
                losBtn[posanterior].setEnabled(true);
            }
         /*/
            selected = false;

        }
        if (checarSiTermino()){
            Intent i =
                    new Intent(Memorama.this, Juega_Aprende.class);
            startActivity(i);
        }
        //
    }

    public Runnable getRun(final View w, final int i, final int iAnt){
        Runnable elrun;
        elrun = new Runnable() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            public void run() {

                if(lasCartas[i].getParner() == lasCartas[iAnt].getParner()){
                    w.setEnabled(false);
                }else{
                    losBtn[iAnt].setBackground(lineaDraw);
                    w.setBackground(lineaDraw);
                    losBtn[iAnt].setEnabled(true);
                }
            }
        };
        return elrun;
    }

    public boolean checarSiTermino(){
        boolean x = true;
        for (int o=0; o<losBtn.length; o++){
            if (losBtn[o].getBackground()== lineaDraw){
                x = false;
            }
        }
        return x;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_memorama, menu);
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
