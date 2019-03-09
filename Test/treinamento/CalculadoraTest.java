package treinamento;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

import model.calculadora;

public class CalculadoraTest {
	private Calculadora calculadora = null;
	
@Before
public void setup() {
	this.calculadora = new Calculadora();	
}

@Test
public void deveTrazerAlgumResultadoNaSoma() {
	double res = calculadora.calcula(2, 10, "+");
	Assert.assertEquals(12, res, 0000.1);
	
}
@Test
public void deveTrazerAlgumResultadaMultiplicacao() {
	double res = calculadora.calcula(2, 10, "*");
	Assert.assertEquals(20, res, 0000.1);
	
}
@Test
public void deveTrazerAlgumResultadaDivisao() {
	double res = calculadora.calcula(10, 10, "/");
	Assert.assertEquals(1, res, 0000.1);
	
}
@Test
public void deveTrazerAlgumResultadaSubtracao() {
	double res = calculadora.calcula(20, 10, "-");
	Assert.assertEquals(10, res, 0000.1);
	
}
}