package com.eaglesoft.mudeapp.mudeapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Vicente Hernandez on 28/03/2015.
 */
public class SlidePageFragmentJuego extends Fragment {
    private static final String BACKGROUND_COLOR = "color";

    /**
     * Key to insert the index page into the mapping of a Bundle.
     */
    private static final String INDEX = "index";
    private static final String IMAGE = "image";
    private static final String TEXTO = "texto";

    private int color;
    private int index;
    private int image;
    private String texto;

    public static SlidePageFragmentJuego newInstance(int color, int index, int image, String texto) {

        // Instantiate a new fragment
        SlidePageFragmentJuego fragmentdos = new SlidePageFragmentJuego();

        // Save the parameters
        Bundle bundle = new Bundle();
        bundle.putInt(BACKGROUND_COLOR, color);
        bundle.putInt(INDEX, index);
        bundle.putInt(IMAGE, image);
        bundle.putString(TEXTO, texto);
        fragmentdos.setArguments(bundle);
        fragmentdos.setRetainInstance(true);

        return fragmentdos;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Load parameters when the initial creation of the fragment is done
        this.color = (getArguments() != null) ? getArguments().getInt(
                BACKGROUND_COLOR) : Color.GRAY;
        this.index = (getArguments() != null) ? getArguments().getInt(INDEX)
                : -1;
        this.image = (getArguments() != null) ? getArguments().getInt(IMAGE)
                : -1;
        this.texto = (getArguments() != null) ? getArguments().getString(TEXTO)
                : "";

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_juego, container, false);

        // Show the current page index in the view
        TextView tvIndex = (TextView) rootView.findViewById(R.id.tvIndexdos);
        ImageView imagen = (ImageView) rootView.findViewById(R.id.imagendos);

        tvIndex.setText(this.texto);
        imagen.setImageResource(this.image);

        // Change the background color
        rootView.setBackgroundColor(this.color);

        return rootView;

    }
}
