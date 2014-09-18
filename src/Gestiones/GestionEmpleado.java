/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;

import CapaDatos.Conexion;
import Clases.Empleado;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cesar
 */
public class GestionEmpleado implements IGestion
{
    Empleado ObEmpleado = new Empleado(0,"","","","");

    public GestionEmpleado() 
    {
        Conexion.GetInstancia().CadenaConexion();
    }
    public Empleado getEmpleado()
    {
        return ObEmpleado;
    }
    public void setEmpleado(Empleado empleado)
    {
        this.ObEmpleado=empleado;
    }
    
    @Override
    public void Grabar() throws SQLException 
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("INSERT INTO EMPLEADO (CEDULA, NOMBRE, DIRECCION, TELEFONO) VALUES ('"+ObEmpleado.getCedula()+"','"+ObEmpleado.getNombre()+"', '"+ObEmpleado.getDireccion()+"', '"+ObEmpleado.getTelefono()+"')");
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
            Conexion.GetInstancia().Ejecutar("UPDATE EMPLEADO SET Nombre = '"+ObEmpleado.getNombre()+"',DIRECCION = '"+ObEmpleado.getDireccion()+"', TELEFONO ='"+ ObEmpleado.getTelefono()+"'  WHERE Cedula = "+ObEmpleado.getCedula());
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
        ObEmpleado.setCedula("000000000-0");
        ObEmpleado.setNombre("SD");
        ObEmpleado.setDireccion("SD");
        ObEmpleado.setTelefono("SD"); 
    }

    @Override
    public void Eliminar() throws SQLException 
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("DELETE FROM EMPLEADO WHERE cedula = "+ObEmpleado.getCedula());
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
           ResultSet rs = Conexion.GetInstancia().EjecutarConsulta("SELECT NOMBRE, DIRECCION, TELEFONO FROM Empleado WHERE Cedula ='"+ObEmpleado.getCedula()+"'");
           while(rs.next())
           {      
               //ObEmpleado.setCedula(rs.getString("CEDULA"));
               ObEmpleado.setNombre(rs.getString("NOMBRE"));
               ObEmpleado.setDireccion(rs.getString("DIRECCION"));
               ObEmpleado.setTelefono(rs.getString("TELEFONO")); 
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
