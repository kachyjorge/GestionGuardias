/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesBD;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kachy
 */
public class Historia_ClinicaTest {
    
    public Historia_ClinicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNro_consulta method, of class Historia_Clinica.
     */
    @Test
    public void testGetNro_consulta() {
        System.out.println("getNro_consulta");
        Historia_Clinica instance = new Historia_Clinica();
        int expResult = 0;
        int result = instance.getNro_consulta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNro_consulta method, of class Historia_Clinica.
     */
    @Test
    public void testSetNro_consulta() {
        System.out.println("setNro_consulta");
        int nro_consulta = 4;
        Historia_Clinica instance = new Historia_Clinica();
        instance.setNro_consulta(nro_consulta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha_atencion method, of class Historia_Clinica.
     */
    /*@Test
    public void testGetFecha_atencion() {
        System.out.println("getFecha_atencion");
        Historia_Clinica instance = new Historia_Clinica();
        String expResult = "";
        String result = instance.getFecha_atencion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of setFecha_atencion method, of class Historia_Clinica.
     */
    @Test
    public void testSetFecha_atencion() {
        System.out.println("setFecha_atencion");
        String fecha_atencion = "";
        Historia_Clinica instance = new Historia_Clinica();
        instance.setFecha_atencion(fecha_atencion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPeso method, of class Historia_Clinica.
     */
    /*@Test
    public void testGetPeso() {
        System.out.println("getPeso");
        Historia_Clinica instance = new Historia_Clinica();
        String expResult = "";
        String result = instance.getPeso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of setPeso method, of class Historia_Clinica.
     */
    @Test
    public void testSetPeso() {
        System.out.println("setPeso");
        String peso = "3";
        Historia_Clinica instance = new Historia_Clinica();
        instance.setPeso(peso);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTalle method, of class Historia_Clinica.
     */
    /*@Test
    public void testGetTalle() {
        System.out.println("getTalle");
        Historia_Clinica instance = new Historia_Clinica();
        String expResult = "";
        String result = instance.getTalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of setTalle method, of class Historia_Clinica.
     */
    @Test
    public void testSetTalle() {
        System.out.println("setTalle");
        String talle = "";
        Historia_Clinica instance = new Historia_Clinica();
        instance.setTalle(talle);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPracticas method, of class Historia_Clinica.
     */
    /*@Test
    public void testGetPracticas() {
        System.out.println("getPracticas");
        Historia_Clinica instance = new Historia_Clinica();
        String expResult = "";
        String result = instance.getPracticas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of setPracticas method, of class Historia_Clinica.
     */
    @Test
    public void testSetPracticas() {
        System.out.println("setPracticas");
        String practicas = "";
        Historia_Clinica instance = new Historia_Clinica();
        instance.setPracticas(practicas);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDni_p method, of class Historia_Clinica.
     */
    @Test
    public void testGetDni_p() {
        System.out.println("getDni_p");
        Historia_Clinica instance = new Historia_Clinica();
        int expResult = 0;
        int result = instance.getDni_p();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDni_p method, of class Historia_Clinica.
     */
    @Test
    public void testSetDni_p() {
        System.out.println("setDni_p");
        int dni_p = 0;
        Historia_Clinica instance = new Historia_Clinica();
        instance.setDni_p(dni_p);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCod_int method, of class Historia_Clinica.
     */
    @Test
    public void testGetCod_int() {
        System.out.println("getCod_int");
        Historia_Clinica instance = new Historia_Clinica();
        int expResult = 0;
        int result = instance.getCod_int();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCod_int method, of class Historia_Clinica.
     */
    @Test
    public void testSetCod_int() {
        System.out.println("setCod_int");
        int cod_int = 0;
        Historia_Clinica instance = new Historia_Clinica();
        instance.setCod_int(cod_int);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCod_patologia method, of class Historia_Clinica.
     */
    @Test
    public void testGetCod_patologia() {
        System.out.println("getCod_patologia");
        Historia_Clinica instance = new Historia_Clinica();
        int expResult = 0;
        int result = instance.getCod_patologia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCod_patologia method, of class Historia_Clinica.
     */
    @Test
    public void testSetCod_patologia() {
        System.out.println("setCod_patologia");
        int cod_patologia = 0;
        Historia_Clinica instance = new Historia_Clinica();
        instance.setCod_patologia(cod_patologia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCod_medico method, of class Historia_Clinica.
     */
    @Test
    public void testGetCod_medico() {
        System.out.println("getCod_medico");
        Historia_Clinica instance = new Historia_Clinica();
        int expResult = 0;
        int result = instance.getCod_medico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCod_medico method, of class Historia_Clinica.
     */
    @Test
    public void testSetCod_medico() {
        System.out.println("setCod_medico");
        int cod_medico = 0;
        Historia_Clinica instance = new Historia_Clinica();
        instance.setCod_medico(cod_medico);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Cargar_Historia_Clinica method, of class Historia_Clinica.
     */
    /*@Test
    public void testCargar_Historia_Clinica() throws Exception {
        System.out.println("Cargar_Historia_Clinica");
        Historia_Clinica instance = new Historia_Clinica();
        instance.Cargar_Historia_Clinica();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of buscarUltimo method, of class Historia_Clinica.
     */
    @Test
    public void testBuscarUltimo() throws Exception {
        System.out.println("buscarUltimo");
        Historia_Clinica instance = new Historia_Clinica();
        int expResult = 4;
        int result = instance.buscarUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarTablaInformePac method, of class Historia_Clinica.
     */
    @Test
    public void testCargarTablaInformePac() throws Exception {
        System.out.println("cargarTablaInformePac");
       // JTable T = null;
        DefaultTableModel modelo = new DefaultTableModel();
        JTable T = new JTable(modelo);
        String fechaD = "12/09/14";
        String fechaH = "12/10/14";
        Historia_Clinica instance = new Historia_Clinica();
        int expResult = 0;
        int result = instance.cargarTablaInformePac(T, fechaD, fechaH);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarT_InformePrac method, of class Historia_Clinica.
     */
    @Test
    public void testCargarT_InformePrac() throws Exception {
        System.out.println("cargarT_InformePrac");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable T = new JTable(modelo);
        String Practica = "Cirugia";
        String fechaD = "12/09/14";
        String fechaH = "15/09/14";
        Historia_Clinica instance = new Historia_Clinica();
        int expResult = 0;
        int result = instance.cargarT_InformePrac(T, Practica, fechaD, fechaH);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
