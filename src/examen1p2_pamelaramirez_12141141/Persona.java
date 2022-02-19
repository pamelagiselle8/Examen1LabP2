/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_pamelaramirez_12141141;

/**
 *
 * @author pame
 */
public abstract class Persona {
    String nombre, poder, debilidad;
    int fuerza, habMental, habFisica;
    boolean tieneSquad, heroe;
    
    public abstract void chance(Persona p1, Persona p2, int atr);

    public Persona(String nombre, String poder, String debilidad, boolean heroe, int fuerza, int habMental, int habFisica, boolean tieneSquad) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.heroe = heroe;
        this.fuerza = fuerza;
        this.habMental = habMental;
        this.habFisica = habFisica;
        this.tieneSquad = tieneSquad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public boolean getHeroe() {
        return heroe;
    }

    public void setHeroe(boolean heroe) {
        this.heroe = heroe;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHabMental() {
        return habMental;
    }

    public void setHabMental(int habMental) {
        this.habMental = habMental;
    }

    public int getHabFisica() {
        return habFisica;
    }

    public void setHabFisica(int habFisica) {
        this.habFisica = habFisica;
    }

    public boolean isTieneSquad() {
        return tieneSquad;
    }

    public void setTieneSquad(boolean tieneSquad) {
        this.tieneSquad = tieneSquad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", heroeovillano=" + heroe + ", fuerza=" + fuerza + ", habMental=" + habMental + ", habFisica=" + habFisica + ", tieneSquad=" + tieneSquad + '}';
    }
    
    
}
