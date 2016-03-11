package fatec.calc.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import fatec.calc.servico.Calculadora;

public class UC01SomaDeParcelas {

	static Calculadora calculadora;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculadora  = new Calculadora();
	}

	@Test
	public void CT01UC01SomaDeParcelas_com_sucesso() {
		assertEquals("Resultado=", 5, calculadora.soma("3,2"),0);
	}
	
	@Test(expected = RuntimeException.class)
	public void CT02UC01SomaDeParcelas_dados_invalidos() {
		assertEquals("Resultado=", 5, calculadora.soma("x,2"),0);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
}
