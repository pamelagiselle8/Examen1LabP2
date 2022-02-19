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
public class Normal extends Persona {
    Random r = new Random();
    
    public Normal(String nombre, String poder, String debilidad, boolean heroe, int fuerza, int habMental, int habFisica, boolean tieneSquad) {
        super(nombre, poder, debilidad, heroe, fuerza, habMental, habFisica, tieneSquad);
    }
    
    @Override
    public void chance(Persona p1, Persona p2, int atr) {
        int prob = 1 + r.nextInt(2);
        if (prob == 1) {
            super.habFisica += super.habFisica / 2;
        }
        else if (prob == 2) {
            super.habMental += super.habMental / 2;
        }
        else{
            super.fuerza += super.fuerza / 2;
        }
    }
    
}
