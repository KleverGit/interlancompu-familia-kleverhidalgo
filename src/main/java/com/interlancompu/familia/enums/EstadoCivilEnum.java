package com.interlancompu.familia.enums;

public enum EstadoCivilEnum {

	SOLTERO(1), CASADO(2), VIUDO(3), DIVORCIADO(4);

	private final int estadoCivil;

	EstadoCivilEnum(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getEstadoCivil() {
		return this.estadoCivil;
	}
}
