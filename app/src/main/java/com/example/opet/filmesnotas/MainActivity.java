package com.example.opet.filmesnotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Filme> filme;
    private EditText editNome;
    private Spinner spinnerNota;
    private ListView listFilme;
    private ArrayAdapter<Filme> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filme       = new ArrayList<>();
        editNome    = findViewById(R.id.editNome);
        spinnerNota = findViewById(R.id.spinnerNota);
        listFilme   = findViewById(R.id.listFilmes);
        atualizarFilmes();

    }

    private void atualizarFilmes(){
        if(adapter == null){
            adapter = new FilmeAdapter(getApplicationContext(), R.layout.filme_item, filme);
            listFilme.setAdapter(adapter);
        }else{
            adapter.notifyDataSetChanged();
        }

    }

    public void salvarFilme(View v){
        String nome = editNome.getText().toString();
        //String nota = spinnerNota.getSelectedItem().toString();
        int    nota = Integer.parseInt(spinnerNota.getSelectedItem().toString());
        Filme a = new Filme();
        a.setNome(nome);
        a.setNota(nota);

        filme.add(a);
        atualizarFilmes();
    }
}
