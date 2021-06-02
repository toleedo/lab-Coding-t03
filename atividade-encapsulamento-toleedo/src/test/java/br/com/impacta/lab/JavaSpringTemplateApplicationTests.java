package br.com.impacta.lab;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import br.com.impacta.lab.models.*;
import org.junit.Test;

class JavaSpringTemplateApplicationTests {

	@Test
	public void shouldHaveCarwithEncapsulatePrinciple() {
		
		Carro carro = new Carro();
		carro.setCor("Azul");
		carro.setAno(2021);
		carro.setValor(50000.00);
		
		assertEquals("Azul", carro.getCor());
	}	
}
