/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesBD;
import java.sql.*;
/**
 *
 * @author kachy
 */
public class Medicos {

       
    private int cod_personal;
    private String esp_medica;
    private String cargo_med;
    private String nombre_med;
    private String apellido_med;
    private String direccion_med;
    
    Connection conexion; 
    Statement sentencia;
    ResultSet rsDatos;
    PreparedStatement psPrepSencencias;
    
    
    public Medicos(int cod_personal, String esp_medica, String cargo_med, String nombre_med, String apellido_med, String direccion_med) {
        this.cod_personal = cod_personal;
        this.esp_medica = esp_medica;
        this.cargo_med = cargo_med;
        this.nombre_med = nombre_med;
        this.apellido_med = apellido_med;
        this.direccion_med = direccion_med;
    }
    
    public int getCod_personal() {
        return cod_personal;
    }

    public void setCod_personal(int cod_personal) {
        this.cod_personal = cod_personal;
    }

    public String getEsp_medica() {
        return esp_medica;
    }

    public void setEsp_medica(String esp_medica) {
        this.esp_medica = esp_medica;
    }

    public String getCargo_med() {
        return cargo_med;
    }

    public void setCargo_med(String cargo_med) {
        this.cargo_med = cargo_med;
    }

    public String getNombre_med() {
        return nombre_med;
    }

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
    }

    public String getApellido_med() {
        return apellido_med;
    }

    public void setApellido_med(String apellido_med) {
        this.apellido_med = apellido_med;
    }

    public String getDireccion_med() {
        return direccion_med;
    }

    public void setDireccion_med(String direccion_med) {
        this.direccion_med = direccion_med;
    }

    
    
    public int Cargar_medico (String cod_med, String especialidad, String cargo, String nombre, String apellido, String direccion) throws SQLException
    {
        // Inserta un contacto y devuelve su id 
        try{
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = conexion.prepareStatement("INSERT INTO medicos (cod_personal, esp_medica, cargo_med, nombre_med, apellido_med, direcion_med) VALUES (?,?,?,?);", PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            //psPrepSencencias.setString(1, cod_med);   NO ENTIENDO.. PREGUNTAR
            psPrepSencencias.setString(2, especialidad);
            psPrepSencencias.setString(3, cargo);
            psPrepSencencias.setString(4, nombre);
            psPrepSencencias.setString(5, apellido);
            psPrepSencencias.setString(6, direccion);
            
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
