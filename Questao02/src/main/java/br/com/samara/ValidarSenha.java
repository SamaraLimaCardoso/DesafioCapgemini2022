package br.com.samara;
/*
 * Autora: Samara Lima Cardoso
 * */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

public class ValidarSenha {

	public static void main(String[] args) {
		System.out.println("=========================================================================");
		System.out.println("                   FACA SEU CADASTRO NA REDE SOCIAL                      ");
		System.out.println("=========================================================================");
		Scanner s = new Scanner(System.in);
		System.out.print("Nome de Usuario: ");
		String userNome = s.next();

		while (true) {
			s = new Scanner(System.in);
			System.out.print("Digite sua senha: ");
			String senha = s.next();

			if (verificaSenha(senha)) {// caso a função retone true a senha ta dentro dos criterios
				System.out.println("Cadastro Realizado com sucesso!!");
				break;
			} else {
				System.out.println("Senha Invalida");			
				System.out.println("Sugestão para acrescentar: ");
				CarcteresFaltosos(senha);// função da sugestão para deixar a senha mais forte
				if (senha.length() < 6) { // caso a senha tenha menos de 6 caracteres					
					System.out.println("Faltam " + qtdFalta(senha) + " Caracteres");
				}
			}
		}
	}
	
	public static int qtdFalta(String senha) {
		return 6 - senha.length(); // variavel que amazena caracteres faltantes
	}

	// função que vai verificar se a senha possui todos os atributos usando regex
	public static boolean verificaSenha(String senha) {
		// Verifica se possui letra maiuscula
		Pattern pattern_LMaiuscula = Pattern.compile("[A-Z]");
		Matcher matcher_LMaiuscula = pattern_LMaiuscula.matcher(senha);
		if (matcher_LMaiuscula.find() == false) {
			return false;
		}
		// Verifica se possui letra minuscula
		Pattern pattern_lMinuscula = Pattern.compile("[a-z]");
		Matcher matcher_lMinuscula = pattern_lMinuscula.matcher(senha);
		if (matcher_lMinuscula.find() == false) {
			return false;
		}
		// Verifica se possui um digito
		Pattern pattern_Digito = Pattern.compile("[0-9]");
		Matcher matcher_Digito = pattern_Digito.matcher(senha);
		if (matcher_Digito.find() == false) {
			return false;
		}
		// Verifica se possui caractere especial
		Pattern pattern_Caractere = Pattern.compile("[@#$%^&+=]");
		Matcher matcher_Caractere = pattern_Caractere.matcher(senha);
		if (matcher_Caractere.find() == false) {
			return false;
		}
		return true;
	}

	public static void CarcteresFaltosos(String senha) {
		// Verifica se possui letra maiuscula e sugere um caractere
		Pattern pattern_LMaiuscula = Pattern.compile("[A-Z]");
		Matcher matcher_LMaiuscula = pattern_LMaiuscula.matcher(senha);
		if (matcher_LMaiuscula.find() == false) {
			System.out.println("LNF");
		}
		// Verifica se possui letra minuscula e sugere um caractere
		Pattern pattern_lMinuscula = Pattern.compile("[a-z]");
		Matcher matcher_lMinuscula = pattern_lMinuscula.matcher(senha);
		if (matcher_lMinuscula.find() == false) {
			System.out.println("uff");
		}
		// Verifica se possui um digito e sugere um caractere
		Pattern pattern_Digito = Pattern.compile("[0-9]");
		Matcher matcher_Digito = pattern_Digito.matcher(senha);
		if (matcher_Digito.find() == false) {
			System.out.println("354");
		}
		// Verifica se possui caractere especial e sugere um caractere
		Pattern pattern_Caractere = Pattern.compile("[@#$%^&+=]");
		Matcher matcher_Caractere = pattern_Caractere.matcher(senha);
		if (matcher_Caractere.find() == false) {
			System.out.println("@45");
		}

	}

}
