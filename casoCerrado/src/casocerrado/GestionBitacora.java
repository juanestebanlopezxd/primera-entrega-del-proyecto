
package casocerrado;

import java.util.ArrayList;


public class GestionBitacora {
    ArrayList<Bitacora> bitacoras;
    
    public GestionBitacora(){
        bitacoras = new ArrayList<>();
    }
    
    public void AgregarBitacora(Bitacora bitacora ){
        
        bitacoras.add(bitacora);
        
    }
    
    public void mostrarBitacora(){
        
        for(int i = 0; i < bitacoras.size();i++){
            System.out.println("---------Datos de la bitacoras-----------");
            System.out.println("anotacion: "+bitacoras.get(i).getAnotaciones());
            System.out.println("fecha: "+bitacoras.get(i).getFechaDeRegistro());
            System.out.println("observacion: "+bitacoras.get(i).getObservacion());
            System.out.println("--------------------------------");
            
        }
        
    }
    
}
