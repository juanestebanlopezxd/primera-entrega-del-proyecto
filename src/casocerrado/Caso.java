/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casocerrado;

/**
 *
 * @author JUAN ESTEBAN
 */
public class Caso {
    private int numeroCaso;
    private String descripCaso;
    private int codigoDePrioridad;
    private String nombClave;
    private TipoCaso tipocaso;
    private  Detective detective;
    private Bitacora bitacora;
    private Sospechoso sospechoso;

    public Caso(int numeroCaso, String descripCaso, int codigoDePrioridad, String nombClave) {
        this.numeroCaso = numeroCaso;
        this.descripCaso = descripCaso;
        this.codigoDePrioridad = codigoDePrioridad;
        this.nombClave = nombClave;

    }

    public Caso() {
        this.bitacora=new Bitacora();
        this.sospechoso=new Sospechoso();
    }

    /**
     * @return the numeroCaso
     */
    public int getNumeroCaso() {
        return numeroCaso;
    }

    /**
     * @param numeroCaso the numeroCaso to set
     */
    public void setNumeroCaso(int numeroCaso) {
        this.numeroCaso = numeroCaso;
    }

    /**
     * @return the descripCaso
     */
    public String getDescripCaso() {
        return descripCaso;
    }

    /**
     * @param descripCaso the descripCaso to set
     */
    public void setDescripCaso(String descripCaso) {
        this.descripCaso = descripCaso;
    }

    /**
     * @return the codigoDePrioridad
     */
    public int getCodigoDePrioridad() {
        return codigoDePrioridad;
    }

    /**
     * @param codigoDePrioridad the codigoDePrioridad to set
     */
    public void setCodigoDePrioridad(int codigoDePrioridad) {
        this.codigoDePrioridad = codigoDePrioridad;
    }

    /**
     * @return the nombClave
     */
    public String getNombClave() {
        return nombClave;
    }

    /**
     * @param nombClave the nombClave to set
     */
    public void setNombClave(String nombClave) {
        this.nombClave = nombClave;
    }

    /**
     * @return the detective
     */
    public Detective getDetective() {
        return detective;
    }

    /**
     * @param detective the detective to set
     */
    public void setDetective(Detective detective) {
        this.detective = detective;
    }
}
