/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesBD;

//import java.sql.Connection;
import java.sql.*;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;


/**
 *
 * @author kachy
 */
public class Tutores {

    private int dni_tutor;
    private String nombre_t;
    private String apellido_t;
    private int tel_t;
    
    Connection conexion; 
    Statement sentencia;
    ResultSet rsDatos;
    PreparedStatement psPrepSencencias;
    
    public Tutores(int dni_tutor, String nombre_t, String apellido_t, int tel_t) {
        this.dni_tutor = dni_tutor;
        this.nombre_t = nombre_t;
        this.apellido_t = apellido_t;
        this.tel_t = tel_t;
    }
    
    public int getDni_tutor() {
        return dni_tutor;
    }

    public void setDni_tutor(int dni_tutor) {
        this.dni_tutor = dni_tutor;
    }

    public String getNombre_t() {
        return nombre_t;
    }

    public void setNombre_t(String nombre_t) {
        this.nombre_t = nombre_t;
    }

    public String getApellido_t() {
        return apellido_t;
    }

    public void setApellido_t(String apellido_t) {
        this.apellido_t = apellido_t;
    }

    public int getTel_t() {
        return tel_t;
    }

    public void setTel_t(int tel_t) {
        this.tel_t = tel_t;
    }

    public int InsertarTutor (int dni_tutor, String nombre_t, String apellido_t, int tel_t) throws SQLException
    {
        // Inserta un contacto y devuelve su id 
        try{
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = conexion.prepareStatement("INSERT INTO tutores (dni_tutor, nombre_t, apellido_t, tel_t)" + " VALUES (?,?,?,?);",
                                                        PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            //psPrepSencencias.setString(1, Nombre);
            psPrepSencencias.setInt(1, dni_tutor);
            psPrepSencencias.setString(2, nombre_t);
            psPrepSencencias.setString(3, apellido_t);
            psPrepSencencias.setInt(4, tel_t);
            //rpta = ps.executeUpdate() == 1;
            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            rsDatos = psPrepSencencias.getGeneratedKeys();
            rsDatos.first();
            return rsDatos.getInt(1);
            
        }catch(SQLException e) {
            throw e;
        }           
        
    }
}
