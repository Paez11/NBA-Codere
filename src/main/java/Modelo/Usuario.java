package Modelo;

import interfaces.IUsuario;

import java.util.HashSet;
import java.util.Set;

public class Usuario /*implements IUsuario*/ {
	
	private String nombre;
	private Dinero dinero;
	private Set<Equipo> equipos;
	
	public static Usuario _newInstance;
	
	private Usuario() {
		this.nombre = "";
		this.dinero = new Dinero(0);
		this.equipos = new HashSet<Equipo>();
	}
	
	private Usuario(String nombre) {
		this.nombre = nombre;
		this.dinero = new Dinero(0);
		this.equipos = new HashSet<Equipo>();
	}
	
	private Usuario(String nombre, Dinero dinero) {
		this.nombre = nombre;
		this.dinero = dinero;
		this.equipos = new HashSet<Equipo>();
	}
	
	public Usuario(String nombre, Dinero dinero, HashSet<Equipo> equipos) {
		this.nombre = nombre;
		this.dinero = dinero;
		this.equipos = equipos;
	}
	
	public static Usuario newInstance() {
		if (_newInstance == null) {
			_newInstance = new Usuario();
		}
		return _newInstance;
	}
	
	public static Usuario newInstance(String nombre) {
		if (_newInstance == null) {
			_newInstance = new Usuario(nombre);
		}
		return _newInstance;
	}
	
	public static Usuario newInstance(String nombre, Dinero dinero) {
		if (_newInstance == null) {
			_newInstance = new Usuario(nombre, dinero);
		}
		return _newInstance;
	}
	
	public static Usuario newInstance(String nombre, Dinero dinero, HashSet<Equipo> equipos) {
		if (_newInstance == null) {
			_newInstance = new Usuario(nombre, dinero, equipos);
		}
		return _newInstance;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Dinero getDinero() {
		return dinero;
	}

	public void setDinero(Dinero dinero) {
		this.dinero = dinero;
	}

	public Set<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(Set<Equipo> equipos) {
		this.equipos = equipos;
	}

	public static Usuario get_newInstance() {
		return _newInstance;
	}

	public static void set_newInstance(Usuario _newInstance) {
		Usuario._newInstance = _newInstance;
	}
}
