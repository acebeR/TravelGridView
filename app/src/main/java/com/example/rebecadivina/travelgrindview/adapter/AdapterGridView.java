package com.example.rebecadivina.travelgrindview.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rebecadivina.travelgrindview.R;
import com.example.rebecadivina.travelgrindview.model.Pais;

import java.util.List;

public class AdapterGridView extends BaseAdapter {

    Activity activity;
    List<Pais> list_paises;

    public AdapterGridView(Activity activity, List<Pais> list_paises) {
        this.activity = activity;
        this.list_paises = list_paises;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public List<Pais> getList_paises() {
        return list_paises;
    }

    public void setList_paises(List<Pais> list_paises) {
        this.list_paises = list_paises;
    }


    @Override
    public int getCount() {
        return list_paises.size();
    }

    @Override
    public Object getItem(int i) {
        return list_paises.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Pais pais = (Pais) getItem(i);

        view = View.inflate(activity, R.layout.grindview_layout, null);



        ImageView img = view.findViewById(R.id.img);
        TextView nome = view.findViewById(R.id.nome);

        img.setImageResource(pais.getImg());
        nome.setText(pais.getNome());

        return view;
    }

}
