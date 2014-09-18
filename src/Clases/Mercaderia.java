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
public class Mercaderia
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


    private String Nombre;

    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() 
    {
        return Nombre;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    private double PrecioUnitario;

    /**
     * Get the value of PrecioUnitario
     *
     * @return the value of PrecioUnitario
     */
    public double getPrecioUnitario() 
    {
        return PrecioUnitario;
    }

    /**
     * Set the value of PrecioUnitario
     *
     * @param PrecioUnitario new value of PrecioUnitario
     */
    public void setPrecioUnitario(double PrecioUnitario)
    {
        this.PrecioUnitario = PrecioUnitario;
    }

    private int Cantidad;

    /**
     * Get the value of Cantidad
     *
     * @return the value of Cantidad
     */
    public int getCantidad() 
    {
        return Cantidad;
    }

    /**
     * Set the value of Cantidad
     *
     * @param Cantidad new value of Cantidad
     */
    public void setCantidad(int Cantidad) 
    {
        this.Cantidad = Cantidad;
    }

    public Mercaderia(int Id, String Codigo, String Nombre, double PrecioUnitario, int Cantidad) 
    {
        this.Id = Id;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.PrecioUnitario = PrecioUnitario;
        this.Cantidad = Cantidad;
    }

    

}
