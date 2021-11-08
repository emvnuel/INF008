package prova.q2;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Horario {

	private LocalTime inicio;
	private LocalTime fim;
	
	
	public Horario(LocalTime inicio, LocalTime fim) {
		this.inicio = inicio;
		this.fim = fim;
	}

	public LocalTime getInicio() {
		return inicio;
	}
	
	public LocalTime getFim() {
		return fim;
	}

	public String getDuracaoEmHoras() {
		long duracaoEmMinutis = inicio.until(fim, ChronoUnit.MINUTES);
		String minutosStr = duracaoEmMinutis % 60 == 0 ? "":" e "+(duracaoEmMinutis % 60) +" minuto(s)"; 
		
		return ""+duracaoEmMinutis / 60+ " hora(s)"+minutosStr;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fim, inicio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Horario other = (Horario) obj;
		return Objects.equals(fim, other.fim) && Objects.equals(inicio, other.inicio);
	}
	
}
