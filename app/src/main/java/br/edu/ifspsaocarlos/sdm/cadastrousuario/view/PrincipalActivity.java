package br.edu.ifspsaocarlos.sdm.cadastrousuario.view;

import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import br.edu.ifspsaocarlos.sdm.cadastrousuario.R;

public class PrincipalActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView drawerList;
    private FragmentManager fragmentManager;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerList = (ListView) findViewById(R.id.left_drawer);
        drawerList.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.lista_menu)));
        drawerList.setOnItemClickListener(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                null,
                R.string.abrir_drawer,
                R.string.fechar_drawer
        );
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame,
                Fragmento1Fragment.newInstance(this)).commit();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView textView = (TextView) view;
        if (textView.getText().toString().equals(getString(R.string.fragmento_1))) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,
                    Fragmento1Fragment.newInstance(this)).commit();
        }
        else {
            if (textView.getText().toString().equals(getString(R.string.fragmento_2))) {
                fragmentManager.beginTransaction().replace(R.id.content_frame,
                        Fragmento2Fragment.newInstance(this)).commit();
            }
            else {
                if (textView.getText().toString().equals(getString(R.string.fragment_novo_usuario))) {
                    fragmentManager.beginTransaction().replace(R.id.content_frame,
                            NovoUsuarioFragment.newInstance(this)).commit();
                }
            }
        }
        drawerLayout.closeDrawers();
    }
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public Fragment openFragment(int fragmentId) {
        Fragment fragment = null;

        switch (fragmentId){
            case R.string.fragment_perfil_usuario:
                fragment = PerfilUsuarioFragment.newInstance(this);
                fragmentManager.beginTransaction().replace(R.id.content_frame,
                        fragment).commit();
                break;
        }

        return fragment;
    }
}
