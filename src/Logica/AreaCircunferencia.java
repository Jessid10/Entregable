
package Logica;

public class AreaCircunferencia 
{
    double Area;


public double CalcularAreaCircunferencia(double radio)
    {
        double pi=3.14;
        Area= pi*Math.pow(radio, 2);
        
        return Area;
    }
}