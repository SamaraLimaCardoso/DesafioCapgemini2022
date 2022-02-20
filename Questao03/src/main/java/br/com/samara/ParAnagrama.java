package br.com.samara;
/*
 * Autora: Samara Lima Cardoso
 * */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

public class ParAnagrama {
    static final int MAX = 256;

    // Função para retornar true se o conteúdo de arr1[] e arr2[] são iguais, caso contrário falso.
    static boolean compare(char arr1[], char arr2[]) {
        for (int i = 0; i < MAX; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

// Função para procurar todas as permutações dos padrões no texto inserido pelo usuario
    static int[] indicesAnagramas(String pat, String txt) {
        int[] armazenaIndice = new int[txt.length()];
        int M = pat.length(); //recebe o tamanho do padrão a ser procurado
        int N = txt.length(); //recebe o tamanho do padrão onde o padrão vai ser procurado
        int tam = 0; // variavel que vai serir  de indice para o vetor armazenaIndice

        char[] countP = new char[MAX];
        char[] countTW = new char[MAX];
        for (int i = 0; i < M; i++) {
            (countP[pat.charAt(i)])++; // contPadrao[]: Armazena a frequencia de todos caracteres do padrão
            (countTW[txt.charAt(i)])++; // contTexto[]: Armazena a frequencia de todos caracteres do texto
        }

        // Percorre os caracteres restantes padrão
        for (int i = M; i < N; i++) {
            // Compara contagens da janela atual de texto com contagens de padrão[]
            if (compare(countP, countTW)) {
                armazenaIndice[tam] = i - M; //caso forem iguais o vetor armazenaIdice recebe o indice inicial do anagrama
                //System.out.print(armazenaIndice[tam]);
                tam++; // incremeta para o proximo indice ser armazenado no lugar certo
            }

            (countTW[txt.charAt(i)])++; // Adiciona um caractere atual à janela atual para comparação
            countTW[txt.charAt(i - M)]--; //Reduz um caractere atual à janela atual para comparação
        }

        // Compara a última janela no texto
        if (compare(countP, countTW)) {
            armazenaIndice[tam] = N - M; //caso forem iguais o vetor armazenaIdice recebe o indice inicial do anagrama
            //System.out.print(armazenaIndice[tam]);
            tam++;
        }
        armazenaIndice = Arrays.copyOf(armazenaIndice, tam);// redimensiona o vetor armazenaIndice
        //System.out.println(Arrays.toString(armazenaIndice));
        return armazenaIndice;
    }
// Função para gerar SubStrings da String que foi inserida pelo usuario

    static String[] gerarSubstring(String texto) {
        int tam = 0;
        String[] subString = new String[texto.length() * texto.length()]; // Criação de array de Strings para receber as substrings que serão geradas
        //Geração das substrings e armazenamento das mesma no vetor acima
        for (int i = 0; i < texto.length(); i++) {
            for (int j = i + 1; j <= texto.length(); j++) {
                subString[tam] = texto.substring(i, j);
                tam++;// variavel para saber o tamanho do vetor
            }
        }
        subString = Arrays.copyOf(subString, tam); //faz uma copia do proprio vetor porem com o tamanho definido por tam
        return subString; // retorna o vetor de substrings
    }

    static int qtd_pares(String[] subString, String texto) {
        int[] auxVetIndice = new int[subString.length * subString.length]; //vetor auxiliar para verificação do tamanho do vetor do anagrama
        int Qtd_Par = 0; //contador
        for (int i = 0; i < subString.length; i++) {
            auxVetIndice = indicesAnagramas(subString[i], texto); // vetor ira receber o vetor de indices dos anagramas encontrados na função search
            if (auxVetIndice.length > 1) {
                Qtd_Par++; // caso tenha mais de um indice a qtd sera incremetada
                //System.out.println(Arrays.toString(auxVetIndice));
            }
        }
        return Qtd_Par / 2; // divide por dois pois são pares
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual palavra vc deseja analisar? :");
        String texto = s.next();
        String[] subString = gerarSubstring(texto); //subString recebe as substrings geradas mesmo contento repetição;
        //System.out.println(Arrays.toString(subString));
        System.out.println(qtd_pares(subString, texto));//exibe o retorno da função que calcula a quantidade de pares de anagramas

    }
}