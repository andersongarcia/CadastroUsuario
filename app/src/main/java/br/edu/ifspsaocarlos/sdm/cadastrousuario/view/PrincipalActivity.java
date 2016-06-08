package br.edu.ifspsaocarlos.sdm.cadastrousuario.view;

import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.edu.ifspsaocarlos.sdm.cadastrousuario.R;

public class PrincipalActivity extends AppCompatActivity implements View.OnClickListener {
    private FragmentManager fragmentManager;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame,
                NovoUsuarioFragment.newInstance(this)).commit();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, R.string.msg_cadastro, Toast.LENGTH_LONG);
    }
}
