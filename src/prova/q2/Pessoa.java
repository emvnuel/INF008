package prova.q2;

import java.util.Objects;

public abstract class Pessoa {

	private String numeroMatricula;
	private String nome;
	
	public Pessoa(String numeroMatricula, String nome) {
		this.numeroMatricula = numeroMatricula;
		this.nome = nome;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroMatricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(numeroMatricula, other.numeroMatricula);
	}
	
}
