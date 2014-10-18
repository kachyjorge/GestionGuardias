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
public class InternacionTest {
    
    public InternacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getCod_int method, of class Internacion.
     */
    @Test
    public void testGetCod_int() {
        System.out.println("getCod_int");
        Internacion instance = new Internacion();
        int expResult = 0;
        int result = instance.getCod_int();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCod_int method, of class Internacion.
     */
    @Test
    public void testSetCod_int() {
        System.out.println("setCod_int");
        int cod_int = 0;
        Internacion instance = new Internacion();
        instance.setCod_int(cod_int);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha_ing method, of class Internacion.
     */
    /*@Test
    public void testGetFecha_ing() {
        System.out.println("getFecha_ing");
        Internacion instance = new Internacion();
        String expResult = "";
        String result = instance.getFecha_ing();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of setFecha_ing method, of class Internacion.
     */
    @Test
    public void testSetFecha_ing() {
        System.out.println("setFecha_ing");
        String fecha_ing = "";
        Internacion instance = new Internacion();
        instance.setFecha_ing(fecha_ing);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha_alta method, of class Internacion.
     */
    /*@Test
    public void testGetFecha_alta() {
        System.out.println("getFecha_alta");
        Internacion instance = new Internacion();
        String expResult = "";
        String result = instance.getFecha_alta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of setFecha_alta method, of class Internacion.
     */
    @Test
    public void testSetFecha_alta() {
        System.out.println("setFecha_alta");
        String fecha_alta = "";
        Internacion instance = new Internacion();
        instance.setFecha_alta(fecha_alta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMotivo method, of class Internacion.
     */
    /*@Test
    public void testGetMotivo() {
        System.out.println("getMotivo");
        Internacion instance = new Internacion();
        String expResult = "";
        String result = instance.getMotivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of setMotivo method, of class Internacion.
     */
    @Test
    public void testSetMotivo() {
        System.out.println("setMotivo");
        String motivo = "";
        Internacion instance = new Internacion();
        instance.setMotivo(motivo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdcamas method, of class Internacion.
     */
    @Test
    public void testGetIdcamas() {
        System.out.println("getIdcamas");
        Internacion instance = new Internacion();
        int expResult = 0;
        int result = instance.getIdcamas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdcamas method, of class Internacion.
     */
    @Test
    public void testSetIdcamas() {
        System.out.println("setIdcamas");
        int idcamas = 0;
        Internacion instance = new Internacion();
        instance.setIdcamas(idcamas);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNro_consulta method, of class Internacion.
     */
    @Test
    public void testGetNro_consulta() {
        System.out.println("getNro_consulta");
        Internacion instance = new Internacion();
        int expResult = 0;
        int result = instance.getNro_consulta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNro_consulta method, of class Internacion.
     */
    @Test
    public void testSetNro_consulta() {
        System.out.println("setNro_consulta");
        int nro_consulta = 0;
        Internacion instance = new Internacion();
        instance.setNro_consulta(nro_consulta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of InsertarInternacion method, of class Internacion.
     */
    /*@Test
    public void testInsertarInternacion() throws Exception {
        System.out.println("InsertarInternacion");
        Internacion instance = new Internacion();
        instance.InsertarInternacion();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of cargarTablaInt method, of class Internacion.
     */
    @Test
    public void testCargarTablaInt() throws Exception {
        System.out.println("cargarTablaInt");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable T = new JTable(modelo);
        String fechaD = "24/10/14";
        String fechaH = "22/11/14";
        Internacion instance = new Internacion();
        boolean expResult = false;
        boolean result = instance.cargarTablaInt(T, fechaD, fechaH);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarTablaInforme method, of class Internacion.
     */
    @Test
    public void testCargarTablaInforme() throws Exception {
        System.out.println("cargarTablaInforme");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable T = new JTable(modelo);
        String fechaI = "24/10/14";
        String fechaA = "12/11/14";
        Internacion instance = new Internacion();
        boolean expResult = false;
        boolean result = instance.cargarTablaInforme(T, fechaI, fechaA);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarInformeCamas method, of class Internacion.
     */
    @Test
    public void testCargarInformeCamas() throws Exception {
        System.out.println("cargarInformeCamas");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable T = new JTable(modelo);
        int estado = 0;
        Internacion instance = new Internacion();
        boolean expResult = true;
        boolean result = instance.cargarInformeCamas(T, estado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of vaciarTabla method, of class Internacion.
     */
    @Test
    public void testVaciarTabla() {
        System.out.println("vaciarTabla");
        DefaultTableModel modelo = new DefaultTableModel();
        JTable T = new JTable(modelo);
        Internacion instance = new Internacion();
        instance.vaciarTabla(T);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarUltimo method, of class Internacion.
     */
    @Test
    public void testBuscarUltimo() throws Exception {
        System.out.println("buscarUltimo");
        Internacion instance = new Internacion();
        int expResult = 4;
        int result = instance.buscarUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarPac_Internado method, of class Internacion.
     */
    @Test
    public void testBuscarPac_Internado() throws Exception {
        System.out.println("BuscarPac_Internado");
        String A = "";
        String N = "";
        Internacion instance = new Internacion();
        boolean expResult = false;
        boolean result = instance.BuscarPac_Internado(A, N);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarDatos method, of class Internacion.
     */
    @Test
    public void testActualizarDatos() throws Exception {
        System.out.println("actualizarDatos");
        String fechaA = "";
        String motivo = "";
        int cod_internacion = 0;
        Internacion instance = new Internacion();
        instance.actualizarDatos(fechaA, motivo, cod_internacion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
