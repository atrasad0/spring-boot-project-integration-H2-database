package com.h2Database.demo.utils;

import java.util.Locale;
import java.util.TimeZone;

public class SystemConstants {
    /** O fuso-horario padrao a ser utilizado no sistema quando um valor explicito nao esta disponivel. */
    public static final TimeZone DEFAULT_TIME_ZONE = TimeZone.getTimeZone("America/Sao_Paulo");

    /** O {@link Locale} a ser utilizado no sistema quando um valor explicito nao esta disponivel. */
    public static final Locale DEFAULT_LOCALE = Locale.forLanguageTag("pt-BR");
}
