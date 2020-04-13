package com.interlancompu.familia.entities;

import com.interlancompu.familia.enums.EstadoCivilEnum;

public class Persona {

	private String nombre;
	private String apellido;
	private String cedulaIdentidad;
	private EstadoCivilEnum estadoCivil;
	private Integer edad;
	
	public Persona() {
		
	}
	public Persona(String nombre, String apellido, String cedulaIdentidad, EstadoCivilEnum estadoCivil, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedulaIdentidad = cedulaIdentidad;
		this.estadoCivil = estadoCivil;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedulaIdentidad() {
		return cedulaIdentidad;
	}

	public void setCedulaIdentidad(String cedulaIdentidad) {
		this.cedulaIdentidad = cedulaIdentidad;
	}

	public EstadoCivilEnum getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivilEnum estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public void OnDormir() {

	}

	public void OnDespertar() {

	}

}
