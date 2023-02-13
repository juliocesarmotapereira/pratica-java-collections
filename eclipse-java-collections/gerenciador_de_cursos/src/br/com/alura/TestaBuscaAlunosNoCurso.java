package br.com.alura;

public class TestaBuscaAlunosNoCurso {

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
		
		System.out.println("Quem é o alun 77889");
		Aluno aluno = javaColecoes.buscaMatriculado(7788);
		System.out.println("aluno: " + aluno);
	}
}
