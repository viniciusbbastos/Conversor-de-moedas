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
        lista.add("eur");
        lista.add("ars");
        lista.add("gbp");
        lista.add("rub");
        return lista;
    }

    public double getListaVal(int num) {
        switch (num) {
            case 0:
                return getDolar();
            case 1:
                return getReal();
            case 2:
                return getEuro();
            case 3:
                return getPesoArgentino();
            case 4:
                return getLibra();
            case 5:
                return getRublo();
            default:
                return 0.0;
        }
    }
}
