package genius;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jogador jogador1 = new Jogador("AAAA", "aaaa");
		Jogador jogador2 = new Jogador("BBBB", "bbbb");
		
		Campeonato campeonato = new Campeonato("Campeonato I", Arrays.asList(jogador1, jogador2));
	
		System.out.println(campeonato.adivinharSequencia(jogador1, 
				Arrays.asList(new Coordenada(0, 1))));
		

	}

}
