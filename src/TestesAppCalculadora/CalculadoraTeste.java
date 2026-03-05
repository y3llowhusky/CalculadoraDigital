package TestesAppCalculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import FontesAppCalculadora.Calculadora;



public class CalculadoraTeste {

	// atributo de apoio aos testes
	static int contadorTeste = 0;
	private String nomeTeste = "";
	private double resultadoReal = 0;
	
	
	// Preparação do teste
	@Before
	public void preparaTeste() {
	   contadorTeste = contadorTeste + 1;
	   System.out.print("Iniciando o teste número: ");
	   System.out.println(contadorTeste);
	}
	
	// Finalização do teste
	@After
	public void encerraTeste() {
		System.out.println(nomeTeste + " - resultado = " + resultadoReal);
	}
	
	/**
    * Teste de somar na Calculadora.
    */
   @Test
   public void testeSomar5com5() {   
	   nomeTeste = "Somar 5 com 5";
	   
	   double nro1 = 5;
	   double nro2 = 5;
       Calculadora calc= new Calculadora();
       double resultadoEsperado = 10;
       resultadoReal= calc.somar(nro1, nro2);      
       assertEquals(resultadoEsperado, resultadoReal, 0);
   }

   /**
   * Teste de subtrair na  Calculadora.
   */
  @Test
  public void testeSubtrair3de5() {
	  nomeTeste = "Subtrair 3 de 5";
	  
	  double nro1 = 5;
	  double nro2 = 3;
      Calculadora calc = new Calculadora();
      double resultadoEsperado= 2;
      resultadoReal= calc.subtrair(nro1, nro2);
      assertEquals(resultadoEsperado, resultadoReal, 0);  
  }
  
   /**
   * Teste de multiplicar na Calculadora.
   */
   @Test
   public void testeMultiplicar3por3() {
	   nomeTeste = "Multiplicar 3 por 3";
	   
	   double nro1 = 3;
	   double nro2 = 3;
       Calculadora calc = new Calculadora();
       double resultadoEsperado = 9;
       resultadoReal = calc.multiplicar(nro1, nro2);
       assertEquals(resultadoEsperado, resultadoReal, 0);
   }

   /**
   * Teste de dividir na Calculadora.
   */
  @Test
  public void testeDividir3por2() {
	  nomeTeste = "Dividir 3 por 2";
	  
	  double nro1 = 3;
	  double nro2 = 2;
      Calculadora calc = new Calculadora();
      double resultadoEsperado= 1.5;
      resultadoReal = calc.dividir(nro1, nro2);
      assertEquals(resultadoEsperado, resultadoReal, 0.1);
      
  }
  
  @Test
  public void testeDividir3por7() {
	  nomeTeste = "Dividir 3 por 7";
	  
	  double nro1 = 3;
	  double nro2 = 7;
      Calculadora calc = new Calculadora();
      double resultadoEsperado= 0.4285;
      resultadoReal = calc.dividir(nro1, nro2);
      assertEquals(resultadoEsperado, resultadoReal, 0.0001);
  }

}
