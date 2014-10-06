/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesBD;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
    
    
    

    public void Cargar_Historia_Clinica () throws SQLException, ClassNotFoundException
        {
         //int nro;   
        // Inserta un contacto y devuelve su id 
         try{
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
               
            Connection cn = Conexion.Cadena();
            psPrepSencencias = cn.prepareStatement("INSERT INTO historia_clinica (nro_consulta, fecha_atencion, peso, talle, practicas, dni_p, cod_patologia, cod_medico) VALUES (?,?,?,?,?,?,?,?);");
                                                           //PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            psPrepSencencias.setInt(1, nro_consulta);
            psPrepSencencias.setString(2, fecha_atencion);
            psPrepSencencias.setString(3, peso);
            psPrepSencencias.setString(4, talle);
            psPrepSencencias.setString(5, practicas);
            psPrepSencencias.setInt(6, dni_p);
            psPrepSencencias.setInt(7, cod_patologia);
            psPrepSencencias.setInt(8, cod_medico);
            
            //ejecuto sentencia
           psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            //rsDatos = psPrepSencencias.getGeneratedKeys();
            //rsDatos.first();
            //nro = rsDatos.getInt(1);
            
        }catch(SQLException e) {
            throw e;
        } 
        //return nro; 
    }


    public int buscarUltimo() throws SQLException{
        int i=0;
        try {
            Connection cn = Conexion.Cadena();
            
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery("select * from historia_clinica;");
            
            while(rsDatos.next())
            {
                i = rsDatos.getInt(1);
            }
            i=i+1;
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Historia_Clinica.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public int cargarTablaInformePac (JTable T, String fechaD, String fechaH) throws SQLException, ClassNotFoundException{
       int i = 0;
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            DefaultTableModel modelo = (DefaultTableModel) T.getModel();
            Object []objeto = new Object[10];
            rsDatos = sentencia.executeQuery("select pacientes.apellido_pac, pacientes.nombre_pac, pacientes.dni_p, pacientes.domicilio_pac, pacientes.fecha, historia_clinica.fecha_atencion, historia_clinica.talle, historia_clinica.peso, patologias.descripcion, medicos.apellido_med, medicos.nombre_med\n" +
                                            "from pacientes inner join historia_clinica on pacientes.dni_p = historia_clinica.dni_p\n" +
                                            "inner join patologias on historia_clinica.cod_patologia = patologias.cod_patologia\n" +
                                            "inner join medicos on historia_clinica.cod_medico = medicos.cod_medico\n" +
                                            "where historia_clinica.fecha_atencion >= '" + fechaD + "' and historia_clinica.fecha_atencion <= '" + fechaH + "';");
                                            
            while (rsDatos.next()) 
            {
                objeto[0]= rsDatos.getString(1);
                objeto[1]= rsDatos.getString(2); 
                objeto[2]= rsDatos.getInt(3);
                objeto[3]= rsDatos.getString(4);
                objeto[4]= rsDatos.getString(5);
                objeto[5]= rsDatos.getString(6);
                objeto[6]= rsDatos.getString(7);
                objeto[7]= rsDatos.getString(8);
                objeto[8]= rsDatos.getString(9);
                objeto[9]= rsDatos.getString(10)+ ", " + rsDatos.getString(11);
               
                modelo.addRow(objeto);
                i++;
            }
            T.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Internacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    
    public int cargarT_InformePrac (JTable T, String Practica, String fechaD, String fechaH) throws SQLException, ClassNotFoundException{
        int i = 0;
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            DefaultTableModel modelo = (DefaultTableModel) T.getModel();
            Object []objeto = new Object[10];
            rsDatos = sentencia.executeQuery("select historia_clinica.practicas from historia_clinica where historia_clinica.practicas = '" + Practica + "' and historia_clinica.fecha_atencion >= '" + fechaD + "' and historia_clinica.fecha_atencion <= '" + fechaH + "' ;");
                                            
            while (rsDatos.next()) 
            {
                objeto[0]= rsDatos.getString(1);
                
                modelo.addRow(objeto);
                i++;
            }
            T.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Internacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    
          
}
