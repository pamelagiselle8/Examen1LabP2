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
public class Radioactivo extends Persona {
    int edadAcc;
    String tipoAcc;
    
    public Radioactivo(int edadAcc, String tipoAcc, String nombre, String poder, String debilidad, boolean heroe, int fuerza, int habMental, int habFisica, boolean tieneSquad) {
        super(nombre, poder, debilidad, heroe, fuerza, habMental, habFisica, tieneSquad);
        this.edadAcc = edadAcc;
        this.tipoAcc = tipoAcc;
    }


    @Override
    public void chance() {
        
    }

    public int getEdadAcc() {
        return edadAcc;
    }

    public void setEdadAcc(int edadAcc) {
        this.edadAcc = edadAcc;
    }

    public String getTipoAcc() {
        return tipoAcc;
    }

    public void setTipoAcc(String tipoAcc) {
        this.tipoAcc = tipoAcc;
    }

    @Override
    public String toString() {
        return "Radioactivo{" + "edadAcc=" + edadAcc + ", tipoAcc=" + tipoAcc + '}';
    }
    
}
