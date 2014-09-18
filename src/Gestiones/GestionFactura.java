/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;

import Clases.Factura;
import java.sql.SQLException;

/**
 *
 * @author EugenioSebasthián
 */
public class GestionFactura implements IGestion
{
    Factura ObFactura = new Factura(00, null, null, null, null, 00, 00.00);
    @Override
    public void Grabar() throws SQLException
    {
        
          
    }

    @Override
    public void Modificar() throws SQLException 
    {
        
    }

    @Override
    public void Nuevo() throws SQLException 
    {
        
    }

    @Override
    public void Eliminar() throws SQLException 
    {
        
    }

    @Override
    public void Consultar() throws SQLException 
    {
       
    }
    
}
