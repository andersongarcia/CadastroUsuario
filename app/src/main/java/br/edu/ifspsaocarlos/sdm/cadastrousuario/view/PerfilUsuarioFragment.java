package br.edu.ifspsaocarlos.sdm.cadastrousuario.view;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.edu.ifspsaocarlos.sdm.cadastrousuario.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilUsuarioFragment extends Fragment {
    public static NovoUsuarioFragment newInstance(Context context) {
        NovoUsuarioFragment fragment = new NovoUsuarioFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil_usuario, null);
        ((PrincipalActivity)
                getActivity()).getSupportActionBar().setSubtitle(getString(R.string.fragment_perfil_usuario));
        return view;
    }

}
