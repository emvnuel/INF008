package prova.q2;

import java.time.DayOfWeek;
import java.util.Objects;

public class Aula {
	
	private DayOfWeek diaDaSemana;
	private Horario horario;
	
	public Aula(DayOfWeek diaDaSemana, Horario horario) {
		this.diaDaSemana = diaDaSemana;
		this.horario = horario;
	}

	public DayOfWeek getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(DayOfWeek diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public String getDuracaoEmHoras() {
		return this.horario.getDuracaoEmHoras();
	}
	
	public String getHorarioAulaPorExtenso() {
		
		return String.format("%s, de %s até %s (%s de duração)",
					getDiaDaSemanaPtBr(),
					this.horario.getInicio(),
					this.getHorario().getFim(),
					this.getDuracaoEmHoras())+"\n";
	}
	
	private String getDiaDaSemanaPtBr() {
		switch (diaDaSemana) {
			case MONDAY:
				return "Segunda-feira";
				
			case TUESDAY:
				return "Terça-feira";
			
			case WEDNESDAY:
				return "Quarta-feira";
			
			case THURSDAY:
				return "Quinta-feira";
				
			case FRIDAY:
				return "Sexta-Feira";
			
			case SATURDAY:
				return "Sábado";
				
			case SUNDAY:
				return "Domingo";
				
			default:
				throw new IllegalStateException("Dia da semana inválido");
		}
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(diaDaSemana, horario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		return diaDaSemana == other.diaDaSemana && Objects.equals(horario, other.horario);
	}
	
	
}
