
package examen1p2_pamelaramirez_12141141;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Examen1P2_PamelaRamirez_12141141 {
    static ArrayList <Universo> universos = new ArrayList();
    static ArrayList <Persona> personas = new ArrayList();
    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();
    
    public static void main(String[] args) {
        
        ejecutar();
    }
    
    static public void ejecutar(){
        switch(menuPrincipal()){
            case 1: {
                menuUniverso();
                ejecutar();
                break;
            }
            case 2: {
                menuSquad();
                ejecutar();
                break;
            }
            case 3: {
                menuPersona();
                ejecutar();
                break;
            }
            case 4: {
                System.exit(0);
                break;
            }

        }
    }
    
    static public int menuPrincipal(){
        System.out.print("\nMenú:"
                + "\n1. Opciones universo."
                + "\n2. Opciones escuadrón."
                + "\n3. Opciones persona."
                + "\n0. Salir."
                + "\nIngrese una opción: ");
        int op = lea.nextInt();
        System.out.println();
        return op;
    }
    
    static public int crud1(){
        System.out.print("\n1. Crear."
                + "\n2. Modificar."
                + "\n3. Eliminar."
                + "\n4. Listar."
                + "\nIngrese una opción: ");
        int op = lea.nextInt();
        System.out.println();
        return op;
    }
    
    static public int crud2(){
        System.out.print("\n1. Crear."
                + "\n2. Modificar."
                + "\n3. Eliminar."
                + "\n4. Listar."
                + "\n5. Agregar personas."
                + "\n6. Simular batalla."
                + "\nIngrese una opción: ");
        int op = lea.nextInt();
        System.out.println();
        return op;
    }
    
    static public void menuPersona(){
        switch(crud1()){
            case 1: {
                if (validarUniverso()) {
                    agregarPersona();
                }
                ejecutar();
                break;
            }
            case 2: {
                modificarPersona();
                ejecutar();
                break;
            }
            case 3: {
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
            case 4: {
                for (Persona p : personas) {
                    System.out.println(p);
                }
                ejecutar();
                break;
            }
        }
    }
    
    static public void menuSquad(){
        switch(crud2()){
            case 1: {
                agregarSquad();
                ejecutar();
                break;
            }
            case 2: {
                modificarSquad();
                ejecutar();
                break;
            }
            case 3: {
                eliminarSquad();
                ejecutar();
                break;
            }
            case 4: {
                System.out.print("\nIngrese el nombre del universo:");
                String nom = lea.next();
                for (Universo u : universos) {
                    if (u.getNombre().equalsIgnoreCase(nom)) {
                        for (Escuadron s : u.getSquads()) {
                            System.out.println(s);
                        }
                    }
                }
                ejecutar();
                break;
            }
            case 5: {
                agregarP();
                ejecutar();
                break;
            }
            case 6: {
                
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
    
    static public void simulacion(){
        System.out.print("\nIngrese el nombre del primer escuadrón: ");
        String nom1 = lea.next();
        System.out.print("\nIngrese el nombre del segundo escuadrón: ");
        String nom2 = lea.next();
        Escuadron squad1 = new Escuadron();
        Escuadron squad2 = new Escuadron();
        for (Universo u : universos) {
            for (Escuadron s : u.getSquads()) {
                if (s.getNombre().equalsIgnoreCase(nom1)) {
                    squad1 = s;
                }
                if (s.getNombre().equalsIgnoreCase(nom2)) {
                    squad2 = s;
                }
            }
        }
        int prob = 1 + r.nextInt(2);
        if (prob == 1) {
            dueloFuerza(squad1.getLider(), squad2.getLider());
        }
        else if (prob == 2) {
            dueloHabFisica(squad1.getLider(), squad2.getLider());
        }
        else{
            dueloHabMental(squad1.getLider(), squad2.getLider());
        }
    }
    
    static public void dueloFuerza(Escuadron e1, Escuadron e2){
        Persona p1 = e1.getLider();
        Persona p2 = e2.getLider();
        System.out.println("\nDuelo de Fuerza\n");
        if (p1.getFuerza() > p2.getFuerza()) {
            System.out.println(p1.getNombre() + " gana con una fuerza de " + p1.getFuerza()
                    + ", y " + p2.getNombre() + " pierde con " + p2.getFuerza() + " de fuerza.");
        }
        else{
            System.out.println(p2.getNombre() + " gana con una fuerza de " + p2.getFuerza()
                    + ", y " + p1.getNombre() + " pierde con " + p1.getFuerza() + " de fuerza.");
        }
        
    }
    
    static public void dueloHabFisica(Escuadron e1, Escuadron e2){
        
    }
    
    static public void dueloHabMental(Escuadron e1, Escuadron e2){
        
    }
    
    static public void agregarP(){
        if (validarUniverso()) {
            System.out.print("\nIngrese el nombre del universo de origen: ");
            String uni = lea.next();
            boolean existe = false;
            int pos = 0;
            for (Universo u : universos) {
                if (u.getNombre().equalsIgnoreCase(uni)) {
                    System.out.print("\nIngrese el nombre del escuadrón: ");
                    String nom = lea.next();
                    for (Escuadron squad : u.getSquads()) {
                        if (squad.getNombre().equalsIgnoreCase(nom)) {
                            String resp = "si";
                            while (resp.equalsIgnoreCase("si")){
                                System.out.print("\nIngrese el nombre de la persona a agregar: ");
                                String nombre = lea.next();
                                for (Persona p : personas) {
                                    if (p.getNombre().equalsIgnoreCase(nombre) && p.getHeroe() == squad.getHeroes()) {
                                        if (squad.getMiembros().isEmpty()) {
                                            squad.setLider(p);
                                        }
                                        squad.getMiembros().add(p);
                                        personas.remove(p);
                                    }
                                    else{
                                        System.out.print("\nEl escuadrón no es compatible con el tipo de persona.\n");
                                    }
                                    
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    static public void menuUniverso(){
        switch(crud1()){
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
                        System.out.print("\nIngrese el nuevo nombre del universo:");
                        nom = lea.next();
                        u.setNombre(nom);
                    }
                }
                ejecutar();
                break;
            }
            case 3: {
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
            case 4: {
                for (Universo u : universos) {
                    System.out.println(u);
                }
                ejecutar();
                break;
            }
        }
    }
    
    public static void modificarPersona(){
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
                try{
                    int suma = fuerza + habFisica + habMental;
                    if (suma < 150 && suma > 100) {
                        p.setNombre(nom2);
                        p.setPoder(pod);
                        p.setDebilidad(deb);
                        p.setFuerza(fuerza);
                        p.setHabMental(habMental);
                        p.setHabFisica(habFisica);
                    }
                    else{
                        throw new Excepcion("\nEsta persona no tiene lo suficiente para ser un súper héroe/villano.\n");
                    }
                }
                catch (Excepcion e){
                    System.out.println(e);
                }
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
    
    static public void modificarSquad(){
        if (validarUniverso()) {
            System.out.print("\nIngrese el nombre del universo de origen: ");
            String uni = lea.next();
            boolean existe = false;
            int pos = 0;
            for (Universo u : universos) {
                if (u.getNombre().equalsIgnoreCase(uni)) {
                    System.out.print("\nIngrese el nombre del escuadrón: ");
                    String nom = lea.next();
                    for (Escuadron squad : u.getSquads()) {
                        if (squad.getNombre().equalsIgnoreCase(nom)) {
                            System.out.print("\n1. Nombre."
                                    + "\n2. Lugar."
                                    + "\n3. Tipo de escuadrón."
                                    + "\nIngrese una opción: ");
                            int op = lea.nextInt();
                            switch(op){
                                 case 1: {
                                    System.out.print("\nIngrese el nuevo nombre del escuadrón: ");
                                    nom = lea.next();
                                    squad.setNombre(nom);
                                    ejecutar();
                                    break;
                                }
                                case 2: {
                                    System.out.print("\nIngrese el nuevo lugar base: ");
                                    String lugar = lea.next();
                                    squad.setLugarBase(lugar);
                                    ejecutar();
                                    break;
                                }
                                case 3: {
                                    System.out.print("\nIngrese 1 si es un escuadrón de héroes y 2 si es de villanos: ");
                                    int tipo = lea.nextInt();
                                    boolean heroes = true;
                                    if (tipo == 1 || tipo == 2) {
                                        if (tipo == 2) {
                                            heroes = false;
                                        }
                                        squad.setHeroes(heroes);
                                        System.out.println("\nEscuadrón modificado exitosamente.\n");
                                    }
                                    else{
                                        System.out.println("\nOpción inválida. \n");
                                        ejecutar();
                                    }
                                    ejecutar();
                                    break;
                                }
                            }
                            
                            
                            
                            
                        }
                    }
                }
            }
        }
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
            try{
                int suma = fuerza + habFisica + habMental;
                if (suma < 150 && suma > 100) {
                    switch(opTipo){
                        case 1: {
                            personas.add(new Normal(nom, pod, deb, heroe, fuerza, habMental, habFisica, heroe));
                            ejecutar();
                            break;
                        }
                        case 2: {
                            String resp = "si";
                            ArrayList <String> factores = new ArrayList();
                            while (resp.equalsIgnoreCase("si")){
                                System.out.print("\nIngrese un factor mutante: ");
                                String factor = lea.next();
                                factores.add(factor);
                                System.out.print("\n¿Desea seguir agregando factores? (si/no): ");
                                resp = lea.next();
                            }
                            personas.add(new Mutante(nom, pod, deb, heroe, fuerza, habMental, habFisica, heroe, factores));
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
                    throw new Excepcion("\nEsta persona no tiene lo suficiente para ser un súper héroe/villano.\n");
                }
            }
            catch (Excepcion e){
                System.out.println(e);
            }
        }
        else{
            System.out.println("\nIngrese una opción válida. \n");
            agregarPersona();
        }
        
    }
}
