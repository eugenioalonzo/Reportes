/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;
import CapaDatos.Conexion;
import Clases.Bodega;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author EugenioSebasthián
 */
public class GestionBodega implements IGestion
{
    Bodega ObBodega = new Bodega(00, "","", "");

    public GestionBodega() 
    {
        Conexion.GetInstancia().CadenaConexion();
    }
    
    public Bodega getBodega()
    {
        return ObBodega;
    }
    public void setBodega(Bodega bodega)
    {
        this.ObBodega = bodega;
    }

    @Override
    public void Grabar() throws SQLException 
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("INSERT INTO Bodega(Codigo, Descripcion, Direccion) VALUES ('"+ObBodega.getCodigo()+"', '"+ObBodega.getDescripcion()+"', '"+ObBodega.getDireccion()+"')");
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
            Conexion.GetInstancia().Ejecutar("UPDATE Bodega SET Descripcion = '"+ObBodega.getDescripcion()+"', Direccion = '"+ObBodega.getDireccion()+"' WHERE Codigo ="+ObBodega.getCodigo());
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
        ObBodega.setCodigo("00");
        ObBodega.setDescripcion("SD");
        ObBodega.setDireccion("SD");
    }

    @Override
    public void Eliminar() throws SQLException 
    {
       try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("DELETE FROM Bodega WHERE Codigo = "+ObBodega.getCodigo());
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
           ResultSet rs = Conexion.GetInstancia().EjecutarConsulta("SELECT  Descripcion, Direccion FROM Bodega WHERE Codigo = '"+ObBodega.getCodigo()+"'");
           while(rs.next())
           {                
               ObBodega.setDescripcion(rs.getString("Descripcion"));
               ObBodega.setDireccion(rs.getString("Direccion"));               
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
