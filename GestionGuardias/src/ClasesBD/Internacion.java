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
 * @author kachy
 */
public class Internacion {
    
    private int cod_int;
    private String fecha_ing;
    private String fecha_alta;
    private String motivo;
    private int idcamas;
    private int nro_consulta;

    private PreparedStatement psPrepSencencias;
    private Statement sentencia;
    private ResultSet rsDatos;
    
    public int getCod_int() {
        return cod_int;
    }

    public void setCod_int(int cod_int) {
        this.cod_int = cod_int;
    }

    public String getFecha_ing() {
        return fecha_ing;
    }

    public void setFecha_ing(String fecha_ing) {
        this.fecha_ing = fecha_ing;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getIdcamas() {
        return idcamas;
    }

    public void setIdcamas(int idcamas) {
        this.idcamas = idcamas;
    }

    public int getNro_consulta() {
        return nro_consulta;
    }

    public void setNro_consulta(int nro_consulta) {
        this.nro_consulta = nro_consulta;
    }

        
    public void InsertarInternacion () throws SQLException
    {
        // Inserta un contacto y devuelve su id 
        try{
            Connection cn = Conexion.Cadena();
            // preparo la sentencia el parametro RETURN_GENERATED_KEYS debe ser especificado explicitamente
            // para poder obtener el ID del campo autoincrement
            psPrepSencencias = cn.prepareStatement("INSERT INTO internacion (cod_int, fecha_ing, fecha_alta, motivo, idcamas, nro_consulta) VALUES (?,?,?,?,?,?);");
                                                        //PreparedStatement.RETURN_GENERATED_KEYS);
            // cargo parametros
            psPrepSencencias.setInt(1, cod_int);
            psPrepSencencias.setString(2, fecha_ing);
            psPrepSencencias.setString(3, fecha_alta);
            psPrepSencencias.setString(4, motivo);           
            psPrepSencencias.setInt(5, idcamas);
            psPrepSencencias.setInt(6, nro_consulta);
            //ejecuto sentencia
            psPrepSencencias.executeUpdate();
            //obtengo el id del registro recien insertado
            
        }catch(SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Internacion.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    /* informe de patologia */
    
    public boolean cargarTablaInt (JTable T, String fechaD, String fechaH) throws SQLException, ClassNotFoundException{
       boolean band = false;
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            DefaultTableModel modelo = (DefaultTableModel) T.getModel();
            Object []objeto = new Object[3];
            rsDatos = sentencia.executeQuery("select patologias.`descripcion` as `Nombre de Patologia`,count(patologias.`cod_patologia`) as `Cantidad de Patologia` FROM patologias inner join `historia_clinica` on `historia_clinica`.`cod_patologia` = patologias.`cod_patologia` WHERE (`historia_clinica`.`fecha_atencion` >= '" + fechaD + "') AND (`historia_clinica`.`fecha_atencion`<= '" + fechaH + "') group by patologias.`cod_patologia`;");
                                            
            while (rsDatos.next()) 
            {
                //objeto[0]= rsDatos.getString(0);
                objeto[1]= rsDatos.getString(1); 
                objeto[2]= rsDatos.getString(2);
                             
                modelo.addRow(objeto);
                band = true;
            }
            T.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Internacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return band;
    }
    
    /* informe de pacientes internados */
        
    public boolean cargarTablaInforme (JTable T, String fechaI, String fechaA) throws SQLException, ClassNotFoundException{
       boolean band = false;
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            DefaultTableModel modelo = (DefaultTableModel) T.getModel();
            Object []objeto = new Object[4];
            rsDatos = sentencia.executeQuery("select pacientes.apellido_pac, pacientes.nombre_pac, internacion.fecha_ing, internacion.fecha_alta from internacion inner join historia_clinica on internacion.nro_consulta = historia_clinica.nro_consulta inner join pacientes on historia_clinica.dni_p = pacientes.dni_p where internacion.fecha_ing >= '" + fechaI +"' and internacion.fecha_alta <= '" + fechaA + "';");
                                            
            while (rsDatos.next()) 
            {
                objeto[0]= rsDatos.getString(1);
                objeto[1]= rsDatos.getString(2); 
                objeto[2]= rsDatos.getString(3);
                objeto[3]= rsDatos.getString(4);
               
                modelo.addRow(objeto);
                band = true;
            }
            T.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Internacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return band;
    }
    
    /* informe de camas disponibles */
    
    public boolean cargarInformeCamas (JTable T, int estado) throws SQLException, ClassNotFoundException{
       boolean band = false;
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            DefaultTableModel modelo = (DefaultTableModel) T.getModel();
            Object []objeto = new Object[3];
            rsDatos = sentencia.executeQuery("select camas.idcamas, camas.nro_hab, camas.estado from camas where camas.estado = " + estado + ";");
                                            
            while (rsDatos.next()) 
            {
                objeto[0]= rsDatos.getString(1);
                objeto[1]= rsDatos.getString(2); 
                objeto[2]= rsDatos.getString(3);
                               
                modelo.addRow(objeto);
                band = true;
            }
            T.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(Internacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return band;
    }
    
    public void vaciarTabla(JTable T){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) T.getModel();
        int n = modelo.getRowCount();
        for(int i=0 ; i<n ; i++)
            {
                modelo.removeRow(0);
            }
        T.setModel(modelo);
    }

    public int buscarUltimo() throws SQLException{
        int i=0;
        try {
            Connection cn = Conexion.Cadena();
            
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsDatos = sentencia.executeQuery("select * from internacion;");
            
            while(rsDatos.next())
            {
                i = rsDatos.getInt(1);
            }
            i=i+1;
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Internacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public boolean BuscarPac_Internado(String A, String N) throws ClassNotFoundException
    {
        boolean band=false;
        try {
            Connection cn = Conexion.Cadena();
        
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                       
            rsDatos = sentencia.executeQuery("select pacientes.nombre_pac, pacientes.apellido_pac from internacion inner join historia_clinica on internacion.nro_consulta = historia_clinica.nro_consulta inner join pacientes on historia_clinica.dni_p = pacientes.dni_p where pacientes.nombre_pac = '" + N + "' and pacientes.apellido_pac = '" + A + "';");
            while (rsDatos.next())
            {
                band=true;
            }
                        
        } catch (SQLException ex) {
            Logger.getLogger(Pacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return band;
    }
    
    public void actualizarDatos(String fechaA, String motivo) throws SQLException{
        
        try {
            Connection cn = Conexion.Cadena();
            
            sentencia=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            sentencia.execute("update internacion set internacion.fecha_alta = '" + fechaA + "', internacion.motivo = '" + motivo + "' where internacion.cod_int = 1;");
                                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Internacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   
}
