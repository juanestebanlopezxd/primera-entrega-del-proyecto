/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casocerrado;

import java.util.ArrayList;

/**
 *
 * @author JUAN ESTEBAN
 */
public class GestionCaso {
    ArrayList<Caso> casos;
    
    public GestionCaso(){
        casos = new ArrayList<>();
    }
    
    public void AgregarCaso(Caso caso ){
        boolean agregar = true;
        for(Caso item : casos){
            if(item.getNumeroCaso() == caso.getNumeroCaso()){
                agregar = false;
            }
        }
        if(agregar){
            casos.add(caso);
        }
    }
    
    public void mostrarCasos(){
        //System.out.println(casos.size());
        for(int i = 0; i < casos.size();i++){
            System.out.println("---------Datos del caso-----------");
            System.out.println(casos.get(i).getNumeroCaso());
            System.out.println(casos.get(i).getDescripCaso());
            System.out.println(casos.get(i).getNombClave());
            System.out.println(casos.get(i).getTipocaso());
            System.out.println(casos.get(i).getDetective());
            System.out.println("--------------------------------");
            
        }
        
    }
    
    
    
}
