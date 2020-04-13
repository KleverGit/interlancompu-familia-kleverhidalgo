package com.interlancompu.familia.enums;

public enum TipoFamiliarEnum {

	PADRE(1), MADRE(2), HIJO(3);

	private final int tipoFamiliar;

	TipoFamiliarEnum(int tipoFamiliar) {
		this.tipoFamiliar = tipoFamiliar;
	}

	public int getTipoFamiliar() {
		return this.tipoFamiliar;
	}
}
