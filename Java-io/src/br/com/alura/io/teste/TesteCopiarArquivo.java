package br.com.alura.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo
		
		InputStream fis = System.in;
		
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		
		OutputStream fos = new FileOutputStream("arg4.txt");
		Writer osr = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osr);
		
		String linha = br.readLine();
		
		while(linha != null && linha.isEmpty()) {
		bw.write(linha);
		bw.newLine();
		linha = br.readLine();
		}
	
		br.close();
		bw.close();

	}

}
