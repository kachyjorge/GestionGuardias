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
public class Practicas {
    
    private int cod_practica;
    private String Nombre_prac;
    
public Practicas(int cod_practica, String Nombre_prac) {
        this.cod_practica = cod_practica;
        this.Nombre_prac = Nombre_prac;
    }
    
    public int getCod_practica() {
        return cod_practica;
    }

    public String getNombre_prac() {
        return Nombre_prac;
    }
    
}
