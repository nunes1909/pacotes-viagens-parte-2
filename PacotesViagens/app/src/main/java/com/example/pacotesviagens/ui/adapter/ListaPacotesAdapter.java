package com.example.pacotesviagens.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pacotesviagens.util.DiasUtil;
import com.example.pacotesviagens.util.MoedaUtil;
import com.example.pacotesviagens.R;
import com.example.pacotesviagens.util.ResourceUtil;
import com.example.pacotesviagens.model.Pacote;

import java.util.List;

public class ListaPacotesAdapter extends BaseAdapter {

    //final nao é modificado
    private final List<Pacote> copiaPacotes;
    private final Context copiaContext;

    public ListaPacotesAdapter(List<Pacote> pacotes, Context context){
        this.copiaContext = context;
        this.copiaPacotes = pacotes;
    }

    // define o tamanho da lista
    @Override
    public int getCount() {
        return copiaPacotes.size();
    }

    // devolve um item de pacotes
    @Override
    public Pacote getItem(int posicao) {
        return copiaPacotes.get(posicao);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    // metodo que implementa o layout dos itens
    @Override
    public View getView(int posicao, View view, ViewGroup viewGroup) {
        // Item view que inicializa o Layout dos itens
        View viewCriada = LayoutInflater.from(copiaContext).inflate(R.layout.item_pacote, viewGroup, false);
        Pacote pacoteBind = copiaPacotes.get(posicao);

        configuraCampoLocal(viewCriada, pacoteBind);
        configuraImagem(viewCriada, pacoteBind);
        configuraCampoDias(viewCriada, pacoteBind);
        configuraCampoPreco(viewCriada, pacoteBind);

        return viewCriada;
    }

    private void configuraCampoPreco(View viewCriada, Pacote pacoteBind) {
        TextView preco = viewCriada.findViewById(R.id.item_pacote_preco);
        String moedaBrasileira = MoedaUtil.formataParaMoedaBrasileira(pacoteBind.getPreco());
        preco.setText(moedaBrasileira);
    }

    private void configuraCampoDias(View viewCriada, Pacote pacoteBind) {
        TextView dias = viewCriada.findViewById(R.id.item_pacote_dias);
        String diasEmTexto = DiasUtil.formataEmTexto(pacoteBind.getDias());
        dias.setText(diasEmTexto);
    }

    private void configuraImagem(View viewCriada, Pacote pacoteBind) {
        ImageView imagem = viewCriada.findViewById(R.id.item_pacote_imagem);
        Drawable drawableImagemPacote = ResourceUtil.devolveDrawable(copiaContext, pacoteBind.getImagem());
        imagem.setImageDrawable(drawableImagemPacote);
    }

    private void configuraCampoLocal(View viewCriada, Pacote pacoteBind) {
        TextView local = viewCriada.findViewById(R.id.item_pacote_local);
        local.setText(pacoteBind.getLocal());
    }
}

