package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cursos {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> aluno = new HashSet<>();
	
	
	public List<Aula> getAulas(){
		return Collections.unmodifiableList(aulas);
	}
	
	
	
	public Cursos(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
		
	}
	
	public void getTempoTotal() {
		int tempoTotal = 0;
		
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
			
		}
	}

}
