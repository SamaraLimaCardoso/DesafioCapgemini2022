package br.com.samara;
/*
 * Autora: Samara Lima Cardoso
 * */
import java.util.Scanner;

public class Escada {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Qual o numero de * que deseja para a base da escada?");
		int n = s.nextInt();
		imprimeEscada(n);// chama função para imprimir escada
		qtdAsteristico(n);

	}

	public static void imprimeEscada(int n) { // função para contrução da escada
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j > (n - i)) { // so vai imprimir * se a coluna for maior que a qtd de entrada menos o indice
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static int qtdAsteristico(int n) {
		int qtd=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j > (n - i)) { // so vai imprimir * se a coluna for maior que a qtd de entrada menos o indice
					qtd++;
				}
			}
			
		}
		return qtd;
		}

}