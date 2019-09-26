package br.com.alura.io.teste;

import java.io.File;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws Exception {
		
		
		Scanner ler = new Scanner(new File("contas.csv"));
		String arquivo = ler.nextLine();
		
		System.out.println(arquivo);
		
		ler.close();
	}
}
