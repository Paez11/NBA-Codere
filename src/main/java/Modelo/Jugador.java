package Modelo;

public class Jugador {
	private String nombre;
	private int defensa;
	private int tiro;
	private int ritmo;
	private int pase;
	private int faltas;
	private int altura;
	
	public Jugador(String nombre, int defensa, int tiro, int ritmo, int pase, int faltas, int altura) {
		super();
		this.nombre = nombre;
		this.defensa = defensa;
		this.tiro = tiro;
		this.ritmo = ritmo;
		this.pase = pase;
		this.faltas = faltas;
		this.altura = altura;
	}
	
	public Jugador() {
		this("",0,0,0,0,0,0);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getTiro() {
		return tiro;
	}

	public void setTiro(int tiro) {
		this.tiro = tiro;
	}

	public int getRitmo() {
		return ritmo;
	}

	public void setRitmo(int ritmo) {
		this.ritmo = ritmo;
	}

	public int getPase() {
		return pase;
	}

	public void setPase(int pase) {
		this.pase = pase;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", defensa=" + defensa + ", tiro=" + tiro + ", ritmo=" + ritmo + ", pase="
				+ pase + ", faltas=" + faltas + ", altura=" + altura + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		boolean result=false;
		
		if(o!=null) {
			if(this == o) {
				result=true;
			}else if(this.getClass()==o.getClass()){
				Jugador tmp = (Jugador) o;
				if(this.nombre!=null && this.nombre.equals(tmp.nombre)) {
					result=true;
				}
			}
		}
		
		return result;
	}
}
