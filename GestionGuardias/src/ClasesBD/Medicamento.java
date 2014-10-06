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
public class Medicamento {
    
    private int cod_med;
    private String nombre_med;
    private int stock;
    private int cod_tipo;

    private Statement sentencia;
    private ResultSet rsDatos;
    
    public int getCod_med() {
        return cod_med;
    }

    public void setCod_med(int cod_med) {
        this.cod_med = cod_med;
    }

    public String getNombre_med() {
        return nombre_med;
    }

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCod_tipo() {
        return cod_tipo;
    }

    public void setCod_tipo(int cod_tipo) {
        this.cod_tipo = cod_tipo;
    }
    
    public boolean BuscarCod_M(int cod_m) throws ClassNotFoundException
    {
        boolean band=false;
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            rsDatos = sentencia.executeQuery("select * from medicamentos where medicamentos.cod_med = " + cod_m + ";");
            
            while (rsDatos.next()) 
            {
                band=true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Medicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return band;
    }
    
    public int BuscarStock(int cod_m) throws ClassNotFoundException
    {
        int i = 0;
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            rsDatos = sentencia.executeQuery("select * from medicamentos where medicamentos.cod_med = " + cod_m + ";");
            
            while (rsDatos.next()) 
            {
                i = rsDatos.getInt(3);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Medicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    
}
