/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kachy
 */
public class HistoriaC_Medicamentos {
    private int nro_consulta;
    private int cod_med;
    private String fecha;

    private PreparedStatement psPrepSencencias;
    private Statement sentencia;
    
    public int getNro_consulta() {
        return nro_consulta;
    }

    public void setNro_consulta(int nro_consulta) {
        this.nro_consulta = nro_consulta;
    }

    public int getCod_med() {
        return cod_med;
    }

    public void setCod_med(int cod_med) {
        this.cod_med = cod_med;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
        
    public void InsertarHC_Medicamentos () throws SQLException
    {       
        // Inserta un contacto y devuelve su id 
        try{
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
                   
            psPrepSencencias = cn.prepareStatement("INSERT INTO historia_clinica_medicamentos (nro_consulta, cod_med, fecha) VALUES (?,?,?);");
                                                        //PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            psPrepSencencias.setInt(1, nro_consulta);
            psPrepSencencias.setInt(2, cod_med);
            psPrepSencencias.setString(3, fecha);
            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
                      
        }catch(SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoriaC_Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
       }           
    }
    
    public void actualizarStock(int Stock, int cod) throws SQLException{
        
        try {
            Connection cn = Conexion.Cadena();
            
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            sentencia.execute("update medicamentos set medicamentos.stock = " + Stock + " where medicamentos.cod_med = " + cod + ";");
                                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoriaC_Medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
