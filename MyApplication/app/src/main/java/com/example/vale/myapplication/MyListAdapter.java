package com.example.vale.myapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by vale on 1/02/17.
 */
public class MyListAdapter extends BaseAdapter {

    private Context context;
    private static int [] lista_dibujos = {R.string.accesible, R.string.alarma, R.string.androide, R.string.check, R.string.salida, R.string.setting, R.string.tarjeta, R.string.tresD};
    private Typeface typeface;

    public MyListAdapter (Context context)
    {
        this.context = context;
        typeface = Typeface.createFromAsset(context.getAssets(),"MaterialIcons-Regular.ttf");

    }

    @Override
    public int getCount() {
        return lista_dibujos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;

            if (convertView==null)
            {
                Activity a = (Activity)context;
                LayoutInflater li = a.getLayoutInflater();
                view = li.inflate(R.layout.fila,parent, false);

            } else
                {
                    view = convertView;
                }

            TextView tv = (TextView)view.findViewById(R.id.texto);
            tv.setTypeface(typeface);
            tv.setText(lista_dibujos[position]);

        return view;
    }
}
