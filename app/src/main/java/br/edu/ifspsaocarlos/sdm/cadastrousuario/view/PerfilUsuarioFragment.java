package br.edu.ifspsaocarlos.sdm.cadastrousuario.view;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import br.edu.ifspsaocarlos.sdm.cadastrousuario.R;
import br.edu.ifspsaocarlos.sdm.cadastrousuario.model.Usuario;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilUsuarioFragment extends Fragment {
    public static PerfilUsuarioFragment newInstance(Context context) {
        PerfilUsuarioFragment fragment = new PerfilUsuarioFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil_usuario, null);
        ((PrincipalActivity)
                getActivity()).getSupportActionBar().setSubtitle(getString(R.string.fragment_perfil_usuario));

        Bundle arguments = getArguments();
        Usuario usuario = (Usuario)arguments.getSerializable("Usuario");

        if (usuario != null) {
            TextView tvID = (TextView) view.findViewById(R.id.tv_id);
            tvID.setText(String.valueOf(usuario.getId()));

            TextView tvNome = (TextView) view.findViewById(R.id.tv_nome);
            tvNome.setText(usuario.getNome());

            TextView tvUsername = (TextView) view.findViewById(R.id.tv_username);
            tvUsername.setText(usuario.getUsername());
        }

        return view;
    }
}
