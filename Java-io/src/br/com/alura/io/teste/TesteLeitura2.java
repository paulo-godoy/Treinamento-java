package br.com.alura.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws Exception {
		
		
		Scanner ler = new Scanner(new File("contas.csv"));
		
		//Scanner para ler linha
		
		
		
		while(ler.hasNextLine()) {
			String arquivo = ler.nextLine();
			System.out.println(arquivo);
			
//			String[] valores = arquivo.split(",");
//			System.out.println(Arrays.toString(valores));
//			
//			System.out.println(valores[3]);
			
			Scanner linhaScanner = new Scanner(arquivo);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
			
		
			
			System.out.println("Conta: " + valor1 + " Agencia: " + valor2 + " Numero da conta: " + valor3 + " Titular: " + valor4 + " Saldo: " + valor5 );
			
			
			
			linhaScanner.close();
			
		}
		
		
		ler.close();
	}
}
