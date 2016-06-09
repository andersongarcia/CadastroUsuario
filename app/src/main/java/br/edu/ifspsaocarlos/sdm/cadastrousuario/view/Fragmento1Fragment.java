package br.edu.ifspsaocarlos.sdm.cadastrousuario.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.edu.ifspsaocarlos.sdm.cadastrousuario.R;

public class Fragmento1Fragment extends Fragment {
    public static Fragmento1Fragment newInstance(Context context) {
        Fragmento1Fragment fragment = new Fragmento1Fragment();
        return fragment;
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_fragmento1, null);
        ((PrincipalActivity)
                getActivity()).getSupportActionBar().setSubtitle(getString(R.string.fragmento_1));
        return view;
    }
}