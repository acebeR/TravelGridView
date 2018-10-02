package com.example.rebecadivina.travelgrindview.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.rebecadivina.travelgrindview.R;
import com.example.rebecadivina.travelgrindview.adapter.AdapterGridView;
import com.example.rebecadivina.travelgrindview.model.Cidade;
import com.example.rebecadivina.travelgrindview.model.Pais;

import java.util.ArrayList;
import java.util.List;
/*
    Aplicativo de viagem
    Primeira tela: GringView com os países
    Segunda tela: lista de fotos com informações de cada cide do país
    Terceira tela: Quando clica na pessoa, ela deve mostrar tipo um perfil da cidade
 */

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    GridView gridView;
    AdapterGridView adapter;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);

        List<Cidade> cidadesBrasil = new ArrayList<>();
        cidadesBrasil.add(new Cidade("Rio de Janeiro","Visite o pão de açucar",R.drawable.rio));
        cidadesBrasil.add(new Cidade("Brasília","Visite a Esplanada",R.drawable.brasilia));

        List<Cidade> cidadesEUA = new ArrayList<>();
        cidadesEUA.add(new Cidade("Orlando","Visite a Disney",R.drawable.disney));
        cidadesEUA.add(new Cidade("Florida","Visite as Praias",R.drawable.florida));

        List<Pais> paises = new ArrayList<>();
        paises.add( new Pais("Brasil",R.drawable.brasil,cidadesBrasil));
        paises.add( new Pais("EUA",R.drawable.eua,cidadesEUA));



        adapter = new AdapterGridView(this,paises);

        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Pais pais = (Pais) adapter.getItem(i);
        Log.d("teste ( nome )", pais.getNome().toString());

        intent = new Intent(this, ListActivity.class);
        intent.putExtra("objPais", pais);
        startActivity(intent);
    }
}
