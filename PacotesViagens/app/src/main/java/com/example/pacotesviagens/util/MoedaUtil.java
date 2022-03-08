package com.example.pacotesviagens.util;

import androidx.annotation.NonNull;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

    public static final String LINGUAGEM = "pt";
    public static final String BRASIL = "br";
    public static final String FORMATO_PADRAO = "R$";
    public static final String FORMATO_DESEJADO = "R$ ";

    @NonNull
    public static String formataParaMoedaBrasileira(BigDecimal valor) {
        NumberFormat formatoBrasileiro = DecimalFormat.getCurrencyInstance(new Locale(LINGUAGEM, BRASIL));
        String moedaBrasileira = formatoBrasileiro.format(valor).replace(FORMATO_PADRAO, FORMATO_DESEJADO);
        return moedaBrasileira;
    }
}
