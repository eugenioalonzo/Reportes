/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author EugenioSebasthián
 */
public class Bodega 
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
    
    private String Codigo;

    /**
     * Get the value of Codigo
     *
     * @return the value of Codigo
     */
    public String getCodigo() 
    {
        return Codigo;
    }

    /**
     * Set the value of Codigo
     *
     * @param Codigo new value of Codigo
     */
    public void setCodigo(String Codigo) 
    {
        this.Codigo = Codigo;
    }

    private String Descripcion;

    /**
     * Get the value of Descripcion
     *
     * @return the value of Descripcion
     */
    public String getDescripcion() 
    {
        return Descripcion;
    }

    /**
     * Set the value of Descripcion
     *
     * @param Descripcion new value of Descripcion
     */
    public void setDescripcion(String Descripcion) 
    {
        this.Descripcion = Descripcion;
    }

    private String Direccion;

    /**
     * Get the value of Direccion
     *
     * @return the value of Direccion
     */
    public String getDireccion()
    {
        return Direccion;
    }

    /**
     * Set the value of Direccion
     *
     * @param Direccion new value of Direccion
     */
    public void setDireccion(String Direccion) 
    {
        this.Direccion = Direccion;
    }

    public Bodega(int Id, String Codigo, String Descripcion, String Direccion)
    {
        this.Id = Id;
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Direccion = Direccion;
    }

    

}
