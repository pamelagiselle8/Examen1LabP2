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
public class SuperHumano extends Persona {
    String superpoder;
    Random r = new Random();

    public SuperHumano(String superpoder, String nombre, String poder, String debilidad, boolean heroe, int fuerza, int habMental, int habFisica, boolean tieneSquad) {
        super(nombre, poder, debilidad, heroe, fuerza, habMental, habFisica, tieneSquad);
        this.superpoder = superpoder;
    }
    
    @Override
    public void chance(Persona p1, Persona p2, int atr) {
        if (atr == 1) {
            super.fuerza = super.fuerza * 4;
        }
        else if (atr == 2) {
            super.habFisica = super.habFisica * 4;
        }
        else{
            super.habMental = super.habMental * 4;
        }
        int prob = 1 + r.nextInt(2);
        if (prob == 1) {
            p1.habFisica -= p1.habFisica / 2;
        }
        else if (prob == 2) {
            p1.habMental -= p1.habMental / 2;
        }
        else{
            p1.fuerza -= p1.fuerza / 2;
        }
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    @Override
    public String toString() {
        return "SuperHumano{" + "superpoder=" + superpoder + '}';
    }
    
}
