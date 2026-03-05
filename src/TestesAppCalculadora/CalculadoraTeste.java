package TestesAppCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesAppCalculadora.Calculadora;



public class CalculadoraTeste {

	/**
	    * Teste de somar na Calculadora.
	    */
	   @Test
	   public void testeSomar5com5() {    
		   double nro1 = 5;
		   double nro2 = 5;
	       Calculadora calc= new Calculadora();
	       double resultadoEsperado = 10;
	       double resultadoReal= calc.somar(nro1, nro2);      
	       assertEquals(resultadoEsperado, resultadoReal);
	   }

	   /**
	   * Teste de subtrair na  Calculadora.
	   */
	  @Test
	  public void testeSubtrair3de5() {
		  double nro1 = 5;
		  double nro2 = 3;
	      Calculadora calc = new Calculadora();
	      double resultadoEsperado= 2;
	      double resultadoReal= calc.subtrair(nro1, nro2);
	      assertEquals(resultadoEsperado, resultadoReal);  
	  }
	  
	   /**
	   * Teste de multiplicar na Calculadora.
	   */
	   @Test
	   public void testeMultiplicar3por3() {
		   
		   double nro1 = 3;
		   double nro2 = 3;
	       Calculadora calc = new Calculadora();
	       double resultadoEsperado = 9;
	       double resultadoReal = calc.multiplicar(nro1, nro2);
	       assertEquals(resultadoEsperado, resultadoReal);
	   }

	   /**
	   * Teste de dividir na Calculadora.
	   */
	  @Test
	  public void testeDividir3por2() {
		  
		  double nro1 = 3;
		  double nro2 = 2;
	      Calculadora calc = new Calculadora();
	      double resultadoEsperado= 1;
	      double resultadoReal = calc.dividir(nro1, nro2);
	      assertEquals(resultadoEsperado, resultadoReal);
	  }

}
