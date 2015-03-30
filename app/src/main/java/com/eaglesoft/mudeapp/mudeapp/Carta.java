package com.eaglesoft.mudeapp.mudeapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;


/**
 * Created by Tiris21 on 27/03/2015.
 */
public class Carta {
    private int elr;
    private Bitmap elbitmap;
    private Drawable elDraw;
    int parner;
    public Carta(int x, Resources r, int i){
        elr=x;
        elbitmap = BitmapFactory.decodeResource(r, elr);
        elDraw = new BitmapDrawable(r,elbitmap);
        parner=i;
    }

    public int getDrawRsc(){
        return elr;
    }

    public Drawable getElDraw(){
        return elDraw;
    }

    public int getParner(){
        return parner;
    }

}
