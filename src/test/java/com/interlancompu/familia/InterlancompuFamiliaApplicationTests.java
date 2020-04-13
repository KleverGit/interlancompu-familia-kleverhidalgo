package com.interlancompu.familia;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.interlancompu.familia.entities.Familia;
import com.interlancompu.familia.entities.Persona;
import com.interlancompu.familia.enums.EstadoCivilEnum;

@SpringBootTest
class InterlancompuFamiliaApplicationTests {

	@Autowired
	private Familia famililaService;

	@Test

	void createPadre() {
		Persona p = new Persona();
		// Metodo 1 try catch
		try {
			p.setNombre("Juan");
			p.setApellido("Perez");
			p.setCedulaIdentidad("1234567890");
			p.setEdad(56);
			p.setEstadoCivil(EstadoCivilEnum.CASADO);
			this.famililaService.addPadre(p);
			// metodo 2 assert Exception
			// assertThrows(Exception.class, this.famililaService.addPadre(p));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
