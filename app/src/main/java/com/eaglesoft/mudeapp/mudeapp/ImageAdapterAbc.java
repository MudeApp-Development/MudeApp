package com.eaglesoft.mudeapp.mudeapp;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by JuanCarlos on 28/03/2015.
 */
public class ImageAdapterAbc extends PagerAdapter{
    Context context;
    private int[] GalImages = new int[] {
            R.drawable.aed, R.drawable.bed, R.drawable.ced, R.drawable.ded, R.drawable.eed,
            R.drawable.fed, R.drawable.ged, R.drawable.hed, R.drawable.ied, R.drawable.jed,
            R.drawable.ked, R.drawable.led, R.drawable.med, R.drawable.ned, R.drawable.oed, R.drawable.ped,
            R.drawable.qed, R.drawable.red, R.drawable.sed, R.drawable.ted, R.drawable.ved,
            R.drawable.wed, R.drawable.xed, R.drawable.yed, R.drawable.zed
    };
    ImageAdapterAbc(Context context){
        this.context=context;
    }
    @Override
    public int getCount() {
        return GalImages.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ImageView) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        //int padding = context.getResources().getDimensionPixelSize(R.dimen.padding_medium);
        //imageView.setPadding(padding, padding, padding, padding);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(GalImages[position]);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }
}
