package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

//		Set<String> alunos = new HashSet<>();
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo");
		alunos.add("Alberto");
		alunos.add("Nico");
		alunos.add("Sergio");
		alunos.add("Renan");
		alunos.add("Mauricio");
		
		boolean paulosEstaMatriculado = alunos.contains("Paulo");
		alunos.remove("Sergio");
		System.out.println(paulosEstaMatriculado);
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
	}
}
