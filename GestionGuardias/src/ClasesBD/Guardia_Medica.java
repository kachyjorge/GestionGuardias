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
public class Guardia_Medica {
     
    private String fecha_g;
    private int cod_medico;
    private String hora_desde;
    
    private ResultSet rsDatos;
    private PreparedStatement psPrepSencencias;
    
    
    public String getFecha_g() {
        return fecha_g;
    }

    public void setFecha_g(String fecha_g) {
        this.fecha_g = fecha_g;
    }

    public String getHora_desde() {
        return hora_desde;
    }

    public void setHora_desde(String hora_desde) {
        this.hora_desde = hora_desde;
    }

    public int getCod_medico() {
        return cod_medico;
    }

    public void setCod_medico(int cod_medico) {
        this.cod_medico = cod_medico;
    }
    
    
    public void InsertarGuardiaMedico () throws SQLException
    {       
        // Inserta un contacto y devuelve su id 
        try{
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
                   
            psPrepSencencias = cn.prepareStatement("INSERT INTO guardia_has_medicos (fecha_g, hora_desde, cod_medico) VALUES (?,?,?);");
                                                        //PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
                                  
            psPrepSencencias.setString(1, fecha_g);
            psPrepSencencias.setString(2, hora_desde);
            psPrepSencencias.setInt(3, cod_medico);
          
            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
                      
        }catch(SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Medicos.class.getName()).log(Level.SEVERE, null, ex);
       }           
    }
    
}
