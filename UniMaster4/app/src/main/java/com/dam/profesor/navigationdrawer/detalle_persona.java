package com.dam.profesor.navigationdrawer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

public class detalle_persona extends AppCompatActivity {

    String id;
    String telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_persona);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        //insertar nombre
        String nombre = this.getIntent().getStringExtra("nombre");
        TextView tv = (TextView) findViewById(R.id.Titulo_detalle);
        tv.setText(nombre);

        //insertar descripcion
        String descripcion = this.getIntent().getStringExtra("descripcion");
        TextView tv1 = (TextView) findViewById(R.id.SubTitulo_detalle);
        tv1.setText(descripcion);

        //insertar imagen
        String imagen = this.getIntent().getStringExtra("imagen");
        NetworkImageView niv = (NetworkImageView) findViewById(R.id.imagen_detalle);
        niv.setImageUrl(imagen, VolleySingleton.getInstance().getM_imageLoader());

        //insertar id
        String id = this.getIntent().getStringExtra("id");
        TextView tv3 = (TextView) findViewById(R.id.id);
        tv3.setText(id);

        //insertar categoria
        String categoria = this.getIntent().getStringExtra("categoria");
        TextView tv4 = (TextView) findViewById(R.id.categoria);
        tv4.setText(categoria);

        //insertar fecha
        String fecha = this.getIntent().getStringExtra("fecha");
        TextView tv5 = (TextView) findViewById(R.id.fecha);
        tv5.setText(fecha);

        //insertar edad
        String edad = this.getIntent().getStringExtra("edad");
        TextView tv6 = (TextView) findViewById(R.id.edad);
        tv6.setText(edad);


    }



}
