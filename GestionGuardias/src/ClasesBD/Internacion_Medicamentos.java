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
public class Internacion_Medicamentos {
    private int cod_int;
    private int cod_med;
    private String hora;
    private int cod_enfermero;
    private String fecha;

    private PreparedStatement psPrepSencencias;
    private Statement sentencia;
    private ResultSet rsDatos;
    
    public int getCod_int() {
        return cod_int;
    }

    public void setCod_int(int cod_int) {
        this.cod_int = cod_int;
    }

    public int getCod_med() {
        return cod_med;
    }

    public void setCod_med(int cod_med) {
        this.cod_med = cod_med;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getCod_enfermero() {
        return cod_enfermero;
    }

    public void setCod_enfermero(int cod_enfermero) {
        this.cod_enfermero = cod_enfermero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    public void InsertarInternacion_Medicamentos () throws SQLException
    {       
        // Inserta un contacto y devuelve su id 
        try{
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
                   
            psPrepSencencias = cn.prepareStatement("INSERT INTO internacion_medicamentos (cod_int, cod_med, fecha, hora, cod_enfermero) VALUES (?,?,?,?,?);");
                                                        //PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            psPrepSencencias.setInt(1, cod_int);
            psPrepSencencias.setInt(2, cod_med);
            psPrepSencencias.setString(3, fecha);
            psPrepSencencias.setString(4, hora);
            psPrepSencencias.setInt(5, cod_enfermero);
            
            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
                      
        }catch(SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Internacion_Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
       }           
    }
    
    public boolean cargarInforme (JTable T, String fecha) throws SQLException, ClassNotFoundException{
       boolean band = false;
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            DefaultTableModel modelo = (DefaultTableModel) T.getModel();
            Object []objeto = new Object[5];
            rsDatos = sentencia.executeQuery("select internacion_medicamentos.fecha, medicamentos.nombre_med, count(medicamentos.`cod_med`) as `Dosis`, tipos.descripcion, enfermeros.apellido_enf, enfermeros.nombre_enf \n" +
                                            "from internacion_medicamentos inner join medicamentos on internacion_medicamentos.cod_med = medicamentos.cod_med \n" +
                                            "inner join tipos on medicamentos.cod_tipo = tipos.cod_tipo\n" +
                                            "inner join enfermeros on internacion_medicamentos.cod_enfermero = enfermeros.cod_enfermero\n" +
                                            "where internacion_medicamentos.fecha = '" + fecha + "' group by medicamentos.`cod_med`;");
                                            
            while (rsDatos.next()) 
            {
                objeto[0]= rsDatos.getString(1);
                objeto[1]= rsDatos.getString(2); 
                objeto[2]= rsDatos.getInt(3);
                objeto[3]= rsDatos.getString(4);
                objeto[4]= rsDatos.getString(5) + ", "+ rsDatos.getString(6);
                               
                modelo.addRow(objeto);
                band = true;
            }
            T.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Internacion_Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
       return band;
    }
    
    public boolean cargarInformeI (JTable T, String fecha) throws SQLException, ClassNotFoundException{
       boolean band = false;
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            DefaultTableModel modelo = (DefaultTableModel) T.getModel();
            Object []objeto = new Object[4];
            rsDatos = sentencia.executeQuery("select historia_clinica_medicamentos.fecha, medicamentos.nombre_med, count(medicamentos.`cod_med`) as `Dosis`, tipos.descripcion \n" +
                                            "from medicamentos inner join historia_clinica_medicamentos on medicamentos.cod_med = historia_clinica_medicamentos.cod_med\n" +
                                            "inner join tipos on medicamentos.cod_tipo = tipos.cod_tipo \n" +
                                            "where historia_clinica_medicamentos.fecha = '" + fecha + "' group by medicamentos.`cod_med`;");
                                            
            while (rsDatos.next()) 
            {
                objeto[0]= rsDatos.getString(1);
                objeto[1]= rsDatos.getString(2); 
                objeto[2]= rsDatos.getInt(3);
                objeto[3]= rsDatos.getString(4);
                
                modelo.addRow(objeto);
               band=true;
            }
            T.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Internacion_Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
       return band;
    }
    
}
