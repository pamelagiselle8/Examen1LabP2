
package examen1p2_pamelaramirez_12141141;

import java.util.ArrayList;
import java.util.Scanner;


public class Examen1P2_PamelaRamirez_12141141 {
    static ArrayList <Universo> universos = new ArrayList();
    static ArrayList <Persona> personas = new ArrayList();
    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        ejecutar();
    }
    
    static public int menú(){
        System.out.print("\nMenú:"
                + "\n1. Agregar universo."
                + "\n2. Eliminar universo."
                + "\n3. Agregar héroe/villano."
                + "\n4. Modificar héroe/villano."
                + "\n5. Eliminar héroe/villano."
                + "\n6. Agregar escuadrón."
                + "\n7. Eliminar escuadrón."
                + "\n8. Modificar escuadrón."
                + "\n9. Agregar personas a un escuadrón."
                + "\n10. Opciones de listado."
                + "\n11. Simulación."
                + "\n0. Salir."
                + "\nIngrese una opción: ");
        int op = lea.nextInt();
        System.out.println();
        return op;
    }
    
    static public void ejecutar(){
        switch(menú()){
            case 1: {
                System.out.print("\nIngrese el nombre del universo:");
                String nom = lea.next();
                universos.add(new Universo(nom));
                System.out.println("\nEl universo ha sido agregado exitosamente.\n");
                ejecutar();
                break;
            }
            case 2: {
                System.out.print("\nIngrese el nombre del universo:");
                String nom = lea.next();
                for (Universo u : universos) {
                    if (u.getNombre().equalsIgnoreCase(nom)) {
                        universos.remove(u);
                        System.out.println("\nEl universo ha sido eliminado exitosamente.\n");
                    }
                }
                ejecutar();
                break;
            }
            case 3: {
                if (validarUniverso()) {
                    agregarPersona();
                }
                ejecutar();
                break;
            }
            case 4: {
                System.out.print("\nIngrese el nombre de la persona:");
                String nom = lea.next();
                for (Persona p : personas) {
                    if (p.getNombre().equalsIgnoreCase(nom)) {
                        System.out.print("\nIngrese el nombre: ");
                        String nom2 = lea.next();
                        System.out.print("\nIngrese el poder: ");
                        String pod = lea.next();
                        System.out.print("\nIngrese la debilidad: ");
                        String deb = lea.next();
                        System.out.print("\nIngrese la fuerza: ");
                        int fuerza = lea.nextInt();
                        System.out.print("\nIngrese la habilidad mental: ");
                        int habMental = lea.nextInt();
                        System.out.print("\nIngrese la habilidad física: ");
                        int habFisica = lea.nextInt();
                        p.setNombre(nom2);
                        p.setPoder(pod);
                        p.setDebilidad(deb);
                        p.setFuerza(fuerza);
                        p.setHabMental(habMental);
                        p.setHabFisica(habFisica);
                    }
                }
                ejecutar();
                break;
            }
            case 5: {
                System.out.print("\nIngrese el nombre de la persona: ");
                String nom = lea.next();
                for (Persona p : personas) {
                    if (p.getNombre().equalsIgnoreCase(nom)) {
                        personas.remove(p);
                    }
                }
                ejecutar();
                break;
            }
            case 6:{
                agregarSquad();
                ejecutar();
                break;
            }
            case 7:{
                eliminarSquad();
                break;
            }
            case 8: {
                
                break;
            }
            case 0: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("\n Ingrese una opción válida. \n");
                ejecutar();
                break;
            }
        }
    }
    
    static public boolean validarUniverso(){
        boolean existe = true;
        if (universos.isEmpty()) {
            existe = false;
            System.out.println("\nNo es posible realizar esta operación en este momento ya que aún no existe ningún universo registrado.\n");
        }
        return existe;
    }
    
    static public boolean validarSquad(ArrayList <Object> arr){
        boolean existe = true;
        if (arr.isEmpty()) {
            existe = false;
            System.out.println("\nNo es posible agregar personas porque aún no existe ningún squad registrado en el universo.\n");
        }
        return existe;
    }
    
    static public void agregarSquad(){
        if (validarUniverso()) {
            System.out.print("\nIngrese el nombre del universo de origen: ");
            String uni = lea.next();
            boolean existe = false;
            int pos = 0;
            for (Universo u : universos) {
                if (u.getNombre().equalsIgnoreCase(uni)) {
                    existe = true;
                    pos = universos.indexOf(u);
                }
            }
            if (existe) {
                System.out.print("\nIngrese el nombre del escuadrón: ");
                String nom = lea.next();
                System.out.print("\nIngrese el lugar base: ");
                String lugar = lea.next();
                System.out.print("\nIngrese 1 si es un escuadrón de héroes y 2 si es de villanos: ");
                int tipo = lea.nextInt();
                boolean heroes = true;
                if (tipo == 1 || tipo == 2) {
                    if (tipo == 2) {
                        heroes = false;
                    }
                    universos.get(pos).getSquads().add(new Escuadron(nom, lugar, heroes));
                }
                else{
                    System.out.println("\nOpción inválida. \n");
                    ejecutar();
                }
            }
            else{
                System.out.println("\nNo hay ningún universo registrado con el nombre ingresado.\n");
            }
        }
    }
    
    static public void eliminarSquad(){
        if (validarUniverso()) {
            System.out.print("\nIngrese el nombre del universo de origen: ");
            String uni = lea.next();
            boolean existeU = false;
            boolean existeS = false;
            for (Universo u : universos) {
                if (u.getNombre().equalsIgnoreCase(uni)) {
                    existeU = true;
                    System.out.print("\nIngrese el nombre del escuadrón: ");
                    String nom = lea.next();
                    if (u.getSquads().isEmpty()) {
                        System.out.println("\nNo es posible eliminar escuadrones porque el universo no tiene ningún escuadrón registrado aún.\n");
                    }
                    else{
                        for (Escuadron squad : u.getSquads()) {
                            if (squad.getNombre().equalsIgnoreCase(nom)){
                                existeS = true;
                                u.getSquads().remove(squad);
                            }
                        }
                    }
                    break;
                }
            }
        }
    }
    
    static public void agregarPersona(){
        System.out.print("\n1. Agregar héroe."
                + "\n2. Agregar villano."
                + "\nIngrese una opción: ");
        int op = lea.nextInt();
        boolean heroe = true;
        if (op == 1 || op == 2) {
            if (op == 2) {
                heroe = false;
            }
            System.out.print("\nTipo:"
                    + "\n1. Normal."
                    + "\n2. Mutante."
                    + "\n3. Por accidente radioactivo."
                    + "\n4. Superhumano."
                    + "\n5. Extraterrestre."
                    + "\nIngrese una opción: ");
            int opTipo = lea.nextInt();

            System.out.print("\nIngrese el nombre: ");
            String nom = lea.next();
            System.out.print("\nIngrese el poder: ");
            String pod = lea.next();
            System.out.print("\nIngrese la debilidad: ");
            String deb = lea.next();
            System.out.print("\nIngrese la fuerza: ");
            int fuerza = lea.nextInt();
            System.out.print("\nIngrese la habilidad mental: ");
            int habMental = lea.nextInt();
            System.out.print("\nIngrese la habilidad física: ");
            int habFisica = lea.nextInt();

            switch(opTipo){
                case 1: {
                    personas.add(new Normal(nom, pod, deb, heroe, fuerza, habMental, habFisica, heroe));
                    ejecutar();
                    break;
                }
                case 2: {
                    personas.add(new Mutante(nom, pod, deb, heroe, fuerza, habMental, habFisica, heroe));
                    ejecutar();
                    break;
                }
                case 3: {
                    System.out.print("\nIngrese la edad al momento del accidente: ");
                    int edad = lea.nextInt();
                    System.out.print("\nIngrese el tipo de accidente:");
                    String acc = lea.next();
                    personas.add(new Radioactivo(edad, acc, nom, pod, deb, heroe, fuerza, habMental, habFisica, heroe));
                    ejecutar();
                    break;
                }
                case 4: {
                    System.out.print("\nIngrese el superpoder:");
                    String sup = lea.next();
                    personas.add(new SuperHumano(sup, nom, pod, deb, heroe, fuerza, habMental, habFisica, heroe));
                    ejecutar();
                    break;
                }
                case 5: {
                    System.out.print("\n1. Deidad."
                    + "\n2. Alien."
                    + "\nIngrese una opción: ");
                    int opEx = lea.nextInt();

                    switch(op){
                        case 1: {
                            System.out.print("\nIngrese el nombre de la religión: ");
                            String rel = lea.next();
                            System.out.print("\nIngrese 1 si su religión tiene creyentes: ");
                            int tiene = lea.nextInt();
                            boolean si = false;
                            if (tiene == 1) {
                                si = true;
                            }
                            personas.add(new Deidad(si, rel, nom, pod, deb, heroe, fuerza, habMental, habFisica, heroe));
                            ejecutar();
                            break;
                        }
                        case 2: {
                            System.out.print("\nIngrese el nombre del planeta: ");
                            String planeta = lea.next();
                            personas.add(new Alien(planeta, nom, pod, deb, heroe, fuerza, habMental, habFisica, heroe));
                            ejecutar();
                            break;
                        }
                        default: {
                            System.out.println("\nIngrese una opción válida. \n");
                            ejecutar();
                            break;
                        }
                    }

                    ejecutar();
                    break;
                }
                default: {
                    System.out.println("\nIngrese una opción válida. \n");
                    ejecutar();
                    break;
                }
            }
        }
        else{
            System.out.println("\nIngrese una opción válida. \n");
            agregarPersona();
        }
        
    }

    
    
    
}
