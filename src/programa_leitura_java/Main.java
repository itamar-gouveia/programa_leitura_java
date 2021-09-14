package programa_leitura_java;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		String nome, idade, cidade, uf, pais;
		System.out.println("Por favor digite seu nome:");
		nome = in.nextLine();
		System.out.println("Por favor digite sua idade:");
		idade = in.nextLine();
		System.out.println("Por favor digite sua cidade:");
		cidade = in.nextLine();
		System.out.println("Por favor digite seu estado:");
		uf = in.nextLine();
		System.out.println("Por favor digite seu país:");
		pais = in.nextLine();
		
		System.out.println("-----------------------------");
		System.out.println("Seus dados");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + uf);
		System.out.println("País: " + pais);
		
		
	}
}
