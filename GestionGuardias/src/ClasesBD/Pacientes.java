/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesBD;

import java.sql.*;
import ClasesBD.Conexion;
/**
 *
 * @author kachy
 */
public class Pacientes {

    private int dni_p;
    private String nombre_pac;
    private String apellido_pac;
    private String domicilio_pac;
    private String localidad;
    private Date fecha;
    private String sexo;
    private String obra_social;
    private int tutores_dni_tutor;
  
    public Pacientes(int dni_p, String nombre_pac, String apellido_pac, String domicilio_pac, String localidad, Date fecha, String sexo, String obra_social, int tutores_dni_tutor) {
        this.dni_p = dni_p;
        this.nombre_pac = nombre_pac;
        this.apellido_pac = apellido_pac;
        this.domicilio_pac = domicilio_pac;
        this.localidad = localidad;
        this.fecha = fecha;
        this.sexo = sexo;
        this.obra_social = obra_social;
        this.tutores_dni_tutor = tutores_dni_tutor;
    }
    
    public void setApellido_pac(String apellido_pac) {
        this.apellido_pac = apellido_pac;
    }

    public void setDomicilio_pac(String domicilio_pac) {
        this.domicilio_pac = domicilio_pac;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setObra_social(String obra_social) {
        this.obra_social = obra_social;
    }

    public void setTutores_dni_tutor(int tutores_dni_tutor) {
        this.tutores_dni_tutor = tutores_dni_tutor;
    }

    public String getApellido_pac() {
        return apellido_pac;
    }

    public String getDomicilio_pac() {
        return domicilio_pac;
    }

    public String getLocalidad() {
        return localidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public String getObra_social() {
        return obra_social;
    }

    public int getTutores_dni_tutor() {
        return tutores_dni_tutor;
    }
 
    public int getDni_p() {
        return dni_p;
    }

    public void setDni_p(int dni_p) {
        this.dni_p = dni_p;
    }

    public String getNombre_pac() {
        return nombre_pac;
    }

    public void setNombre_pac(String nombre_pac) {
        this.nombre_pac = nombre_pac;
    }

    
 
  /**Inser
     * @throws java.lang.Exceptiont**/

/** public boolean insertar(Pacientes objPacientes) throws Exception{
boolean rpta = false;
Connection con = null;
PreparedStatement ps = null;
try {
    if (objPacientes != null) 
    {
        
        String sql = "INSERT INTO Pacientes (dni_p, nombre_pac, apellido_pac, "
                + "domicilio_pac, localidad, fecha, sexo, Obra_social, tutores_dni_tutor)"
                + " VALUES (?,?,?,?,?,?,?,?,?);";
        ps = con.prepareStatement(sql);
        ps.setInt(1,objPacientes.getDni_p());
        ps.setString(2,objPacientes.getNombre_pac());
        ps.setString(3,objPacientes.getApellido_pac());
        ps.setString(4,objPacientes.getDomicilio_pac());
        ps.setString(5,objPacientes.getLocalidad());
        ps.setDate(6,objPacientes.getFecha());
        ps.setString(7,objPacientes.getSexo());
        ps.setString(8,objPacientes.getObra_social());
        ps.setInt(9,objPacientes.getTutores_dni_tutor());
        rpta = ps.executeUpdate() == 1;
    }
} catch (Exception e) 
{
    e.printStackTrace();
} finally {
try {
        ps.close();
        con.close();
    } catch (Exception e) 
    {
        e.printStackTrace();
    }
}
return rpta;
} **/
    public int InsertarContacto (String Nombre) throws SQLException
    {
    Statement sentencia;
    ResultSet rsDatos;
    PreparedStatement psPrepSencencias;
    Conexion con = null;
        // Inserta un contacto y devuelve su id 
        try{
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            con = new Conexion();
            psPrepSencencias = con.prepareStatement("insert into contactos (nombre) values (?)",
                                                          PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            psPrepSencencias.setString(1, Nombre);
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
