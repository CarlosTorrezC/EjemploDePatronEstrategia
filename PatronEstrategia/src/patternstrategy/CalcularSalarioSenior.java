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
public class CalcularSalarioSenior implements ICalcularSalario{

    @Override
    public double CalcularSalarioTotal(Desarrollador dev) {
        return dev.CalcularSalario()*1.2;
    }  
}
