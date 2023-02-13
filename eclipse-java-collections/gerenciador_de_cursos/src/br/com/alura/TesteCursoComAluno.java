package br.com.alura;

public class TesteCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 25));

		Aluno a1 = new Aluno("Rodrigo Turini", 11223);
		Aluno a2 = new Aluno("Guilherme", 44556);
		Aluno a3 = new Aluno("Mauricio", 77889);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});

		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno rodrigo = new Aluno("Rodrigo Turini", 11223);
		System.out.println("Esse é Rodrigo Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(rodrigo));
		
		// orientação a objeto:
		// System.out.println("O a1 é == ao Rodrigo Turini");
		// System.out.println(a1 == rodrigo);
		
		System.out.println("O a1 é equals ao Rodrigo Turini");
		System.out.println(a1.equals(rodrigo));
		
		// obrigatoriamente o seguinte é true:
		System.out.println(a1.hashCode() == rodrigo.hashCode());
	}
}
