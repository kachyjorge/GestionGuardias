/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesBD;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import menu.*;
/**
 *
 * @author kachy
 */
public class Medicos {

       
    private int cod_medico;
    private String esp_medica;
    private String cargo_med;
    private String nombre_med;
    private String apellido_med;
    private String direccion_med;
        
    private Statement sentencia;
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;

   
    
    public int getCod_medico() {
        return cod_medico;
    }

    public void setCod_medico(int cod_medico) {
        this.cod_medico = cod_medico;
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

   
    public void InsertarMedico () throws SQLException
    {       
        // Inserta un contacto y devuelve su id 
        try{
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
                   
            psPrepSencencias = cn.prepareStatement("INSERT INTO medicos (cod_medico, esp_medica, cargo_med, nombre_med, apellido_med, direccion_med) VALUES (?,?,?,?,?,?);");
                                                        //PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
                                  
            psPrepSencencias.setInt(1, cod_medico);
            psPrepSencencias.setString(2, esp_medica);
            psPrepSencencias.setString(3, cargo_med);
            psPrepSencencias.setString(4, nombre_med);
            psPrepSencencias.setString(5, apellido_med);
            psPrepSencencias.setString(6, direccion_med);
           
            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
                      
        }catch(SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Medicos.class.getName()).log(Level.SEVERE, null, ex);
       }           
    }
    
       
}
