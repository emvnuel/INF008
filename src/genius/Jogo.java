package genius;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Jogo {

	private List<Coordenada> sequenciaSorteada;
	private Integer indiceSequencia;
	
	public Jogo() {
		this.indiceSequencia = 1;
		sortearSequencia();
	}
	
	public boolean adivinharSequencia(List<Coordenada> sequencia) {
		if (this.sequenciaSorteada.equals(sequencia)) {
			indiceSequencia++;
			sortearSequencia();
			return true;
		}
		
		this.indiceSequencia = 1;
		sortearSequencia();
		return false;
	}

	private void sortearSequencia() {
		sequenciaSorteada = new ArrayList<Coordenada>();
		for (int i = 0; i < indiceSequencia; i++) {
			sequenciaSorteada.add(new Coordenada(new Random().nextInt(3), new Random().nextInt(3)));
		}
	}
	
	public Integer getIndiceSequencia() {
		return indiceSequencia;
	}

}
