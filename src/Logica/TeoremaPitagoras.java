
package Logica;


public class TeoremaPitagoras 
{
   double hipotenusa;
 
public double CalcularHipotenusa (double lado1, double lado2) 
   {
	hipotenusa = Math.sqrt (Math.pow (lado1,2)+ Math.pow (lado2,2));
	return hipotenusa;
   }
}