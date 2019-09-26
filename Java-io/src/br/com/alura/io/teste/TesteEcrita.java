package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEcrita {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo
		
		OutputStream fos = new FileOutputStream("arg2.txt");
		Writer osr = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osr);
		
		bw.write("Teste de escrita de arquivo...");
		bw.newLine();
		bw.newLine();
		bw.write("jdfjsdfjsdfisdiufsdiuf fijsbfidsubfiubds");
	
		bw.close();

	}

}
