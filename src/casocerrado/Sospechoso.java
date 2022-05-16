/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casocerrado;

/**
 *
 * @author JUAN ESTEBAN
 */
public class Sospechoso {
    private long numDeIdentidad;
    private String nombre;
    private String alias;
    private int edad;
    private String ultiDireccion;
    private int numDeVivienda;
    private String localidad;
    private String ciudad;
    private String departamento;
    private String pais;
    private String fotografia;
    private String caractFisicas;

    public Sospechoso() {
    }

    public Sospechoso(long numDeIdentidad, String nombre, String alias, int edad, String ultiDireccion, int numDeVivienda, String localidad, String ciudad, String departamento, String pais, String fotografia, String caractFisicas) {
        this.numDeIdentidad = numDeIdentidad;
        this.nombre = nombre;
        this.alias = alias;
        this.edad = edad;
        this.ultiDireccion = ultiDireccion;
        this.numDeVivienda = numDeVivienda;
        this.localidad = localidad;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
        this.fotografia = fotografia;
        this.caractFisicas = caractFisicas;
    }

    /**
     * @return the numDeIdentidad
     */
    public long getNumDeIdentidad() {
        return numDeIdentidad;
    }

    /**
     * @param numDeIdentidad the numDeIdentidad to set
     */
    public void setNumDeIdentidad(long numDeIdentidad) {
        this.numDeIdentidad = numDeIdentidad;
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
     * @return the alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the ultiDireccion
     */
    public String getUltiDireccion() {
        return ultiDireccion;
    }

    /**
     * @param ultiDireccion the ultiDireccion to set
     */
    public void setUltiDireccion(String ultiDireccion) {
        this.ultiDireccion = ultiDireccion;
    }

    /**
     * @return the numDeVivienda
     */
    public int getNumDeVivienda() {
        return numDeVivienda;
    }

    /**
     * @param numDeVivienda the numDeVivienda to set
     */
    public void setNumDeVivienda(int numDeVivienda) {
        this.numDeVivienda = numDeVivienda;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the fotografia
     */
    public String getFotografia() {
        return fotografia;
    }

    /**
     * @param fotografia the fotografia to set
     */
    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    /**
     * @return the caractFisicas
     */
    public String getCaractFisicas() {
        return caractFisicas;
    }

    /**
     * @param caractFisicas the caractFisicas to set
     */
    public void setCaractFisicas(String caractFisicas) {
        this.caractFisicas = caractFisicas;
    }
}
