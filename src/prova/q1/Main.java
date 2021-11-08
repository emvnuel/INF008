package prova.q1;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a área do campo de futebol em metros quadrados:\n");
		double valorDigitado = sc.nextDouble();
		
		ConversaoDeUnidadesDeArea conversaoDeUnidadesDeArea = new ConversaoDeUnidadesDeArea(valorDigitado);
		conversaoDeUnidadesDeArea.imprimirValores();
		
		sc.close();
	}

}
