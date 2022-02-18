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
public class SuperHumano extends Persona {
    String superpoder;

    @Override
    public void chance() {
        
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
