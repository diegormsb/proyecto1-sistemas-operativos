/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author diegormsb
 */
public class empresa {
    
    private String nombre;
    private int desarrolladoresNarrativa;
    private int disenadoresNiveles;
    private int artistasSprites;
    private int programadoresLogica;
    private int desarrolladoresDLC;
    private int integradores;

    // Constructor
    public empresa(String nombre, int desarrolladoresNarrativa, int disenadoresNiveles,
                   int artistasSprites, int programadoresLogica, int desarrolladoresDLC, int integradores) {
        this.nombre = nombre;
        this.desarrolladoresNarrativa = desarrolladoresNarrativa;
        this.disenadoresNiveles = disenadoresNiveles;
        this.artistasSprites = artistasSprites;
        this.programadoresLogica = programadoresLogica;
        this.desarrolladoresDLC = desarrolladoresDLC;
        this.integradores = integradores;
    }

    // Métodos para acceder a los atributos (getters y setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDesarrolladoresNarrativa() {
        return desarrolladoresNarrativa;
    }

    public void setDesarrolladoresNarrativa(int desarrolladoresNarrativa) {
        this.desarrolladoresNarrativa = desarrolladoresNarrativa;
    }

    public int getDisenadoresNiveles() {
        return disenadoresNiveles;
    }

    public void setDisenadoresNiveles(int disenadoresNiveles) {
        this.disenadoresNiveles = disenadoresNiveles;
    }

    public int getArtistasSprites() {
        return artistasSprites;
    }

    public void setArtistasSprites(int artistasSprites) {
        this.artistasSprites = artistasSprites;
    }

    public int getProgramadoresLogica() {
        return programadoresLogica;
    }

    public void setProgramadoresLogica(int programadoresLogica) {
        this.programadoresLogica = programadoresLogica;
    }

    public int getDesarrolladoresDLC() {
        return desarrolladoresDLC;
    }

    public void setDesarrolladoresDLC(int desarrolladoresDLC) {
        this.desarrolladoresDLC = desarrolladoresDLC;
    }

    public int getIntegradores() {
        return integradores;
    }

    public void setIntegradores(int integradores) {
        this.integradores = integradores;
    }

    // Otros métodos que puedas necesitar para la clase Empresa
}
