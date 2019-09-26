package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEcritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo
		
//		OutputStream fos = new FileOutputStream("arg2.txt");
//		Writer osr = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osr);
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("de arquivo...");
		bw.newLine();
		bw.write("Teste1");
		bw.newLine();
	
		bw.close();

	}

}
