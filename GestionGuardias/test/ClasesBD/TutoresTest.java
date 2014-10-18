/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesBD;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kachy
 */
public class TutoresTest {
    
    public TutoresTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDni_tutor method, of class Tutores.
     */
    @Test
    public void testGetDni_tutor() {
        System.out.println("getDni_tutor");
        Tutores instance = new Tutores();
        int expResult = 0;
        int result = instance.getDni_tutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDni_tutor method, of class Tutores.
     */
    @Test
    public void testSetDni_tutor() {
        System.out.println("setDni_tutor");
        int dni_tutor = 0;
        Tutores instance = new Tutores();
        instance.setDni_tutor(dni_tutor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre_t method, of class Tutores.
     */
    /*@Test
    public void testGetNombre_t() {
        System.out.println("getNombre_t");
        Tutores instance = new Tutores();
        String expResult = "";
        String result = instance.getNombre_t();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of setNombre_t method, of class Tutores.
     */
    @Test
    public void testSetNombre_t() {
        System.out.println("setNombre_t");
        String nombre_t = "";
        Tutores instance = new Tutores();
        instance.setNombre_t(nombre_t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido_t method, of class Tutores.
     */
    /*@Test
    public void testGetApellido_t() {
        System.out.println("getApellido_t");
        Tutores instance = new Tutores();
        String expResult = "";
        String result = instance.getApellido_t();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of setApellido_t method, of class Tutores.
     */
    @Test
    public void testSetApellido_t() {
        System.out.println("setApellido_t");
        String apellido_t = "";
        Tutores instance = new Tutores();
        instance.setApellido_t(apellido_t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTel_t method, of class Tutores.
     */
    @Test
    public void testGetTel_t() {
        System.out.println("getTel_t");
        Tutores instance = new Tutores();
        int expResult = 0;
        int result = instance.getTel_t();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTel_t method, of class Tutores.
     */
    @Test
    public void testSetTel_t() {
        System.out.println("setTel_t");
        int tel_t = 0;
        Tutores instance = new Tutores();
        instance.setTel_t(tel_t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of InsertarTutor method, of class Tutores.
     * @throws java.lang.Exception
     */
    /*@Test
    public void testInsertarTutor() throws Exception {
        System.out.println("InsertarTutor");
        Tutores instance = new Tutores();
        instance.InsertarTutor();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
    
}
