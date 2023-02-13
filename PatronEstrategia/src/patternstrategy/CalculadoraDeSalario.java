/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternstrategy;

/**
 *
 * @author carlos
 */
public class CalculadoraDeSalario {
    private ICalcularSalario calculadora;  
    
    public CalculadoraDeSalario(ICalcularSalario calculadora){
        this.calculadora=calculadora;
    }
    
    public void setContext(ICalcularSalario calculadora){
         this.calculadora=calculadora;
    }
    
    public double CalcularSalarioTotal(Desarrollador dev){
        return this.calculadora.CalcularSalarioTotal(dev);
    } 
}
