
package casocerrado;

import java.util.ArrayList;


public class GestionSospechoso {
    ArrayList<Sospechoso> sospechosos;

    public GestionSospechoso() {
        sospechosos = new ArrayList<>();
    }
    
    
    
    public void AgregarSospechoso(Sospechoso sospechoso ){
        boolean agregar = true;
        for(Sospechoso item : sospechosos){
            if(item.getNumDeIdentidad()== sospechoso.getNumDeIdentidad()){
                agregar = false;
            }
        }
        if(agregar){
            sospechosos.add(sospechoso);
        }
    }
    
    public void mostrarSospechoso(){
        
        for(int i = 0; i < sospechosos.size();i++){
            System.out.println("---------Datos del Sospechoso-----------");
            System.out.println("nombre: "+sospechosos.get(i).getNombre());
            System.out.println("alias: "+sospechosos.get(i).getAlias());
            System.out.println("edad: "+sospechosos.get(i).getEdad());
            System.out.println("ultima direccion: "+sospechosos.get(i).getUltiDireccion());
            System.out.println("ciudad: "+sospechosos.get(i).getCiudad());
            System.out.println("--------------------------------");
            
        }
        
    }
    
}
