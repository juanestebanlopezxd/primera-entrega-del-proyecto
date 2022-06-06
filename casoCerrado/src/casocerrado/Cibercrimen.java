/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casocerrado;

/**
 *
 * @author JUAN ESTEBAN
 */
public class Cibercrimen {
    
    private String lineaCibercrimen;
    private TipoCaso tipocaso;

    public Cibercrimen() {
    }

    public Cibercrimen(String lineaCibercrimen) {
        this.lineaCibercrimen = lineaCibercrimen;
    }

    /**
     * @return the lineaCibercrimen
     */
    public String getLineaCibercrimen() {
        return lineaCibercrimen;
    }

    /**
     * @param lineaCibercrimen the lineaCibercrimen to set
     */
    public void setLineaCibercrimen(String lineaCibercrimen) {
        this.lineaCibercrimen = lineaCibercrimen;
    }
}
