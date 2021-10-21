package com.example.listazakopow_new;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ZakupyAdapter zakupyAdapter;
    private ListaZakopow listaZakopow = new ListaZakopow();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        zakupyAdapter = new ZakupyAdapter(this, listaZakopow.produkty);
        recyclerView.setAdapter(zakupyAdapter); // łączymy z adapterem
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}