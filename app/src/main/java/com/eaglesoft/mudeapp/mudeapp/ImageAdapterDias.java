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
public class ImageAdapterDias extends PagerAdapter{
    Context context;
    private int[] GalImages = new int[] {
            R.drawable.lunesed, R.drawable.martesed, R.drawable.miercolesed, R.drawable.juevesed, R.drawable.viernesed,
            R.drawable.sabadoed, R.drawable.domingoed, R.drawable.eneroed, R.drawable.febreroed, R.drawable.marzoed,
            R.drawable.abriled, R.drawable.mayoed, R.drawable.junioed, R.drawable.julioed, R.drawable.agostoed, R.drawable.septiembreed,
            R.drawable.octubreed, R.drawable.noviembreed, R.drawable.diciembreed
    };
    ImageAdapterDias(Context context){
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
