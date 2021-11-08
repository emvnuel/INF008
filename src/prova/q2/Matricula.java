package prova.q2;

import java.util.Objects;

public class Matricula {

	private Aluno aluno;
	private Disciplina disciplina;
	private Double nota;
	
	public Matricula(Aluno aluno, Disciplina disciplina, Double nota) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.nota = nota;
	}
	public boolean isDisciplinaConcluida() {
		return this.nota != null;
				//&& nota >= 6;
	}
	public boolean isDisciplinaCursando() {
		return !isDisciplinaConcluida();
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(aluno, disciplina);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matricula other = (Matricula) obj;
		return Objects.equals(aluno, other.aluno) && Objects.equals(disciplina, other.disciplina);
	}

}
