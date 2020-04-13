package com.interlancompu.familia.entities;

import com.interlancompu.familia.enums.SexoEnum;
import com.interlancompu.familia.enums.TipoFamiliarEnum;

public class Pariente extends Persona {

	private SexoEnum sexo;

	private TipoFamiliarEnum tipoFamiliar;

	Pariente(SexoEnum sexo, TipoFamiliarEnum tipoFamiliar) {
		this.sexo = sexo;
		this.tipoFamiliar = tipoFamiliar;
	}

	public SexoEnum getSexo() {
		return sexo;
	}

	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}

	public TipoFamiliarEnum getTipoFamiliar() {
		return tipoFamiliar;
	}

	public void setTipoFamiliar(TipoFamiliarEnum tipoFamiliar) {
		this.tipoFamiliar = tipoFamiliar;
	}

}
