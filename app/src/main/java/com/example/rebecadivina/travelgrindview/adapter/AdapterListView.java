package com.example.rebecadivina.travelgrindview.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rebecadivina.travelgrindview.R;
import com.example.rebecadivina.travelgrindview.model.Cidade;

import java.util.List;

public class AdapterListView extends BaseAdapter {

    Activity activity;
    List<Cidade> cidades;

    public AdapterListView(Activity activity, List<Cidade> cidades) {
        this.activity = activity;
        this.cidades = cidades;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public int getCount() {
       return cidades.size();
    }

    @Override
    public Object getItem(int i) {
        return cidades.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Cidade cidade = cidades.get(i);

        view = View.inflate(activity, R.layout.layout_list,null);

        TextView nome = view.findViewById(R.id.nome);
        TextView descricao = view.findViewById(R.id.descricao);
        ImageView img = view.findViewById(R.id.foto);

        nome.setText(cidade.getNome());
        descricao.setText(cidade.getDescricao());
        img.setImageResource(cidade.getImg());

        return view;
    }
}
