package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAluno {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Paulo");
		alunos.add("Godoy");
		alunos.add("Fabrine");
		alunos.add("Murilo");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
			
		}
		
		//System.out.println(alunos);
	}

}
