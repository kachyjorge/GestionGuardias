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
public class Guardia {

    private String fecha_g;
    private String hora_desde;
    private String hora_hasta;
   
    public Guardia(String fecha_g, String hora_desde, String hora_hasta) {
        this.fecha_g = fecha_g;
        this.hora_desde = hora_desde;
        this.hora_hasta = hora_hasta;
    } 
    
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

    public String getHora_hasta() {
        return hora_hasta;
    }

    public void setHora_hasta(String hora_hasta) {
        this.hora_hasta = hora_hasta;
    }
   
}
