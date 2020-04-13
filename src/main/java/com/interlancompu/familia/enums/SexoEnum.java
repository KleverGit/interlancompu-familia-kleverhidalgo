package com.interlancompu.familia.enums;

public enum SexoEnum {
	
	MASCULINO(1), FEMENINO(2);

	private final int sexo;

	SexoEnum(int sexo) {
		this.sexo = sexo;
	}

	public int getSexo() {
		return this.sexo;
	}

}
