package genius;

import java.util.Objects;

public class Jogador {
	
	private String nome;
	private String apelido;
	private Integer pontos;
	
	public Jogador(String nome, String apelido) {
		this.nome = nome;
		this.apelido = apelido;
		this.pontos = 0;
	}
	
	public void ganharPontos(Integer pontos) {
		this.pontos += pontos;
	}

	public String getNome() {
		return nome;
	}

	public String getApelido() {
		return apelido;
	}

	public Integer getPontos() {
		return pontos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apelido, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		return Objects.equals(apelido, other.apelido) && Objects.equals(nome, other.nome);
	}
	
}
