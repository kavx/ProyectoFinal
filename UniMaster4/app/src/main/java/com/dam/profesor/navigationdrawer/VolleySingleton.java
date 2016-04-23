package com.dam.profesor.navigationdrawer;

import android.content.Context;
import android.graphics.Bitmap;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;


public class VolleySingleton {
    private static VolleySingleton m_instance;
    private RequestQueue m_requestQueue;
    private ImageLoader m_imageLoader;
    private Context m_context;

    private VolleySingleton() {}

    private VolleySingleton(Context context){
        m_context=context;
        m_requestQueue= Volley.newRequestQueue(context);
        m_imageLoader=new ImageLoader(m_requestQueue, new ImageLoader.ImageCache() {
            private final android.util.LruCache<String, Bitmap>
                    cache = new android.util.LruCache<String, Bitmap>(20);
            @Override
            public Bitmap getBitmap(String url) {
                return cache.get(url);
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap) {
                cache.put(url, bitmap);
            }
        });
    }



    public static VolleySingleton getInstance(){

        if(m_instance==null){
            return m_instance=new VolleySingleton(lista_Notas.getContext());
        }
        return m_instance;
    }

    public RequestQueue getM_requestQueue(){
        return this.m_requestQueue;
    }

    public ImageLoader getM_imageLoader(){
        return m_imageLoader;
    }
}