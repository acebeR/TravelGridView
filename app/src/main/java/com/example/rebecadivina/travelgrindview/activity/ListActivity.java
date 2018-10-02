package com.example.rebecadivina.travelgrindview.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.rebecadivina.travelgrindview.R;
import com.example.rebecadivina.travelgrindview.adapter.AdapterListView;
import com.example.rebecadivina.travelgrindview.model.Cidade;
import com.example.rebecadivina.travelgrindview.model.Pais;

public class ListActivity extends Activity implements AdapterView.OnItemClickListener,View.OnClickListener{

    Intent intent;
    AdapterListView adapter;
    ListView listView;
    Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        intent = getIntent();
        Pais p = (Pais) intent.getSerializableExtra("objPais");



        adapter = new AdapterListView(this,p.getCidades());

        listView = findViewById(R.id.lista);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onClick(View view) {
        Button btn = findViewById(view.getId());
        if(btn != null){
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
