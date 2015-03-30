package com.eaglesoft.mudeapp.mudeapp;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Juega_Aprende extends ActionBarActivity {
    ImageButton btnMemorama;
    public static int acerca = 0;
    public static int agrax = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mudeapp_juega__aprende);
        btnMemorama = (ImageButton) findViewById(R.id.imageButton);
        btnMemorama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(Juega_Aprende.this, Memorama.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_juega__aprende, menu);
        menu.add(Menu.NONE, acerca, Menu.NONE, "Acerca De MuteApp");
        menu.add(Menu.NONE, agrax, Menu.NONE, "Agradecimientos");
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 0:
                Dialog acerca = new Dialog(Juega_Aprende.this);
                acerca.setContentView(R.layout.acercade);
                acerca.setTitle("Acerca De MuteApp");
                acerca.show();
                break;
            case 1:
                Dialog agrade = new Dialog(Juega_Aprende.this);
                agrade.setContentView(R.layout.agradecimientos);
                agrade.setTitle("Agradecimientos");
                agrade.show();
                break;
            default:
                super.onOptionsItemSelected(item);

        }
        return super.onOptionsItemSelected(item);
    }

    public void test(View view){
        Intent i = new Intent(this, Juegouno.class);
        startActivity(i);
    }

}
