
package Logica;

public class CtoSerie 
{
double IntensidadSerie;
double ResistenciaTotal;
public double CalcularCircuitoSerie(double Resistencia1,double Resistencia2,double Resistencia3,double Voltios)
     {
         ResistenciaTotal=Resistencia1+Resistencia2+Resistencia3;
         IntensidadSerie=Voltios/ResistenciaTotal;
     
         return IntensidadSerie;
     }
}