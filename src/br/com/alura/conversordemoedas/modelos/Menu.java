package br.com.alura.conversordemoedas.modelos;

import java.util.Scanner;

public class Menu {
    public void mostrarMenu() {
        System.out.println("**************************************");
        System.out.println("** MENU **");
        System.out.println("\n1) Dolar =>> Real");
        System.out.println("2) Real =>> Dolar");
        System.out.println("3) Euro =>> Real");
        System.out.println("4) Euro =>> Dolar");
        System.out.println("5) Peso argentino =>> Real");
        System.out.println("6) Peso argentino =>> Dolar");
        System.out.println("7) Real =>> Rublo");
        System.out.println("8) Real =>> Libra");
        System.out.println("9) Libra =>> Peso Argentino");
        System.out.println("0) Sair");
        System.out.println("\n**************************************");
    }

    public String[] escolha() {
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção. ");
        opc = sc.nextInt();

        switch (opc) {
            case 1:
                return new String[] {"usd", "brl"};
            case 2:
                return new String[] {"brl", "usd"};
            case 3:
                return new String[] {"eur", "brl"};
            case 4:
                return new String[] {"eur", "usd"};
            case 5:
                return new String[] {"ars", "brl"};
            case 6:
                return new String[] {"ars", "usd"};
            case 7:
                return new String[] {"brl", "rub"};
            case 8:
                return new String[] {"brl", "gbp"};
            case 9:
                return new String[] {"gbp", "ars"};
            default:
                return new String[] {"exit", "gado"};
        }
    }

    public double perguntaValor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor? ");
        return sc.nextDouble();
    }
}
