
package casocerrado;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JUAN ESTEBAN
 */
public class CasoCerrado {

    static GestionCaso gestionCaso;
    static GestionDetective gestionDetective;
    static GestionSospechoso gestionSospechoso;
    static GestionBitacora gestionBitacora;
    
    static Scanner input = new Scanner(System.in);
    
    
    public static void main(String[] args) {
       
        
        gestionCaso = new GestionCaso();
        gestionDetective = new GestionDetective();
        gestionSospechoso = new GestionSospechoso();
        gestionBitacora=new GestionBitacora();
        
        
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        
        while (!salir) {
            System.out.println("------ Menu ------- ");
            System.out.println("1. Registrar caso ");
            System.out.println("2. Mostrar casos ");
            System.out.println("3. Registrar detective ");
            System.out.println("4. Mostrar detectives ");
            System.out.println("5. Registrar sospechoso ");
            System.out.println("6. Mostrar sospechosos ");
            System.out.println("7. Salir");
 
            try {
 
                System.out.println("selecciona una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Registro de caso");
                        RegistroCaso();
                        break;
                    case 2:
                        System.out.println("Mostrar Casos ");
                        mostrarCasos();
                        break;
                    case 3:
                        System.out.println("Registrar detective");
                        RegistroDetective();
                        break;
                    case 4:
                        System.out.println("Mostrar detectives");
                        mostrarDetective();
                        break;
                    case 5:
                        System.out.println("Registrar sospechoso");
                        RegistroSospechoso();
                        break;
                    case 6:
                        System.out.println("Mostrar sospechosos");
                        mostrarSospechoso();
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 7");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        
        
        
    }
    
    public static void mostrarCasos(){
        gestionCaso.mostrarCasos();
    }
    
    public static void mostrarBitacora(){
        gestionBitacora.mostrarBitacora();
    }
    public static void mostrarDetective(){
        gestionDetective.mostrarDetective();
    }
    public static void mostrarSospechoso(){
        gestionSospechoso.mostrarSospechoso();
    }
    
    
    
    
    public static void RegistroCaso(){
        
        System.out.println("Ingrese el numero del caso");
        int numeroCaso = input.nextInt();
        System.out.println("ingrese descripcion del caso");
        String descripcion = input.next();
        System.out.println("Codigo de prioridad(a/b/c)");
        String codigoPrioridad = input.next();
        System.out.println("Nombre clave");
        String clave = input.next();
        
        Caso caso = new Caso(numeroCaso,descripcion,codigoPrioridad,clave);
        
        gestionCaso.AgregarCaso(caso);
        
        
    }
    
    public static void RegistroSospechoso(){
        System.out.println("--------Registre los datos del sospechoso-----");
        
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
        
        gestionSospechoso.AgregarSospechoso(sospechoso);
        
    }
    
    public static void RegistroDetective(){
        System.out.println("--------Registre los datos del detective-------");
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
        
        gestionDetective.AgregarDetective(detective);
        
    }
    
    public static void RegistroBitacora(){
        System.out.println("--------Registro de bitacora-------");
        System.out.println("Anotacion");
        String anotacion = input.next();
        System.out.println("Fecha registro");
        int fechaRegistro = input.nextInt();
        System.out.println("Observacion");
        String observacion= input.next();
        
        Bitacora bitacora = new Bitacora(anotacion, fechaRegistro, observacion);
        
        gestionBitacora.AgregarBitacora(bitacora);
        
    }
    
}
