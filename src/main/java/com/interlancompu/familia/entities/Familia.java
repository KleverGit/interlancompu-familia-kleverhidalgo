package com.interlancompu.familia.entities;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.interlancompu.familia.enums.SexoEnum;
import com.interlancompu.familia.enums.TipoFamiliarEnum;

@Component
public class Familia {

	private List<Pariente> parientes;

	public Familia() {
		this.parientes = new ArrayList<Pariente>();
	}

	/**
	 * Se puede implementra metodos genericos para misma accion en addMadre,
	 * addHijo, addHija
	 * 
	 * @param sexo
	 * @param tipofamiliar
	 * @param persona
	 * @return
	 */
	private Pariente createPariente(SexoEnum sexo, TipoFamiliarEnum tipofamiliar, Persona persona) {
		Pariente p = new Pariente(sexo, tipofamiliar);
		p.setNombre(persona.getNombre());
		p.setApellido(persona.getApellido());
		p.setCedulaIdentidad(persona.getCedulaIdentidad());
		p.setEdad(persona.getEdad());
		p.setEstadoCivil(persona.getEstadoCivil());
		return p;
	}

	/**
	 * Aniador padre
	 * 
	 * @param padre
	 */
	public void addPadre(Persona padre) throws Exception {
		Pariente p = this.createPariente(SexoEnum.MASCULINO, TipoFamiliarEnum.PADRE, padre);
		List<Pariente> padres = this.parientes.stream().filter(pariente -> pariente.getSexo().equals(SexoEnum.MASCULINO)
				&& pariente.getTipoFamiliar().equals(TipoFamiliarEnum.PADRE)).collect(Collectors.toList());

		if (!CollectionUtils.isEmpty(padres) && padres.size() >= 1) {
			throw new Exception("No se puede agregar mas de un padre");
		}

		this.parientes.add(p);
	}

	public void addMadre(Persona madre) {
		Pariente p = new Pariente(SexoEnum.FEMENINO, TipoFamiliarEnum.MADRE);
		p.setNombre(madre.getNombre());
		p.setApellido(madre.getApellido());
		p.setCedulaIdentidad(madre.getCedulaIdentidad());
		p.setEdad(madre.getEdad());
		p.setEstadoCivil(madre.getEstadoCivil());
		this.parientes.add(p);
	}

	public void addHijo(Persona hijo) {
		Pariente p = new Pariente(SexoEnum.MASCULINO, TipoFamiliarEnum.HIJO);
		p.setNombre(hijo.getNombre());
		p.setApellido(hijo.getApellido());
		p.setCedulaIdentidad(hijo.getCedulaIdentidad());
		p.setEdad(hijo.getEdad());
		p.setEstadoCivil(hijo.getEstadoCivil());
		this.parientes.add(p);
	}

	public void addHija(Persona hija) {
		Pariente p = new Pariente(SexoEnum.FEMENINO, TipoFamiliarEnum.HIJO);
		p.setNombre(hija.getNombre());
		p.setApellido(hija.getApellido());
		p.setCedulaIdentidad(hija.getCedulaIdentidad());
		p.setEdad(hija.getEdad());
		p.setEstadoCivil(hija.getEstadoCivil());
		this.parientes.add(p);
	}

	public void clearFamilia() {
		this.parientes.clear();
	}

	private List<Pariente> getHijos(SexoEnum sexo) {
		return this.parientes.stream().filter(pariente -> pariente.getSexo().equals(sexo)
				&& pariente.getTipoFamiliar().equals(TipoFamiliarEnum.HIJO)).collect(Collectors.toList());
	}
	
	public Integer cuantosHijosHay() {
		List<Pariente> result = this.getHijos(SexoEnum.MASCULINO);
		return result.size();
	}

	public Pariente cualEsHermanoMayor() {
		List<Pariente> result = this.getHijos(SexoEnum.MASCULINO);
		Comparator<Pariente> compareByEdad = (Pariente o1, Pariente o2) -> o1.getEdad().compareTo(o2.getEdad());
		Collections.sort(result, compareByEdad);
		return this.parientes.get(0);
	}

	public Pariente cualEsHermanoMenor() {
		List<Pariente> result = this.getHijos(SexoEnum.MASCULINO);
		Comparator<Pariente> compareByEdad = (Pariente o1, Pariente o2) -> o1.getEdad().compareTo(o2.getEdad());
		Collections.sort(result, compareByEdad.reversed());
		return this.parientes.get(0);
	}

	public Pariente cualEsHermanaMayor() {
		List<Pariente> result = this.getHijos(SexoEnum.FEMENINO);
		Comparator<Pariente> compareByEdad = (Pariente o1, Pariente o2) -> o1.getEdad().compareTo(o2.getEdad());
		Collections.sort(result, compareByEdad);
		return this.parientes.get(0);
	}

	public Pariente cualEsHermanaMenor() {
		List<Pariente> result = this.getHijos(SexoEnum.FEMENINO);
		Comparator<Pariente> compareByEdad = (Pariente o1, Pariente o2) -> o1.getEdad().compareTo(o2.getEdad());
		Collections.sort(result, compareByEdad.reversed());
		return this.parientes.get(0);
	}

	public Integer cuantosSonHombres() {
		List<Pariente> result = this.parientes.stream()
				.filter(pariente -> pariente.getSexo().equals(SexoEnum.MASCULINO)).collect(Collectors.toList());
		return result.size();
	}

	public Integer cuantosSonMujeres() {
		List<Pariente> result = this.parientes.stream().filter(pariente -> pariente.getSexo().equals(SexoEnum.FEMENINO))
				.collect(Collectors.toList());
		return result.size();
	}

	public Pariente getPariente(Integer index) {
		return this.parientes.get(index);
	}

	public Integer getCountParientes() {
		return this.parientes.size();
	}

	public void DormirPariente() {

	}

	public void DespertarPariente() {

	}

}
