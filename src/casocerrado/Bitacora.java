/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casocerrado;

/**
 *
 * @author JUAN ESTEBAN
 */
public class Bitacora {
    private String anotaciones;
    private int fechaDeRegistro;
    private String observacion;

    
    public Bitacora() {
    }

    public Bitacora(String anotaciones, int fechaDeRegistro, String observacion) {
        this.anotaciones = anotaciones;
        this.fechaDeRegistro = fechaDeRegistro;
        this.observacion = observacion;
    }

    
    public String getAnotaciones() {
        return anotaciones;
    }

    /**
     * @param anotaciones the anotaciones to set
     */
    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    /**
     * @return the fechaDeRegistro
     */
    public int getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    /**
     * @param fechaDeRegistro the fechaDeRegistro to set
     */
    public void setFechaDeRegistro(int fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    /**
     * @return the observacion
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * @param observacion the observacion to set
     */
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
