/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesBD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kachy
 */
public class Informe_Guardia {
    
    private String cargo;
    private String nombre;
    private String fecha;
    private String HoraI;
    private String HoraS;

    private Statement sentencia;
    private ResultSet rsDatos;
        
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHoraI() {
        return HoraI;
    }

    public void setHoraI(String HoraI) {
        this.HoraI = HoraI;
    }

    public String getHoraS() {
        return HoraS;
    }

    public void setHoraS(String HoraS) {
        this.HoraS = HoraS;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    public void cargarTabla (JTable T, String fecha) throws SQLException, ClassNotFoundException{
       
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            DefaultTableModel modelo = (DefaultTableModel) T.getModel();
            Object []objeto = new Object[6];
            rsDatos = sentencia.executeQuery("select medicos.apellido_med, medicos.nombre_med, medicos.cargo_med, guardia.fecha_g, guardia.hora_desde, guardia.hora_hasta from medicos inner join guardia_medicos on medicos.cod_medico = guardia_medicos.cod_medico inner join guardia on guardia_medicos.fecha_g = guardia.fecha_g and guardia_medicos.hora_desde = guardia.hora_desde where guardia_medicos.fecha_g = '" + fecha + "';");
            
            while (rsDatos.next()) 
            {
                objeto[0]= rsDatos.getString(4);
                objeto[1]= rsDatos.getString(3); 
                objeto[2]= rsDatos.getString(1);
                objeto[3]= rsDatos.getString(2);
                objeto[4]= rsDatos.getString(5);
                objeto[5]= rsDatos.getString(6);
                modelo.addRow(objeto);
            }
            T.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Informe_Guardia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    public void cargarTablaE (JTable T, String fecha) throws SQLException, ClassNotFoundException{
       
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            DefaultTableModel modelo = (DefaultTableModel) T.getModel();
            Object []objeto = new Object[6];
            rsDatos = sentencia.executeQuery("select enfermeros.apellido_enf, enfermeros.nombre_enf, enfermeros.func_enfermeros, guardia.fecha_g, guardia.hora_desde, guardia.hora_hasta FROM enfermeros inner join `guardia_enfermeros` on `enfermeros`.`cod_enfermero` = `guardia_enfermeros`.`cod_enfermero` inner join `guardia` on guardia.`fecha_g`=`guardia_enfermeros`.`fecha_g` and guardia.`hora_desde`=`guardia_enfermeros`.`hora_desde` where `guardia_enfermeros`.fecha_g = '" + fecha +"';");
            while (rsDatos.next()) 
            {
                objeto[0]= rsDatos.getString(4);
                objeto[1]= rsDatos.getString(3); 
                objeto[2]= rsDatos.getString(1);
                objeto[3]= rsDatos.getString(2);
                objeto[4]= rsDatos.getString(5);
                objeto[5]= rsDatos.getString(6);
                modelo.addRow(objeto);
            }
            T.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Informe_Guardia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void vaciarTabla(JTable T){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) T.getModel();
        int n = modelo.getRowCount();
        for(int i=0 ; i<n ; i++)
            {
                modelo.removeRow(0);
            }
        T.setModel(modelo);
    }

    public boolean BuscarFecha(String fecha) throws ClassNotFoundException
    {
        boolean band=false;
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            rsDatos = sentencia.executeQuery("select * from guardia where fecha_g = '"+ fecha +"';");
            
            while (rsDatos.next()) 
            {
                band = true;
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Informe_Guardia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return band;
    }
}
