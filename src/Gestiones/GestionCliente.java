/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;

import CapaDatos.Conexion;
import Clases.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cesar
 */
public class GestionCliente implements IGestion
{
private Cliente ObCliente = new Cliente(00, "","","","");

    public GestionCliente()
    {
        Conexion.GetInstancia().CadenaConexion(); 
   }
    
    public Cliente getCliente() 
    {
        return ObCliente;
    }
    public void setCliente (Cliente cliente)
    {
        this.ObCliente = cliente;
    }
    @Override
    public void Grabar() throws SQLException 
    {
       try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("INSERT INTO CLIENTE(Cedula, Nombre,Direccion,Telefono) VALUES ('"+ObCliente.getCedula()+"', '"+ObCliente.getNombre()+"', '"+ObCliente.getDireccion()+"', '"+ObCliente.getTelefono()+"')");
        }
        catch(SQLException ex)
        {
            throw ex;            
        } 
        finally
        {
            Conexion.GetInstancia().Desconectar();
        } 
    }

    @Override
    public void Modificar() throws SQLException 
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("UPDATE CLIENTE SET NOMBRE='"+ObCliente.getNombre()+"',TELEFONO='"+ObCliente.getTelefono()+"',Direccion='"+ObCliente.getDireccion()+"' WHERE Cedula = "+ObCliente.getCedula());
        }
        catch(SQLException ex)
        {
            throw ex;            
        } 
        finally
        {
            Conexion.GetInstancia().Desconectar();
        } 
    }

    @Override
    public void Nuevo() throws SQLException 
    {
        ObCliente.setCedula("000000000-0");
        ObCliente.setNombre("SD");
        ObCliente.setDireccion("SD");
        ObCliente.setTelefono("SD");
    }

    @Override
    public void Eliminar() throws SQLException 
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("DELETE FROM CLIENTE WHERE CEDULA = "+ObCliente.getCedula());
        }
        catch(SQLException ex)
        {
            throw ex;            
        } 
        finally
        {
            Conexion.GetInstancia().Desconectar();
        }
    }

    @Override
    public void Consultar() throws SQLException
    {
        try
        {
        Conexion.GetInstancia().Conectar();
           ResultSet rs = Conexion.GetInstancia().EjecutarConsulta("SELECT  NOMBRE, DIRECCION, TELEFONO FROM CLIENTE WHERE CEDULA = '"+ObCliente.getCedula()+"'");
           while(rs.next())
           {  
               //ObCliente.setCedula(rs.getString("CEDULA"));
               ObCliente.setNombre(rs.getString("NOMBRE"));
               ObCliente.setDireccion(rs.getString("DIRECCION"));
               ObCliente.setTelefono(rs.getString("TELEFONO"));
               
           }
        }
        catch(SQLException ex)
        { 
            throw ex;
        }
        finally
        {
            Conexion.GetInstancia().Desconectar(); 
        }
    }
    
}
