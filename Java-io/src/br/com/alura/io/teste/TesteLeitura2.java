package br.com.alura.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws Exception {
		
		
		Scanner ler = new Scanner(new File("contas.csv"), "UTF-8");
		
			while(ler.hasNextLine()) {
			String arquivo = ler.nextLine();
				
			Scanner linhaScanner = new Scanner(arquivo);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			
			System.out.format(new Locale("pt","br"), "%s - %04d-%08d: %s, %10.2f %n", tipoConta, agencia, numero, titular, saldo);
			
			
			
			
			
			linhaScanner.close();
			
		}
		
		
		ler.close();
	}
}
