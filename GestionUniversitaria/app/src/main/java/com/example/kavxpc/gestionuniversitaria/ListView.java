package com.example.kavxpc.gestionuniversitaria;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by Cesar on 21/04/2016.
 */
public class ListView extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mensajes);

        String [] mensajes= {"mensaje1","mensaje2","mensaje3","mensaje4","mensaje5"};
        ArrayAdapter <String> adapter= new ArrayAdapter<String>(getListView().getContext(),android.R.layout.simple_list_item_1,mensajes);
        getListView().setAdapter(adapter);
    }
}
