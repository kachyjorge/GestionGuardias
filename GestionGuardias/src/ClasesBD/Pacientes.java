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
public class Pacientes {

    
    private int dni_p;
    private String nombre_pac;
    private String apellido_pac;
    private String domicilio_pac;
    private String localidad;
    private String fecha;
    private String sexo;
    private String obra_social;
    private int nro_afiliado;
    private int dni_tutor;
  
    private Statement sentencia;
    private PreparedStatement psPrepSencencias;
    private ResultSet rsDatos;
    
/**    Connection conexion; 
    Statement sentencia;
    ResultSet rsDatos;
    
    
    
    public Pacientes(int dni_p, String nombre_pac, String apellido_pac, String domicilio_pac, String localidad, String fecha, String sexo, String obra_social, int nro_afiliado, int tutores_dni_tutor) throws ClassNotFoundException, SQLException {
        this.dni_p = dni_p;
        this.nombre_pac = nombre_pac;
        this.apellido_pac = apellido_pac;
        this.domicilio_pac = domicilio_pac;
        this.localidad = localidad;
        this.fecha = fecha;
        this.sexo = sexo;
        this.obra_social = obra_social;
        this.nro_afiliado = nro_afiliado;
        this.tutores_dni_tutor = tutores_dni_tutor;
        
        
    }    **/

   

    public int getDni_tutor() {
        return dni_tutor;
    }

    public void setDni_tutor(int dni_tutor) {
        this.dni_tutor = dni_tutor;
    }

    public int getNro_afiliado() {
        return nro_afiliado;
    }

    public void setNro_afiliado(int nro_afiliado) {
        this.nro_afiliado = nro_afiliado;
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

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setObra_social(String obra_social) {
        this.obra_social = obra_social;
    }

    public void setTutores_dni_tutor(int tutores_dni_tutor) {
        this.dni_tutor = tutores_dni_tutor;
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

    public String getFecha() {
        return fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public String getObra_social() {
        return obra_social;
    }

    public int getTutores_dni_tutor() {
        return dni_tutor;
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

  
    public void cargarPaciente() throws SQLException, ClassNotFoundException{
          
        
        //PreparedStatement pstt = conexion.prepareStatement("INSERT INTO tutores (dni_tutor, nombre_t, apellido_t,tel_t) VALUES (?,?,?,?)");
    
        try{
            Connection cn = Conexion.Cadena();
            psPrepSencencias = cn.prepareStatement("INSERT INTO pacientes (dni_p, nombre_pac, apellido_pac,domicilio_pac, localidad, fecha, sexo, Obra_social, nro_afiliado, dni_tutor) VALUES (?,?,?,?,?,?,?,?,?,?)",
                                                          PreparedStatement.RETURN_GENERATED_KEYS);
           
            psPrepSencencias.setInt(1, dni_p);
            psPrepSencencias.setString(2, nombre_pac);
            psPrepSencencias.setString(3, apellido_pac);
            psPrepSencencias.setString(4, domicilio_pac);
            psPrepSencencias.setString(5, localidad);
            psPrepSencencias.setString(6, fecha);
            psPrepSencencias.setString(7, sexo);
            psPrepSencencias.setString(8, obra_social);
            psPrepSencencias.setInt(9, nro_afiliado);
            psPrepSencencias.setInt(10, dni_tutor);
                        
            psPrepSencencias.executeUpdate();
         
            //rsDatos.first();
       
            //return rsDatos.getInt(1);
        
            
        }catch(SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tutores.class.getName()).log(Level.SEVERE, null, ex);
        }              
    }
    
    
  
    
    public boolean BuscarDNI(int dni) throws ClassNotFoundException
    {
        boolean band=false;
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            rsDatos = sentencia.executeQuery("select * from pacientes where dni_p = "+ dni +";");
            
            while (rsDatos.next()) 
            {
                band=true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return band;
    }
    
    public boolean BuscarNombre(String A, String N) throws ClassNotFoundException
    {
        boolean band=false;
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sent="select * from pacientes where nombre_pac = '"+ N +"' and apellido_pac= '"+ A +"';";
            System.out.println(sent);
            rsDatos = sentencia.executeQuery(sent);
            
            while (rsDatos.next()) 
            {
                band=true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return band;
    }
    
  }   

    



