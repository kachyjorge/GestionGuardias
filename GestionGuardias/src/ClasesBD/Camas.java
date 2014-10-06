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
public class Camas {
    
    private int idcamas;
    private int nro_hab;
    private boolean estado;

    private PreparedStatement psPrepSencencias;
    private Statement sentencia;
    private ResultSet rsDatos;
    
    public int getIdcamas() {
        return idcamas;
    }

    public void setIdcamas(int idcamas) {
        this.idcamas = idcamas;
    }

    public int getNro_hab() {
        return nro_hab;
    }

    public void setNro_hab(int nro_hab) {
        this.nro_hab = nro_hab;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    public void CargarEstado(int estado, int id) throws SQLException{
        
        try {
            Connection cn = Conexion.Cadena();
            
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            sentencia.execute("update camas set camas.estado = '"+ estado+ "' where camas.idcamas = '"+ id +"';");
                                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Internacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void actualizarEstado(int estado, int id) throws SQLException{
        
        try {
            Connection cn = Conexion.Cadena();
            
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            sentencia.execute("update camas set camas.estado = '"+ estado + "' where camas.idcamas = '"+ id +"';");
                                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Internacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
