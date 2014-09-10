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
    private int peso;
    private int talle;
    private int pacientes_dni_p;
    private int internacion_cod_int;
    private int patologias_cod_patologia;
    private int medicos_cod_personal;
    
    Connection conexion; 
    Statement sentencia;
    ResultSet rsDatos;
    PreparedStatement psPrepSencencias;
    
    public Historia_Clinica(int nro_consulta, String fecha_atencion, int peso, int talle, int pacientes_dni_p, int internacion_cod_int, int patologias_cod_patologia, int medicos_cod_personal) {
        this.nro_consulta = nro_consulta;
        this.fecha_atencion = fecha_atencion;
        this.peso = peso;
        this.talle = talle;
        this.pacientes_dni_p = pacientes_dni_p;
        this.internacion_cod_int = internacion_cod_int;
        this.patologias_cod_patologia = patologias_cod_patologia;
        this.medicos_cod_personal = medicos_cod_personal;
    }
    
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public int getPacientes_dni_p() {
        return pacientes_dni_p;
    }

    public void setPacientes_dni_p(int pacientes_dni_p) {
        this.pacientes_dni_p = pacientes_dni_p;
    }

    public int getInternacion_cod_int() {
        return internacion_cod_int;
    }

    public void setInternacion_cod_int(int internacion_cod_int) {
        this.internacion_cod_int = internacion_cod_int;
    }

    public int getPatologias_cod_patologia() {
        return patologias_cod_patologia;
    }

    public void setPatologias_cod_patologia(int patologias_cod_patologia) {
        this.patologias_cod_patologia = patologias_cod_patologia;
    }

    public int getMedicos_cod_personal() {
        return medicos_cod_personal;
    }

    public void setMedicos_cod_personal(int medicos_cod_personal) {
        this.medicos_cod_personal = medicos_cod_personal;
    }



public int Cargar_Historia_Clinica (String peso, String talla, String diagnostico, String patologia, String f_ingreso, String practica, String medico) throws SQLException
    {
        // Inserta un contacto y devuelve su id 
        try{
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = conexion.prepareStatement("INSERT INTO historia_clinica (nro_consulta, fecha_atencion, peso, talla) VALUES (?,?,?,?);", PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            //psPrepSencencias.setString(1, Nombre);
            psPrepSencencias.setString(2, f_ingreso);
            psPrepSencencias.setString(3, peso);
            psPrepSencencias.setString(4, talla);
            
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
