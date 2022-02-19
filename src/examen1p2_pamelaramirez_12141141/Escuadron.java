/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_pamelaramirez_12141141;

import java.util.ArrayList;

/**
 *
 * @author pame
 */
public class Escuadron {
    private String nombre, lugarBase;
    private Persona lider;
    private boolean heroes;
    private ArrayList <Persona> miembros = new ArrayList();

    public Escuadron(String nombre, String lugarBase, boolean heroes) {
        this.nombre = nombre;
        this.lugarBase = lugarBase;
        this.heroes = heroes;
    }

    public Escuadron() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarBase() {
        return lugarBase;
    }

    public void setLugarBase(String lugarBase) {
        this.lugarBase = lugarBase;
    }

    public Persona getLider() {
        return lider;
    }

    public void setLider(Persona lider) {
        this.lider = lider;
    }

    public boolean getHeroes() {
        return heroes;
    }

    public void setHeroes(boolean heroes) {
        this.heroes = heroes;
    }
    

    public ArrayList<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nLugar Base: " + lugarBase;
    }
    
    
}
