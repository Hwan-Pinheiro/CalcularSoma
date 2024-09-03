package br.com.matheus.main;

import br.com.matheus.soma.Soma;

public class Main {

	public static void main(String[] args) {
		Soma soma = new Soma();
        int soma1 = soma.calcularSoma(12);
        System.out.println("O valor de SOMA é: " + soma1);
    }
}

