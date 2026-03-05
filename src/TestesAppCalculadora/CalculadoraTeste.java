package TestesAppCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesAppCalculadora.Calculadora;



public class CalculadoraTeste {

	// atributo de apoio aos testes
	static int contadorTeste = 0;
	private String nomeTeste = "";
	
	/**
    * Teste de somar na Calculadora.
    */
   @Test
   public void testeSomar5com5() {   
	   nomeTeste = "Somar 5 com 5";
	   
	   contadorTeste = contadorTeste + 1;
	   System.out.print("Iniciando o teste número: ");
	   System.out.println(contadorTeste);
	   
	   double nro1 = 5;
	   double nro2 = 5;
       Calculadora calc= new Calculadora();
       double resultadoEsperado = 10;
       double resultadoReal= calc.somar(nro1, nro2);      
       assertEquals(resultadoEsperado, resultadoReal, 0);
       
       System.out.println(nomeTeste + " - resultado = " + resultadoReal + "\n");
   }

   /**
   * Teste de subtrair na  Calculadora.
   */
  @Test
  public void testeSubtrair3de5() {
	  nomeTeste = "Subtrair 3 de 5";
	  
	   contadorTeste = contadorTeste + 1;
	   System.out.print("Iniciando o teste número: ");
	   System.out.println(contadorTeste);
	  
	  double nro1 = 5;
	  double nro2 = 3;
      Calculadora calc = new Calculadora();
      double resultadoEsperado= 2;
      double resultadoReal= calc.subtrair(nro1, nro2);
      assertEquals(resultadoEsperado, resultadoReal, 0);  
      
      System.out.println(nomeTeste + " - resultado = " + resultadoReal);
  }
  
   /**
   * Teste de multiplicar na Calculadora.
   */
   @Test
   public void testeMultiplicar3por3() {
	   nomeTeste = "Multiplicar 3 por 3";
	   
	   contadorTeste = contadorTeste + 1;
	   System.out.print("Iniciando o teste número: ");
	   System.out.println(contadorTeste);
	   
	   double nro1 = 3;
	   double nro2 = 3;
       Calculadora calc = new Calculadora();
       double resultadoEsperado = 9;
       double resultadoReal = calc.multiplicar(nro1, nro2);
       assertEquals(resultadoEsperado, resultadoReal, 0);
       
       System.out.println(nomeTeste + " - resultado = " + resultadoReal);
   }

   /**
   * Teste de dividir na Calculadora.
   */
  @Test
  public void testeDividir3por2() {
	  nomeTeste = "Dividir 3 por 2";
	  
	   contadorTeste = contadorTeste + 1;
	   System.out.print("Iniciando o teste número: ");
	   System.out.println(contadorTeste);
	  
	  double nro1 = 3;
	  double nro2 = 2;
      Calculadora calc = new Calculadora();
      double resultadoEsperado= 1.5;
      double resultadoReal = calc.dividir(nro1, nro2);
      assertEquals(resultadoEsperado, resultadoReal, 0.1);
      
      System.out.println(nomeTeste + " - resultado = " + resultadoReal);
  }
  
  @Test
  public void testeDividir3por7() {
	  nomeTeste = "Dividir 3 por 7";
	  
	   contadorTeste = contadorTeste + 1;
	   System.out.print("Iniciando o teste número: ");
	   System.out.println(contadorTeste);
	  
	  double nro1 = 3;
	  double nro2 = 7;
      Calculadora calc = new Calculadora();
      double resultadoEsperado= 0.4285;
      double resultadoReal = calc.dividir(nro1, nro2);
      assertEquals(resultadoEsperado, resultadoReal, 0.0001);
      
      System.out.println(nomeTeste + " - resultado = " + resultadoReal);
  }

}
