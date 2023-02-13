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
public class Desarrollador {    
    private String Nombre;
    private EnumLevel Nivel;
    private int HorasLaborales;
    private double TarifaXHora;
    
    public Desarrollador(){}
    
    public void SetNombre(String Nombre){
        this.Nombre=Nombre;
    }
    
    public String getNombre(){
        return this.Nombre;
    }
    
    public void SetNivel(EnumLevel Nivel){
        this.Nivel=Nivel;
    }
    
    public void SetHorasLaborales(int HorasLaborales){
        this.HorasLaborales=HorasLaborales;
    }
    
    public void SetTarifaXHora(double TarifaXHora){
        this.TarifaXHora=TarifaXHora;
    }
    
    public double CalcularSalario(){
        return this.HorasLaborales*this.TarifaXHora;
    }
}
