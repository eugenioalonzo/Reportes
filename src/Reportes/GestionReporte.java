/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JInternalFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Cesar
 */
public class GestionReporte extends JInternalFrame
{
    public void ReporteCliente () throws JRException, SQLException
    {
        Connection cn;
        cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Reportes","sa","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("ReporteCliente.jasper");
        JasperPrint imp = JasperFillManager.fillReport(reporte, null , cn);
        
        JasperViewer ver = new JasperViewer(imp);
        ver.setTitle("Cliente");
        ver.setVisible(true);
    }        
            
    
    
    public void ReporteEmpleados() throws JRException, SQLException
    {
        Connection cn;
        cn= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Reportes","sa","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("ReporteEmpleados.jasper");
        JasperPrint imp = JasperFillManager.fillReport(reporte, null,cn);
        
        JasperViewer ver= new JasperViewer(imp);
        ver.setTitle("EMPLEADOS");
        ver.setVisible(true);
    }
   public void ReporteBodega ()throws JRException, SQLException
   {
      Connection cn;
        cn= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Reportes","sa","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("ReporteBodegas.jasper");
        JasperPrint imp = JasperFillManager.fillReport(reporte, null,cn);
        
        JasperViewer ver= new JasperViewer(imp);
        ver.setTitle("BODEGA");
        ver.setVisible(true);
   }
    
    public void ReporteProducto() throws SQLException, JRException 
    {
        Connection cn;
        cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Reportes","sa","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("ReporteMercaderias.jasper");
        JasperPrint imp = JasperFillManager.fillReport(reporte, null, cn);
        
        JasperViewer ver = new JasperViewer(imp);
        ver.setTitle("Producto");
        ver.setVisible(true);         
        
    }
    
    
    
}
