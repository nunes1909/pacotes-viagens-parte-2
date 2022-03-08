package com.example.pacotesviagens.ui.activity;

import static com.example.pacotesviagens.ui.activity.PacoteActivityConstantes.CHAVE_PACOTE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

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
    }

    private void configuraLista() {
        List<Pacote> pacotes = new PacoteDAO().lista();
        ListView listaDePacotes = findViewById(R.id.lista_pacotes_listview);
        listaDePacotes.setAdapter(new ListaPacotesAdapter(pacotes, this));
        listaDePacotes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicao, long id) {
                Pacote pacoteClicado = pacotes.get(posicao);
                vaiParaResumoPacote(pacoteClicado);
            }
        });
    }

    private void vaiParaResumoPacote(Pacote pacoteClicado) {
        Intent intent = new Intent(ListaPacotesActivity.this,
                ResumoPacoteActivity.class);
        //Pacote deve ser Serializable
        intent.putExtra(CHAVE_PACOTE, pacoteClicado);
        startActivity(intent);
    }
}