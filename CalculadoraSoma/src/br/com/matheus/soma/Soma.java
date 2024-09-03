package br.com.matheus.soma;

public class Soma {
	 public int calcularSoma(int indice) {
	        int soma1 = 0;
	        int k2 = 1;

	        while (k2 < indice) {
	            k2 = k2 + 1;
	            soma1 = soma1 + k2;
	        }

	        return soma1;
	    }
}
