package prova.q2;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		// • Criação de cursos
		Curso cursoAds = new Curso("ANÁLISE E DESENVOLVIMENTO DE SISTEMAS ", 
				Arrays.asList(new Horario(LocalTime.of(17, 00), LocalTime.of(22, 0))));
		
		Aula aula1 = new Aula(
				DayOfWeek.MONDAY, 
				new Horario(LocalTime.of(18, 40), LocalTime.of(20, 20)));
		
		Aula aula2 = new Aula(
				DayOfWeek.THURSDAY, 
				new Horario(LocalTime.of(20, 20), LocalTime.of(22, 00)));
		
		Aula aula3 = new Aula(
				DayOfWeek.FRIDAY, 
				new Horario(LocalTime.of(18, 40), LocalTime.of(20, 20)));
		
		Aula aula4 = new Aula(
				DayOfWeek.WEDNESDAY, 
				new Horario(LocalTime.of(20, 20), LocalTime.of(21, 10)));
		
		Disciplina disciplina1 = new Disciplina("INF008",
				"PROG OO", 
				"PROGRAMAÇÃO ORIENTADA A OBJETOS", 
				Arrays.asList(aula1, aula2), 
				new Docente("123", "Fred"));
		
		
		Disciplina disciplina2 = new Disciplina("INF007",
				"BD I", 
				"BANCO DE DADOS I", 
				Arrays.asList(aula3, aula4), 
				new Docente("456", "Grinaldo"));
		
	 	// Criação de cursos e respectivo conjunto de disciplina
		// • Criação, alteração e remoção de disciplinas (ex. ao nível das aulas)
		cursoAds.adicionarDisciplina(disciplina1);
		cursoAds.adicionarDisciplina(disciplina2);
		
		//• Inscrição de aluno em curso e disciplinas
		Aluno aluno1 = new Aluno("20150702020", "EMANUEL", cursoAds);
		Aluno aluno2 = new Aluno("20150702010", "FULANINHO", cursoAds);
		
		cursoAds.adicionarAluno(aluno1);
		cursoAds.adicionarAluno(aluno2);
		
		// • Inscrição de aluno em curso e disciplinas
		aluno1.matricular(disciplina1);
		aluno1.matricular(disciplina2);
		aluno2.matricular(disciplina1);
		
		// • Geração do horário do aluno
		System.out.println("HORÁRIOS DO ALUNO "+aluno1.getNome()+":");
		System.out.println(aluno1.getHorarioDoAlunoPorExtenso());
		
		System.out.println("HORÁRIOS DO ALUNO "+aluno2.getNome()+":");
		System.out.println(aluno2.getHorarioDoAlunoPorExtenso());
		
		
		// • Lançamento de notas de uma disciplina de um curso
		aluno1.lancarNota(disciplina1, 5.5);
		aluno1.lancarNota(disciplina2, 8.0);
		aluno2.lancarNota(disciplina1, 5.0);
		
		// • Listagem dos Ex-alunos
		System.out.println("EX-ALUNOS DO CURSO");
		System.out.println(cursoAds.getExAlunos());
		
// 		• Listagem dos alunos de um dado curso, indicando para cada um deles as disciplinas
//		que já concluíram e as que lhe falta concluir
		System.out.println("\nLISTAGEM DE ALUNOS:\n");
		System.out.println(cursoAds.listagemAlunos());
		

	}
}
