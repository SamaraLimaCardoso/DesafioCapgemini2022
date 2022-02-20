package br.com.samara;
/*
 * Autora: Samara Lima Cardoso
 * */
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ParAnagramaTest {

	//METODO DE TESTE PARA A MAIN
	@Test
	public void testMain() {
		String entrada ="ovo";
		int esperado=2;
		String [] subStrings = ParAnagrama.gerarSubstring(entrada);
		int obtido = qtd_pares(subStrings, entrada);
		assertEquals(esperado,obtido);
	}
	
	
	
    static final int MAX = 256;
    // Fun��o para retornar true se o conte�do de arr1[] e arr2[] s�o iguais, caso contr�rio falso.
    static boolean compare(char arr1[], char arr2[]) {
        for (int i = 0; i < MAX; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

// Fun��o para procurar todas as permuta��es dos padr�es no texto inserido pelo usuario
    static int[] indicesAnagramas(String pat, String txt) {
        int[] armazenaIndice = new int[txt.length()];
        int M = pat.length(); //recebe o tamanho do padr�o a ser procurado
        int N = txt.length(); //recebe o tamanho do padr�o onde o padr�o vai ser procurado
        int tam = 0; // variavel que vai serir  de indice para o vetor armazenaIndice

        char[] countP = new char[MAX];
        char[] countTW = new char[MAX];
        for (int i = 0; i < M; i++) {
            (countP[pat.charAt(i)])++; // contPadrao[]: Armazena a frequencia de todos caracteres do padr�o
            (countTW[txt.charAt(i)])++; // contTexto[]: Armazena a frequencia de todos caracteres do texto
        }

        // Percorre os caracteres restantes padr�o
        for (int i = M; i < N; i++) {
            // Compara contagens da janela atual de texto com contagens de padr�o[]
            if (compare(countP, countTW)) {
                armazenaIndice[tam] = i - M; //caso forem iguais o vetor armazenaIdice recebe o indice inicial do anagrama
                //System.out.print(armazenaIndice[tam]);
                tam++; // incremeta para o proximo indice ser armazenado no lugar certo
            }

            (countTW[txt.charAt(i)])++; // Adiciona um caractere atual � janela atual para compara��o
            countTW[txt.charAt(i - M)]--; //Reduz um caractere atual � janela atual para compara��o
        }

        // Compara a �ltima janela no texto
        if (compare(countP, countTW)) {
            armazenaIndice[tam] = N - M; //caso forem iguais o vetor armazenaIdice recebe o indice inicial do anagrama
            //System.out.print(armazenaIndice[tam]);
            tam++;
        }
        armazenaIndice = Arrays.copyOf(armazenaIndice, tam);// redimensiona o vetor armazenaIndice
        //System.out.println(Arrays.toString(armazenaIndice));
        return armazenaIndice;
    }
// Fun��o para gerar SubStrings da String que foi inserida pelo usuario

    static int qtd_pares(String[] subString, String texto) {
        int[] auxVetIndice = new int[subString.length * subString.length]; //vetor auxiliar para verifica��o do tamanho do vetor do anagrama
        int Qtd_Par = 0; //contador
        for (int i = 0; i < subString.length; i++) {
            auxVetIndice = indicesAnagramas(subString[i], texto); // vetor ira receber o vetor de indices dos anagramas encontrados na fun��o search
            if (auxVetIndice.length > 1) {
                Qtd_Par++; // caso tenha mais de um indice a qtd sera incremetada
                //System.out.println(Arrays.toString(auxVetIndice));
            }
        }
        return Qtd_Par / 2; // divide por dois pois s�o pares
    }

}
