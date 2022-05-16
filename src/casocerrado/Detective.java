/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casocerrado;

/**
 *
 * @author JUAN ESTEBAN
 */
public class Detective {
    
    private String nombreClave;
    private long numDeIdentificacion;
    private String nombre;
    private String apellido;
    private int añosDeExperiencia;
    private String tipoDeCaso;
    private Homicidio homicidio;

    public Detective() {
    }

    public Detective(String nombreClave, long numDeIdentificacion, String nombre, String apellido, int añosDeExperiencia, String tipoDeCaso) {
        this.nombreClave = nombreClave;
        this.numDeIdentificacion = numDeIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añosDeExperiencia = añosDeExperiencia;
        this.tipoDeCaso = tipoDeCaso;
    }

    /**
     * @return the nombreClave
     */
    public String getNombreClave() {
        return nombreClave;
    }

    /**
     * @param nombreClave the nombreClave to set
     */
    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    /**
     * @return the numDeIdentificacion
     */
    public long getNumDeIdentificacion() {
        return numDeIdentificacion;
    }

    /**
     * @param numDeIdentificacion the numDeIdentificacion to set
     */
    public void setNumDeIdentificacion(long numDeIdentificacion) {
        this.numDeIdentificacion = numDeIdentificacion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the añosDeExperiencia
     */
    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    /**
     * @param añosDeExperiencia the añosDeExperiencia to set
     */
    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

    /**
     * @return the tipoDeCaso
     */
    public String getTipoDeCaso() {
        return tipoDeCaso;
    }

    /**
     * @param tipoDeCaso the tipoDeCaso to set
     */
    public void setTipoDeCaso(String tipoDeCaso) {
        this.tipoDeCaso = tipoDeCaso;
    }
}
