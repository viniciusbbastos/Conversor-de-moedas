package br.com.alura.conversordemoedas.modelos;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    private double dolar;
    private double real;
    private double euro;
    private double pesoArgentino;
    private double libra;
    private double rublo;

    public Registro(MoedasExchageRate moedasExchageRate) {
        this.dolar = moedasExchageRate.USD();
        this.real = moedasExchageRate.BRL();
        this.euro = moedasExchageRate.EUR();
        this.pesoArgentino = moedasExchageRate.ARS();
        this.libra = moedasExchageRate.GBP();
        this.rublo = moedasExchageRate.RUB();
    }

    public double getDolar() {
        return dolar;
    }

    public double getReal() {
        return real;
    }

    public double getEuro() {
        return euro;
    }

    public double getPesoArgentino() {
        return pesoArgentino;
    }

    public double getLibra() {
        return libra;
    }

    public double getRublo() {
        return rublo;
    }

    public List<String> getLista() {
        List<String> lista = new ArrayList<>();
        lista.add("usd");
        lista.add("brl");
        lista.add("euro");
        lista.add("argentino");
        lista.add("gbp");
        lista.add("rub");
        return lista;
    }
}
