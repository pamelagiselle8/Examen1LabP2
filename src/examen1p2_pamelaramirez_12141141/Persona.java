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
    String nombre, poder, debilidad, heroeovillano;
    int fuerza, habMental, habFisica;
    boolean tieneSquad;
    
    public abstract void chance();

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

    public String getHeroeovillano() {
        return heroeovillano;
    }

    public void setHeroeovillano(String heroeovillano) {
        this.heroeovillano = heroeovillano;
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
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", heroeovillano=" + heroeovillano + ", fuerza=" + fuerza + ", habMental=" + habMental + ", habFisica=" + habFisica + ", tieneSquad=" + tieneSquad + '}';
    }
    
    
}
