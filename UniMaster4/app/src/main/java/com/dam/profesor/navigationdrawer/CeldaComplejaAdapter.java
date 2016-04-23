package com.dam.profesor.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;


public class CeldaComplejaAdapter extends ArrayAdapter<JSONObject> {

    public CeldaComplejaAdapter(Context context, int resource, List<JSONObject> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View celda = convertView;
        if (celda == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            celda = layoutInflater.inflate(R.layout.celdacompleja, null);
        }

        final TextView nombreUsuario = (TextView) celda.findViewById(R.id.nombre);
        final TextView correo = (TextView) celda.findViewById(R.id.correo);
        NetworkImageView niv = (NetworkImageView) celda.findViewById(R.id.imagen);


        final JSONObject elemento = this.getItem(position);

        try {
            //se almacenan los campos alados en una variable
            final String id =elemento.getString("id");
            final String nombre =elemento.getString("nombre");
            final String descripcion =elemento.getString("descripcion");
            final String fecha =elemento.getString("fecha");
            final String imagen =elemento.getString("imagen");
            final String categoria = elemento.getString("categoria");
            final String edad = elemento.getString("edad");

            //se setea informacion en celda compleja
            nombreUsuario.setText(nombre);
            correo.setText(descripcion);
            niv.setImageUrl(imagen, VolleySingleton.getInstance().getM_imageLoader());



            celda.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {

                    //se manda informacion a detalle
                    Intent intent =new Intent(getContext(), detalle_persona.class);
                    intent.putExtra("id",id);
                    intent.putExtra("nombre",nombre);
                    intent.putExtra("descripcion",descripcion);
                    intent.putExtra("imagen",imagen);
                    intent.putExtra("categoria",categoria);
                    intent.putExtra("fecha",fecha);
                    intent.putExtra("edad",edad);

                    getContext().startActivity(intent);
                }
            });

        } catch (JSONException e) {         e.printStackTrace();        }

        return celda;

    }

}
