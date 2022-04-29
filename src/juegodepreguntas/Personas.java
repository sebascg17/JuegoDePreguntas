/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodepreguntas;

/**
 *
 * @author sebas
 */
public class Personas {
    private String codigo;
    private String nombre;
    private int rango;
    private int puntaje;

    public Personas() {
    }

    public Personas(String codigo, String nombre, int rango, int puntaje) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.rango = rango;
        this.puntaje = puntaje;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    
    
}
