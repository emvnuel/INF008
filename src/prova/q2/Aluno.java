package prova.q2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Aluno extends Pessoa {


	private Curso curso;
	private List<Matricula> matriculas = new ArrayList<>();

	
	public Aluno(String numeroMatricula, String nome, Curso curso) {
		super(numeroMatricula, nome);
		this.curso = curso;
	}

	public void matricular(Disciplina disciplina) {
		this.matriculas.add(new Matricula(this, disciplina, null));
	}
	
	public void lancarNota(Disciplina disciplina, Double nota) {
		this.getMatriculasComDisciplinaCursando()
			.get(this.getMatriculasComDisciplinaCursando().indexOf(new Matricula(this, disciplina, null)))
			.setNota(nota);;
	}
	
	
	public Curso getCurso() {
		return curso;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public List<Matricula> getMatriculasComDisciplinaCursando() {
		return matriculas
				.stream()
				.filter(Matricula::isDisciplinaCursando)
				.collect(Collectors.toList());
	}
	
	public List<Matricula> getMatriculasComDisciplinaConcluida() {
		return matriculas
				.stream()
				.filter(Matricula::isDisciplinaConcluida)
				.collect(Collectors.toList());
	}
	
	public List<Disciplina> getDisciplinasConcluidas() {
		return matriculas
				.stream()
				.filter(Matricula::isDisciplinaConcluida)
				.map(Matricula::getDisciplina)
				.collect(Collectors.toList());
	}
	
	public List<Disciplina> getDisciplinasPendentes() {
		
		List<Disciplina> disciplinasPendentes = new ArrayList<>(curso.getDisciplinas());
		
		for (Disciplina disciplina : new ArrayList<Disciplina>(disciplinasPendentes)) {
			for (Disciplina disciplinaConcluida : getDisciplinasConcluidas()) {
				disciplinasPendentes.remove(disciplinaConcluida);
			}
		}
		
		return disciplinasPendentes;
	}
	
	public String getDisciplinasConcluidasEPendentes() {
		String str = "DISCIPLINAS CONCLUIDAS "+this.getNome()+":\n";
		
		str += StringUtil.formatString(this.getDisciplinasConcluidas().stream().map(Disciplina::getNomeEspacado).collect(Collectors.toList()));
		
		
		str += "\nDISCIPLINAS PENDENTES "+this.getNome()+":\n";
		
		str += StringUtil.formatString(this.getDisciplinasPendentes().stream().map(Disciplina::getNomeEspacado).collect(Collectors.toList()));
		
		return str+"\n\n";
	}


	public boolean isExAluno() {
		return getNumeroDisciplinasConcluidas() == curso.getNumeroDeDisciplinas();
	}

	private int getNumeroDisciplinasConcluidas() {
		return this.getMatriculasComDisciplinaConcluida()
				.size();
	}
	
	public String getHorarioDoAlunoPorExtenso() {
		List<Disciplina> disciplinasEmAndamento = this.getMatriculasComDisciplinaCursando()
				.stream()
				.map(Matricula::getDisciplina)
				.collect(Collectors.toList());
		
		return StringUtil.formatString(disciplinasEmAndamento.stream()
				.map(Disciplina::getHorarioAulasPorExtenso)
				.collect(Collectors.toList()));
	}
	
}
