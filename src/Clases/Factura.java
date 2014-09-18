/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author EugenioSebasthián
 */
public class Factura 
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

    private Cliente IdCliente;

    /**
     * Get the value of IdCliente
     *
     * @return the value of IdCliente
     */
    public Cliente getIdCliente() 
    {
        return IdCliente;
    }

    /**
     * Set the value of IdCliente
     *
     * @param IdCliente new value of IdCliente
     */
    public void setIdCliente(Cliente IdCliente) 
    {
        this.IdCliente = IdCliente;
    }

    private Empleado IdEmpleado;

    /**
     * Get the value of IdEmpleado
     *
     * @return the value of IdEmpleado
     */
    public Empleado getIdEmpleado() 
    {
        return IdEmpleado;
    }

    /**
     * Set the value of IdEmpleado
     *
     * @param IdEmpleado new value of IdEmpleado
     */
    public void setIdEmpleado(Empleado IdEmpleado) 
    {
        this.IdEmpleado = IdEmpleado;
    }

    private Mercaderia IdMercaderia;

    /**
     * Get the value of IdMercaderia
     *
     * @return the value of IdMercaderia
     */
    public Mercaderia getIdMercaderia() 
    {
        return IdMercaderia;
    }

    /**
     * Set the value of IdMercaderia
     *
     * @param IdMercaderia new value of IdMercaderia
     */
    public void setIdMercaderia(Mercaderia IdMercaderia) 
    {
        this.IdMercaderia = IdMercaderia;
    }
    
    private Date Fecha;

    /**
     * Get the value of Fecha
     *
     * @return the value of Fecha
     */
    public Date getFecha() 
    {
        return Fecha;
    }

    /**
     * Set the value of Fecha
     *
     * @param Fecha new value of Fecha
     */
    public void setFecha(Date Fecha) 
    {
        this.Fecha = Fecha;
    }
    
    private int Cantidad;

    /**
     * Get the value of Cantidad
     *
     * @return the value of Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * Set the value of Cantidad
     *
     * @param Cantidad new value of Cantidad
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    private double Valor;

    /**
     * Get the value of Valor
     *
     * @return the value of Valor
     */
    public double getValor() 
    {
        return Valor;
    }

    /**
     * Set the value of Valor
     *
     * @param Valor new value of Valor
     */
    public void setValor(double Valor) 
    {
        this.Valor = Valor;
    }

    public Factura(int Id, Cliente IdCliente, Empleado IdEmpleado, Mercaderia IdMercaderia, Date Fecha, int Cantidad, double Valor) 
    {
        this.Id = Id;
        this.IdCliente = IdCliente;
        this.IdEmpleado = IdEmpleado;
        this.IdMercaderia = IdMercaderia;
        this.Fecha = Fecha;
        this.Cantidad = Cantidad;
        this.Valor = Valor;
    }

    

}
