/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 *
 * @author Cesar
 */
public class Empleado 
{
    
    private int Id;

    /**
     * Get the value of Id
     *
     * @return the value of Id
     */
    public int getId() 
    {
        return Id;
    }

    /**
     * Set the value of Id
     *
     * @param Id new value of Id
     */
    public void setId(int Id) 
    {
        this.Id = Id;
    }

    private String Cedula;

    /**
     * Get the value of Cedula
     *
     * @return the value of Cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * Set the value of Cedula
     *
     * @param Cedula new value of Cedula
     */
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

       private String Nombre;

    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
 
    private String Direccion;

    /**
     * Get the value of Direccion
     *
     * @return the value of Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * Set the value of Direccion
     *
     * @param Direccion new value of Direccion
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    private String Telefono;

    /**
     * Get the value of Telefono
     *
     * @return the value of Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * Set the value of Telefono
     *
     * @param Telefono new value of Telefono
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Empleado(int Id, String Cedula, String Nombre, String Direccion, String Telefono) 
    {
        this.Id = Id;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

}
