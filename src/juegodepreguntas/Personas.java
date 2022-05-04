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
    private int ronda;
    private int puntaje;
    private int premio;

    public Personas() {
    }

    public Personas(String codigo, String nombre, int ronda, int puntaje,int premio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ronda = ronda;
        this.puntaje = puntaje;
        this.premio = premio;
        
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

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }
    
    
    
}
