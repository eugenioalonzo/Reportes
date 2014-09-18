/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;

import CapaDatos.Conexion;
import Clases.Mercaderia;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cesar
 */
public class GestionMercaderia implements IGestion
{
    private Mercaderia ObProudcto = new Mercaderia(00,"", "", 00.00, 00);

    public GestionMercaderia() 
    {
        Conexion.GetInstancia().CadenaConexion(); 
    }
    
    public Mercaderia getPTroducto()
    {
        return ObProudcto;
    }
    public void setProducto(Mercaderia producto)
    {
        this.ObProudcto = producto;
    }
    
  @Override
    public void Grabar() throws SQLException 
    {
    try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("INSERT INTO Mercaderia (CODIGO, NOMBRE, PRECIOUNITARIO, CANTIDAD) VALUES ('"+ObProudcto.getNombre()+"', '"+ObProudcto.getPrecioUnitario()+"', '"+ObProudcto.getCantidad()+"')");
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
            Conexion.GetInstancia().Ejecutar("UPDATE Mercaderia SET Nombre = '"+ObProudcto.getCantidad()+"','"+ObProudcto.getPrecioUnitario()+"',CANTIDAD = '"+ObProudcto.getCantidad()+"' WHERE Codigo = "+ObProudcto.getCodigo());
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
        //ObProudcto.setId(000);
        ObProudcto.setCodigo("000-000");
        ObProudcto.setNombre("SD");
        ObProudcto.setPrecioUnitario(00.00);
        ObProudcto.setCantidad(00); 
    }

    @Override
    public void Eliminar() throws SQLException 
    {
       try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("DELETE FROM Mercaderia WHERE Codigo = "+ObProudcto.getCodigo());
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
           ResultSet rs = Conexion.GetInstancia().EjecutarConsulta("SELECT NOMBRE, PRECIOUNITARIO, CANTIDAD FROM Mercaderia WHERE Codigo ='"+ObProudcto.getCodigo()+"'");
           while(rs.next())
           {              
               ObProudcto.setCodigo(rs.getString("CODIGO"));
               ObProudcto.setNombre(rs.getString("NOMBRE"));
               ObProudcto.setPrecioUnitario(rs.getDouble("PRECIOUNITARIO"));
               ObProudcto.setCantidad(rs.getInt("CANTIDAD")); 
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
