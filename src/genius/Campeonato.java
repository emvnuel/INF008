package genius;

import java.time.LocalDate;
import java.util.List;

public class Campeonato {

	private String titulo;
	private LocalDate data;
	private List<Jogador> jogadores;
	private Jogo jogo;
	
	public Campeonato(String titulo, List<Jogador> jogadores) {
		this.titulo = titulo;
		this.jogadores = jogadores;
		this.data = LocalDate.now();
		this.jogo = new Jogo();
	}

	public String getTitulo() {
		return titulo;
	}

	public LocalDate getData() {
		return data;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}
	
	public boolean adivinharSequencia(Jogador jogador, List<Coordenada> sequencia) {
		if (jogo.adivinharSequencia(sequencia)) {
			jogador.ganharPontos(jogo.getIndiceSequencia());
			return true;
		}
		
		return false;
	}

}
