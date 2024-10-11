package br.com.alura.conversordemoedas.calculos;

import br.com.alura.conversordemoedas.modelos.Registro;

public class Conversor {
    private Registro registro;
    public Conversor(Registro registro) {
        this.registro = registro;
    }

    public double converte(String[] sigla, double valor) {
        int recebida = 0, saida = 0;
        double resultado = 0;
        for (int i = 0; i < registro.getLista().size(); i++) {
            if (registro.getLista().get(i).equals(sigla[0])) {
                recebida = i;
                for (int j = 0; j < registro.getLista().size(); j++) {
                    if (registro.getLista().get(j).equals(sigla[1])) {
                        saida = j;
                    }
                }
            }
        }
        resultado = (valor / registro.getListaVal(recebida)) * registro.getListaVal(saida);
        return resultado / valor;
    }
}
