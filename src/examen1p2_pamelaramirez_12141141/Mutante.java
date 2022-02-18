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
public class Mutante extends Persona {
    ArrayList <String> factoresMutantes = new ArrayList();

    @Override
    public void chance() {
        
    }

    public ArrayList<String> getFactoresMutantes() {
        return factoresMutantes;
    }

    public void setFactoresMutantes(ArrayList<String> factoresMutantes) {
        this.factoresMutantes = factoresMutantes;
    }

    @Override
    public String toString() {
        return "Mutante{" + "factoresMutantes=" + factoresMutantes + '}';
    }
    
}
