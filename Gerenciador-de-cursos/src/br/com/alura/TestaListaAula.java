package br.com.alura;

import java.util.ArrayList;

public class TestaListaAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Array list", 21);
		Aula a2 = new Aula("Lista de objetos", 15);
		Aula a3 = new Aula("Relacionamento de lista e objetos.", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		System.out.println(aulas);

	}

}
