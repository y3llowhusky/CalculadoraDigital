package TestesAppCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesAppCalculadora.Calculadora;



public class CalculadoraTeste {

	// atributo de apoio aos testes
	static int contadorTeste = 0;
	
	/**
    * Teste de somar na Calculadora.
    */
   @Test
   public void testeSomar5com5() {   
	   contadorTeste = contadorTeste + 1;
	   System.out.print("Iniciando o teste número: ");
	   System.out.println(contadorTeste);
	   
	   double nro1 = 5;
	   double nro2 = 5;
       Calculadora calc= new Calculadora();
       double resultadoEsperado = 10;
       double resultadoReal= calc.somar(nro1, nro2);      
       assertEquals(resultadoEsperado, resultadoReal, 0);
   }

   /**
   * Teste de subtrair na  Calculadora.
   */
  @Test
  public void testeSubtrair3de5() {
	   contadorTeste = contadorTeste + 1;
	   System.out.print("Iniciando o teste número: ");
	   System.out.println(contadorTeste);
	  
	  double nro1 = 5;
	  double nro2 = 3;
      Calculadora calc = new Calculadora();
      double resultadoEsperado= 2;
      double resultadoReal= calc.subtrair(nro1, nro2);
      assertEquals(resultadoEsperado, resultadoReal, 0);  
  }
  
   /**
   * Teste de multiplicar na Calculadora.
   */
   @Test
   public void testeMultiplicar3por3() {
	   contadorTeste = contadorTeste + 1;
	   System.out.print("Iniciando o teste número: ");
	   System.out.println(contadorTeste);
	   
	   double nro1 = 3;
	   double nro2 = 3;
       Calculadora calc = new Calculadora();
       double resultadoEsperado = 9;
       double resultadoReal = calc.multiplicar(nro1, nro2);
       assertEquals(resultadoEsperado, resultadoReal, 0);
   }

   /**
   * Teste de dividir na Calculadora.
   */
  @Test
  public void testeDividir3por2() {
	   contadorTeste = contadorTeste + 1;
	   System.out.print("Iniciando o teste número: ");
	   System.out.println(contadorTeste);
	  
	  double nro1 = 3;
	  double nro2 = 2;
      Calculadora calc = new Calculadora();
      double resultadoEsperado= 1.5;
      double resultadoReal = calc.dividir(nro1, nro2);
      assertEquals(resultadoEsperado, resultadoReal, 0.1);
  }
  
  @Test
  public void testeDividir3por7() {
	   contadorTeste = contadorTeste + 1;
	   System.out.print("Iniciando o teste número: ");
	   System.out.println(contadorTeste);
	  
	  double nro1 = 3;
	  double nro2 = 7;
      Calculadora calc = new Calculadora();
      double resultadoEsperado= 0.4285;
      double resultadoReal = calc.dividir(nro1, nro2);
      assertEquals(resultadoEsperado, resultadoReal, 0.0001);
  }

}
