/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesBD;

/**
 *
 * @author kachy
 */
public class Patologia {

    private int cod_patologia;
    private String descripcion;
    
     public Patologia(int cod_patologia, String descripcion) {
        this.cod_patologia = cod_patologia;
        this.descripcion = descripcion;
    }
     
     public int getCod_patologia() {
        return cod_patologia;
    }
    public String getDescripcion() {
        return descripcion;
    }

  }
