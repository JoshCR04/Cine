/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.cine;

/**
 *
 * @author familiacr
 */
public class Sala {
    int capacidad, asientosReservados;

    public Sala(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }

    public void setAsientosReservados(int asientosReservados) {
        this.asientosReservados = asientosReservados;
    }
    
    public int aumentarAsientosReservados(int asientos){
        asientosReservados+=asientos;
        return asientos; 
    }
    
    public int disminuirAsientosReservados(int asientos){
        asientosReservados-=asientos;
        return asientos;
    }
}//fin de la clase Sala
