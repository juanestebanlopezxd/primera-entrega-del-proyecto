
package casocerrado;

import java.util.ArrayList;


public class GestionDetective {
    
    ArrayList<Detective> detectives;

    public GestionDetective() {
        
        detectives = new ArrayList<>();
    }
    
    public void AgregarDetective(Detective detective ){
        boolean agregar = true;
        for(Detective item : detectives){
            if(item.getNumDeIdentificacion()== detective.getNumDeIdentificacion()){
                agregar = false;
            }
        }
        if(agregar){
            detectives.add(detective);
        }
    }
    public void mostrarDetective(){
        
        for(int i = 0; i < detectives.size();i++){
            System.out.println("---------Datos del Sospechoso-----------");
            System.out.println("nombre: "+detectives.get(i).getNombre());
            System.out.println("anos de experiencia: "+detectives.get(i).getAñosDeExperiencia());
            System.out.println("nombre clave: "+detectives.get(i).getNombreClave());
            System.out.println("apellido: "+detectives.get(i).getApellido());
            System.out.println("--------------------------------");
            
        }
        
    }
    
    
    
}
