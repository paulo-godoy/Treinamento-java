package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TesteEcritaWriter {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo
		
//		OutputStream fos = new FileOutputStream("arg2.txt");
//		Writer osr = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osr);
		
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		PrintStream ps = new PrintStream("lorem2.txt");
		
		ps.println("de arquivo...");
		ps.println();
		
		ps.close();
	
		

	}

}
