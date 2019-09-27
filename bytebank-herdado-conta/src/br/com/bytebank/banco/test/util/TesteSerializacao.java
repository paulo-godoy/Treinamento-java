package br.com.bytebank.banco.test.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException {
		String nome = "Paulo";
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		
//		oos.writeObject(nome);
//		
//		oos.close();
		
		ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		String nome = (String) ois.readObject();
		ois.close();
        System.out.println(nome);

	}

}
