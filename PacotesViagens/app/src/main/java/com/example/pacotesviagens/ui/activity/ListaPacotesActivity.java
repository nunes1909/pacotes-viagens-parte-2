package com.example.pacotesviagens.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.example.pacotesviagens.R;
import com.example.pacotesviagens.dao.PacoteDAO;
import com.example.pacotesviagens.model.Pacote;
import com.example.pacotesviagens.ui.adapter.ListaPacotesAdapter;

import java.util.List;

public class ListaPacotesActivity extends AppCompatActivity {

    public static final String TITULO_APP_BAR = "Pacotes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);
        //CTRL + ALT + C
        setTitle(TITULO_APP_BAR);

        //CTRL + ALT + M
        configuraLista();
        Intent intent = new Intent(this, ResumoPacoteActivity.class);
        startActivity(intent);
    }

    private void configuraLista() {
        List<Pacote> pacotes = new PacoteDAO().lista();
        ListView listaDePacotes = findViewById(R.id.lista_pacotes_listview);
        listaDePacotes.setAdapter(new ListaPacotesAdapter(pacotes, this));
    }
}