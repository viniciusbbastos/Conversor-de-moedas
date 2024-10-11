package br.com.alura.conversordemoedas.modelos;

public class Moeda {
    private double valor;
    private String descricao;
    public Moeda(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
