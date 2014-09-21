/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesBD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kachy
 */
public class Enfermeros {
    
    private int cod_enfermero;
    private String func_enfermeros;
    private String nombre_enf;
    private String apellido_enf;
    private String direccion_enf;
      
    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;

    
    public int getCod_enfermero() {
        return cod_enfermero;
    }

    public void setCod_enfermero(int cod_enfermero) {
        this.cod_enfermero = cod_enfermero;
    }

    public String getFunc_enfermeros() {
        return func_enfermeros;
    }

    public void setFunc_enfermeros(String func_enfermeros) {
        this.func_enfermeros = func_enfermeros;
    }

    public String getNombre_enf() {
        return nombre_enf;
    }

    public void setNombre_enf(String nombre_enf) {
        this.nombre_enf = nombre_enf;
    }

    public String getApellido_enf() {
        return apellido_enf;
    }

    public void setApellido_enf(String apellido_enf) {
        this.apellido_enf = apellido_enf;
    }

    public String getDireccion_enf() {
        return direccion_enf;
    }

    public void setDireccion_enf(String direccion_enf) {
        this.direccion_enf = direccion_enf;
    }
    
      
    public void InsertarEnfermero () throws SQLException, ClassNotFoundException
    {
       
        // Inserta un contacto y devuelve su id 
       
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("INSERT INTO enfermeros (cod_enfermero, func_enfermeros, nombre_enf, apellido_enf, direccion_enf) VALUES (?,?,?,?,?);");
                                                       // PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            
            psPrepSencencias.setInt(1, cod_enfermero);
            psPrepSencencias.setString(2, func_enfermeros);
            psPrepSencencias.setString(3, nombre_enf);
            psPrepSencencias.setString(4, apellido_enf);
            psPrepSencencias.setString(5, direccion_enf);
                    
            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
           
    }
    
    public String CargarNombre() throws ClassNotFoundException
    {
        String ape = null;
         try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
           
            rsDatos = sentencia.executeQuery("select * from enfermeros");
            while (rsDatos.next()) 
            {
                ape = rsDatos.getString("apellido_enf");
                    //band=true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Medicos.class.getName()).log(Level.SEVERE, null, ex);
        }
         return ape;
    }

        
    
}
