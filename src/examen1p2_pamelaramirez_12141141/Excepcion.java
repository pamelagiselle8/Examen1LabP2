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
public class Excepcion extends Exception {
    public Excepcion(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
    
}
