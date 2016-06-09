package br.edu.ifspsaocarlos.sdm.cadastrousuario.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import br.edu.ifspsaocarlos.sdm.cadastrousuario.R;
import br.edu.ifspsaocarlos.sdm.cadastrousuario.model.Usuario;

/**
 * A simple {@link Fragment} subclass.
 */
public class NovoUsuarioFragment extends Fragment {

    public static NovoUsuarioFragment newInstance(Context context) {
        NovoUsuarioFragment fragment = new NovoUsuarioFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_novo_usuario, null);
        final PrincipalActivity activity = (PrincipalActivity) getActivity();
        activity.getSupportActionBar().setSubtitle(getString(R.string.fragment_novo_usuario));

        view.findViewById(R.id.botao_cadastrar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PerfilUsuarioFragment fragment =
                        (PerfilUsuarioFragment) activity.openFragment(R.string.fragment_perfil_usuario);

                Bundle bundle = new Bundle();
                bundle.putSerializable("Usuario", getUsuario());
                fragment.setArguments(bundle);
            }

            @NonNull
            private Usuario getUsuario() {
                Usuario usuario = new Usuario();

                String nome = ((EditText) view.findViewById(R.id.editTextNome)).getText().toString();
                String username = ((EditText) view.findViewById(R.id.editTextUsername)).getText().toString();
                String senha = ((EditText) view.findViewById(R.id.editTextSenha)).getText().toString();

                usuario.setNome(nome);
                usuario.setUsername(username);
                usuario.setSenha(senha);

                return usuario;
            }
        });
        return view;
    }
}

