/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesBD;
import java.sql.*;
/**
 *
 * @author fdqc
 */
public class Historia_Clinica {

   

    private int nro_consulta;
    private String fecha_atencion;
    private String peso;
    private String talle;
    private String practicas;
    private int dni_p;
    private int cod_int;
    private int cod_patologia;
    private int cod_medico;
    
    Connection conexion; 
    Statement sentencia;
    ResultSet rsDatos;
    PreparedStatement psPrepSencencias;

    public int getNro_consulta() {
        return nro_consulta;
    }

    public void setNro_consulta(int nro_consulta) {
        this.nro_consulta = nro_consulta;
    }

    public String getFecha_atencion() {
        return fecha_atencion;
    }

    public void setFecha_atencion(String fecha_atencion) {
        this.fecha_atencion = fecha_atencion;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getPracticas() {
        return practicas;
    }

    public void setPracticas(String practicas) {
        this.practicas = practicas;
    }

    public int getDni_p() {
        return dni_p;
    }

    public void setDni_p(int dni_p) {
        this.dni_p = dni_p;
    }

    public int getCod_int() {
        return cod_int;
    }

    public void setCod_int(int cod_int) {
        this.cod_int = cod_int;
    }

    public int getCod_patologia() {
        return cod_patologia;
    }

    public void setCod_patologia(int cod_patologia) {
        this.cod_patologia = cod_patologia;
    }

    public int getCod_medico() {
        return cod_medico;
    }

    public void setCod_medico(int cod_medico) {
        this.cod_medico = cod_medico;
    }
    
    
    

    public int Cargar_Historia_Clinica () throws SQLException
        {
        // Inserta un contacto y devuelve su id 
         try{
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = conexion.prepareStatement("INSERT INTO historia_clinica (fecha_atencion, peso, talle, practicas, dni_p, cod_int, cod_patologia, cod_medico) VALUES (?,?,?,?,?,?,?,?);",
                                                            PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            psPrepSencencias.setString(1, fecha_atencion);
            psPrepSencencias.setString(2, peso);
            psPrepSencencias.setString(3, talle);
            psPrepSencencias.setString(4, practicas);
            psPrepSencencias.setInt(5, dni_p);
            psPrepSencencias.setInt(6, cod_int);
            psPrepSencencias.setInt(7, cod_patologia);
            psPrepSencencias.setInt(8, cod_medico);
            
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
