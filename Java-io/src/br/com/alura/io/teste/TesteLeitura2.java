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
			//System.out.println(arquivo);
			
//			String[] valores = arquivo.split(",");
//			System.out.println(Arrays.toString(valores));
//			
//			System.out.println(valores[3]);
			
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
