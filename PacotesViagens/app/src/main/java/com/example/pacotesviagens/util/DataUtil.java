package com.example.pacotesviagens.util;

import androidx.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {

    public static final String DIA_E_MES = "dd/MM";

    @NonNull
    public static String periodoEmTexto(int dias) {
        Calendar dataIda = Calendar.getInstance();
        Calendar dataVolta = Calendar.getInstance();
        dataVolta.add(Calendar.DATE, dias);
        SimpleDateFormat formatoDataBrasileira = new SimpleDateFormat(DIA_E_MES);
        String dataIdaFormatada = formatoDataBrasileira.format(dataIda.getTime());
        String dataVoltaFormatada = formatoDataBrasileira.format(dataVolta.getTime());
        String dataPacoteFormatada = dataIdaFormatada + " - " + dataVoltaFormatada + " de " + dataVolta.get(Calendar.YEAR);
        return dataPacoteFormatada;
    }
}
