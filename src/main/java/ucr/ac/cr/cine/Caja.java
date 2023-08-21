/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.cine;

/**
 *
 * @author UCR
 */
public class Caja {
    private double recaudado;

    public Caja() {
    }

    public Caja(double recaudado) {
        this.recaudado = recaudado;
    }

    public double getRecaudado() {
        return recaudado;
    }

    public void setRecaudado(double recaudado) {
        this.recaudado = recaudado;
    }
    
    public String aumentarRecaudado(double monto){
       recaudado+=monto;//recaudado=recaudado+monto
       return"El monto fue registrado";
    }
    
    public String disminuirRecaudado(double monto) {
       recaudado-=monto;
       return"El monto fue registrado";
    }
    
}
