package br.edu.ifspsaocarlos.sdm.cadastrousuario.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.edu.ifspsaocarlos.sdm.cadastrousuario.R;

public class Fragmento2Fragment extends Fragment {
    public static Fragmento2Fragment newInstance(Context context) {
        Fragmento2Fragment fragment = new Fragmento2Fragment();
        return fragment;
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_fragmento2, null);
        ((PrincipalActivity)
                getActivity()).getSupportActionBar().setSubtitle(getString(R.string.fragmento_2));
        return view;
    }
}