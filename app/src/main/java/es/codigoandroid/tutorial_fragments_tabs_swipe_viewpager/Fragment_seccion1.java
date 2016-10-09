package es.codigoandroid.tutorial_fragments_tabs_swipe_viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment_seccion1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //  "Inflamos" el archivo XML correspondiente a esta sección.
        View vista = inflater.inflate(R.layout.fragment_seccion1, container, false);

        // Y lo devolvemos
        return vista;
    }

}
