/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casocerrado;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JUAN ESTEBAN
 */
public class CasoCerrado {

    /**
     * @param args the command line arguments
     */
    static GestionCaso g ;
    public static void main(String[] args) {
        // TODO code application logic here
        g = new GestionCaso();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Registrar caso ");
            System.out.println("2. Mostrar casos");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Registro de caso");
                        datoSRegistro();
                        break;
                    case 2:
                        System.out.println("Mostrar Casos 2");
                        mostrarDatos();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        
        
        
    }
    
    public static void mostrarDatos(){
        
        g.mostrarCasos();
    }
    
    
    static Scanner input = new Scanner(System.in);
    public static void datoSRegistro(){
        
        System.out.println("Ingrese el numero del caso");
        int numeroCaso = input.nextInt();
        
        System.out.println("ingrese descripcion del caso");
        String descripcion = input.next();
        
        System.out.println("Codigo de prioridad");
        int codigoPrioridad = input.nextInt();
        
        System.out.println("Nombre clave");
        String clave = input.next();
        
        System.out.println("--------Datos del sospechoso-----");
        
        System.out.println("numero de identificacion");
        Long numIdentificacion = input.nextLong();
        System.out.println("Nombre");
        String nombre = input.next();
        System.out.println("Alias");
        String alias =  input.next();
        System.out.println("Edad");
        int edad = input.nextInt();
        System.out.println("Ultima direccion");
        String direccion = input.next();
        System.out.println("Numero de vivienda");
        int NumVivienda = input.nextInt();
        System.out.println("localidad");
        String localidad = input.next();
        System.out.println("Ciudad");
        String ciudad = input.next();
        System.out.println("Departamento");
        String departamento = input.next();
        System.out.println("pais");
        String pais = input.next();
        System.out.println("Fotografia");
        String fotografia = input.next();
        System.out.println("caracteristicas fisicas");
        String caractFisicas = input.next();
        Sospechoso sospechoso = new Sospechoso(numIdentificacion,nombre,alias,edad,direccion,NumVivienda, localidad, ciudad, departamento, pais, fotografia, caractFisicas);
        
        System.out.println("--------Datos del detective-------");
        System.out.println("Nombre clave");
        String NombreClave = input.next();
        System.out.println("Numero identificacion");
        Long NumIDentificacion = input.nextLong();
        System.out.println("nombre");
        String NombreDetective = input.next();
        System.out.println("Apellido");
        String apellidoDetective = input.next();
        System.out.println("Años de experiencia");
        int AñosDeExperiencia = input.nextInt();
        
        Detective detective = new Detective(NombreClave, NumIDentificacion, NombreDetective, apellidoDetective, AñosDeExperiencia);
        
        System.out.println("--------Datos de la bitacora-------");
        System.out.println("Anotacion");
        String anotacion = input.next();
        System.out.println("Fecha registro");
        int fechaRegistro = input.nextInt();
        System.out.println("Observacion");
        String observacion= input.next();
        
        Bitacora bitacora = new Bitacora(anotacion, fechaRegistro, observacion);
        
        Caso caso = new Caso(numeroCaso, descripcion, codigoPrioridad, clave, pais, detective, bitacora, sospechoso);
        
        
        
        
        g.AgregarCaso(caso);
        
        
    }
    
}
