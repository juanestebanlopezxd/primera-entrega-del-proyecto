/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casocerrado;

/**
 *
 * @author JUAN ESTEBAN
 */
public class Narcoticos {
    private String alcance;
    private TipoCaso tipocaso;

    public Narcoticos() {
    }

    public Narcoticos(String alcance) {
        this.alcance = alcance;
    }

    /**
     * @return the alcance
     */
    public String getAlcance() {
        return alcance;
    }

    /**
     * @param alcance the alcance to set
     */
    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }
}
