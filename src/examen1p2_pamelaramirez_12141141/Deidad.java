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
public class Deidad extends Extraterrestre {
    boolean creyentes;
    String religion;

    public Deidad(boolean creyentes, String religion, String nombre, String poder, String debilidad, boolean heroe, int fuerza, int habMental, int habFisica, boolean tieneSquad) {
        super(nombre, poder, debilidad, heroe, fuerza, habMental, habFisica, tieneSquad);
        this.creyentes = creyentes;
        this.religion = religion;
    }
    
    @Override
    public void chance() {
        
    }

    public boolean isCreyentes() {
        return creyentes;
    }

    public void setCreyentes(boolean creyentes) {
        this.creyentes = creyentes;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Override
    public String toString() {
        return "Deidad{" + "creyentes=" + creyentes + ", religion=" + religion + '}';
    }
    
    
}
