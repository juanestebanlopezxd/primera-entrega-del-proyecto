/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casocerrado;

/**
 *
 * @author JUAN ESTEBAN
 */
public class Homicidio {
    private String interrogatorio;
    private String analisisDePrueba;
    private TipoCaso tipocaso;
    private Detective detective;

    public Homicidio() {
    }

    public Homicidio(String interrogatorio, String analisisDePrueba) {
        this.interrogatorio = interrogatorio;
        this.analisisDePrueba = analisisDePrueba;
    }

    /**
     * @return the interrogatorio
     */
    public String getInterrogatorio() {
        return interrogatorio;
    }

    /**
     * @param interrogatorio the interrogatorio to set
     */
    public void setInterrogatorio(String interrogatorio) {
        this.interrogatorio = interrogatorio;
    }

    /**
     * @return the analisisDePrueba
     */
    public String getAnalisisDePrueba() {
        return analisisDePrueba;
    }

    /**
     * @param analisisDePrueba the analisisDePrueba to set
     */
    public void setAnalisisDePrueba(String analisisDePrueba) {
        this.analisisDePrueba = analisisDePrueba;
    }

}
