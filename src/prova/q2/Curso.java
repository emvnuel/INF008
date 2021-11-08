package prova.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Curso {
	
	private String nome;
	private List<Horario> horarios;
	private List<Disciplina> disciplinas = new ArrayList<>();;
	private List<Aluno> alunos = new ArrayList<>();
	
	public Curso(String nome, List<Horario> horarios) {
		this.nome = nome;
		this.horarios = horarios;
	}
	
	public void adicionarDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void remover(Disciplina disciplina) {
		this.disciplinas.remove(disciplina);
	}

	public String getNome() {
		return nome;
	}

	public List<Horario> getHorarios() {
		return horarios;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public int getNumeroDeDisciplinas() {
		return disciplinas.size();
	}
	
	public String getExAlunos() {
		return StringUtil.formatString(this.alunos.stream()
				.filter(Aluno::isExAluno)
				.map(Aluno::getNome)
				.collect(Collectors.toList()));
	}

	public String listagemAlunos() {
		return StringUtil.formatString(this.alunos
				.stream()
				.map(Aluno::getDisciplinasConcluidasEPendentes)
				.collect(Collectors.toList()));
	}
}
