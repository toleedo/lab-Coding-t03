package br.com.impacta.lab;

import java.util.ArrayList;
import br.com.impacta.lab.models.*;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.setCor("Amarelo");
		carro.setAno(2010);
		carro.setValor(10000.00);
		
		System.out.println(carro.getCor());
	}

}
