/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_pamelaramirez_12141141;

import java.util.Random;

/**
 *
 * @author pame
 */
public class Deidad extends Extraterrestre {
    Random r = new Random();
    boolean creyentes;
    String religion;

    public Deidad(boolean creyentes, String religion, String nombre, String poder, String debilidad, boolean heroe, int fuerza, int habMental, int habFisica, boolean tieneSquad) {
        super(nombre, poder, debilidad, heroe, fuerza, habMental, habFisica, tieneSquad);
        this.creyentes = creyentes;
        this.religion = religion;
    }
    
    @Override
    public void chance(Persona p1, Persona p2, int atr) {
        int prob = 1 + r.nextInt(2);
        if (prob == 1) {
            p1.habFisica += p1.habFisica * 2;
        }
        else if (prob == 2) {
            p1.habMental += p1.habMental * 2;
        }
        else{
            p1.fuerza += p1.fuerza * 2;
        }
        prob = 1 + r.nextInt(2);
        if (prob == 1) {
            p2.habFisica = p2.habFisica / 2;
        }
        else if (prob == 2) {
            p2.habMental = p2.habMental / 2;
        }
        else{
            p2.fuerza = p2.fuerza / 2;
        }
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
