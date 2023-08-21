/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.cine;

/**
 *
 * @author UCR
 */
public class Pelicula {
    private String nombre;
    private String director;
    private String categoria;
    private double duracion;

    public Pelicula(String nombre, String director, String categoria, double duracion) {
        this.nombre = nombre;
        this.director = director;
        this.categoria = categoria;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", director=" + director + ", categoria=" + categoria + ", duracion=" + duracion + '}';
    }

    
    
}
