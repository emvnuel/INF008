package prova.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Disciplina {
	
	private String codigo;
	private String sigla;
	private String nome;
	private List<Aula> aulas  = new ArrayList<>();
	private Docente docente;

	public Disciplina(String codigo, String sigla, String nome, List<Aula> aulas, Docente docente) {
		this.codigo = codigo;
		this.sigla = sigla;
		this.nome = nome;
		this.aulas = aulas;
		this.docente = docente;
	}
	
	public void removerAula(Aula aula) {
		this.aulas.remove(aula);
	}

	public String getCodigo() {
		return codigo;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNomeEspacado() {
		return nome + "\n";
	}
	
	public List<Aula> getAulas() {
		return aulas;
	}
	
	public Docente getDocente() {
		return docente;
	}
	
	public String getHorarioAulasPorExtenso() {
		return this.getCodigo()+" - "+this.getNome()+ ":\n"
				+StringUtil.formatString(this.getAulas().stream().map(Aula::getHorarioAulaPorExtenso).collect(Collectors.toList()))+"\n";
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(codigo, other.codigo);
	}

}
