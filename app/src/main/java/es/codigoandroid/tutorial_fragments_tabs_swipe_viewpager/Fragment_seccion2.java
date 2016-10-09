package es.codigoandroid.tutorial_fragments_tabs_swipe_viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment_seccion2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_seccion2, container, false);

        //  "Inflamos" el archivo XML correspondiente a esta sección.
        return vista;
    }

}
