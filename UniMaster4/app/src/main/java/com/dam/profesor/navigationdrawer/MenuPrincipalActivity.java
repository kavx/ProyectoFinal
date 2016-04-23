package com.dam.profesor.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MenuPrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void clickMensajes(View v) {
        Intent intent = new Intent(this, Mensajes.class);
        startActivity(intent);

    }

    public void clickNotas(View v) {
        Intent intent = new Intent(this, Notas.class);
        startActivity(intent);
    }

    public void clickPagar(View v) {
        Intent intent = new Intent(this,Pagar.class);
        startActivity(intent);
    }


}
