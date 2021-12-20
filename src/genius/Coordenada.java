package genius;

import java.util.Objects;

public class Coordenada {
	
	private final Integer x;
	private final Integer y;
	
	public Coordenada(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public Integer getY() {
		return y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = (Coordenada) obj;
		return Objects.equals(x, other.x) && Objects.equals(y, other.y);
	}

}
