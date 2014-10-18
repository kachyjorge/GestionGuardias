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
public class PacientesTest {
    
    public PacientesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDni_tutor method, of class Pacientes.
     */
    @Test
    public void testGetDni_tutor() {
        System.out.println("getDni_tutor");
        Pacientes instance = new Pacientes();
        int expResult = 0;
        int result = instance.getDni_tutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDni_tutor method, of class Pacientes.
     */
    @Test
    public void testSetDni_tutor() {
        System.out.println("setDni_tutor");
        int dni_tutor = 0;
        Pacientes instance = new Pacientes();
        instance.setDni_tutor(dni_tutor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNro_afiliado method, of class Pacientes.
     */
    @Test
    public void testGetNro_afiliado() {
        System.out.println("getNro_afiliado");
        Pacientes instance = new Pacientes();
        int expResult = 0;
        int result = instance.getNro_afiliado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNro_afiliado method, of class Pacientes.
     */
    @Test
    public void testSetNro_afiliado() {
        System.out.println("setNro_afiliado");
        int nro_afiliado = 0;
        Pacientes instance = new Pacientes();
        instance.setNro_afiliado(nro_afiliado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido_pac method, of class Pacientes.
     */
    @Test
    public void testSetApellido_pac() {
        System.out.println("setApellido_pac");
        String apellido_pac = "";
        Pacientes instance = new Pacientes();
        instance.setApellido_pac(apellido_pac);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDomicilio_pac method, of class Pacientes.
     */
    @Test
    public void testSetDomicilio_pac() {
        System.out.println("setDomicilio_pac");
        String domicilio_pac = "";
        Pacientes instance = new Pacientes();
        instance.setDomicilio_pac(domicilio_pac);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLocalidad method, of class Pacientes.
     */
    @Test
    public void testSetLocalidad() {
        System.out.println("setLocalidad");
        String localidad = "";
        Pacientes instance = new Pacientes();
        instance.setLocalidad(localidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Pacientes.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        Pacientes instance = new Pacientes();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSexo method, of class Pacientes.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        Pacientes instance = new Pacientes();
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setObra_social method, of class Pacientes.
     */
    @Test
    public void testSetObra_social() {
        System.out.println("setObra_social");
        String obra_social = "";
        Pacientes instance = new Pacientes();
        instance.setObra_social(obra_social);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTutores_dni_tutor method, of class Pacientes.
     */
    @Test
    public void testSetTutores_dni_tutor() {
        System.out.println("setTutores_dni_tutor");
        int tutores_dni_tutor = 0;
        Pacientes instance = new Pacientes();
        instance.setTutores_dni_tutor(tutores_dni_tutor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido_pac method, of class Pacientes.
     */
    /*@Test
    public void testGetApellido_pac() {
        System.out.println("getApellido_pac");
        Pacientes instance = new Pacientes();
        String expResult = "";
        String result = instance.getApellido_pac();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of getDomicilio_pac method, of class Pacientes.
     */
    /*@Test
    public void testGetDomicilio_pac() {
        System.out.println("getDomicilio_pac");
        Pacientes instance = new Pacientes();
        String expResult = "";
        String result = instance.getDomicilio_pac();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of getLocalidad method, of class Pacientes.
     */
    /*@Test
    public void testGetLocalidad() {
        System.out.println("getLocalidad");
        Pacientes instance = new Pacientes();
        String expResult = "";
        String result = instance.getLocalidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of getFecha method, of class Pacientes.
     */
    /*@Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Pacientes instance = new Pacientes();
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
*/
    /**
     * Test of getSexo method, of class Pacientes.
     */
    /*@Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Pacientes instance = new Pacientes();
        String expResult = "";
        String result = instance.getSexo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of getObra_social method, of class Pacientes.
     */
    /*@Test
    public void testGetObra_social() {
        System.out.println("getObra_social");
        Pacientes instance = new Pacientes();
        String expResult = "";
        String result = instance.getObra_social();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of getTutores_dni_tutor method, of class Pacientes.
     */
    @Test
    public void testGetTutores_dni_tutor() {
        System.out.println("getTutores_dni_tutor");
        Pacientes instance = new Pacientes();
        int expResult = 0;
        int result = instance.getTutores_dni_tutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDni_p method, of class Pacientes.
     */
    @Test
    public void testGetDni_p() {
        System.out.println("getDni_p");
        Pacientes instance = new Pacientes();
        int expResult = 0;
        int result = instance.getDni_p();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDni_p method, of class Pacientes.
     */
    @Test
    public void testSetDni_p() {
        System.out.println("setDni_p");
        int dni_p = 0;
        Pacientes instance = new Pacientes();
        instance.setDni_p(dni_p);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre_pac method, of class Pacientes.
     */
    /*@Test
    public void testGetNombre_pac() {
        System.out.println("getNombre_pac");
        Pacientes instance = new Pacientes();
        String expResult = "";
        String result = instance.getNombre_pac();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of setNombre_pac method, of class Pacientes.
     */
    @Test
    public void testSetNombre_pac() {
        System.out.println("setNombre_pac");
        String nombre_pac = "";
        Pacientes instance = new Pacientes();
        instance.setNombre_pac(nombre_pac);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarPaciente method, of class Pacientes.
     */
    /*@Test
    public void testCargarPaciente() throws Exception {
        System.out.println("cargarPaciente");
        Pacientes instance = new Pacientes();
        instance.cargarPaciente();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of BuscarDNI method, of class Pacientes.
     * @throws java.lang.Exception
     */
    @Test
    public void testBuscarDNI() throws Exception {
        System.out.println("BuscarDNI");
        int dni = 0;
        Pacientes instance = new Pacientes();
        boolean expResult = false;
        boolean result = instance.BuscarDNI(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarNom_Ape method, of class Pacientes.
     * @throws java.lang.Exception
     */
    @Test
    public void testBuscarNom_Ape() throws Exception {
        System.out.println("BuscarNom_Ape");
        int dni = 1234;
        Pacientes instance = new Pacientes();
        String expResult = "bellini, matia";
        String result = instance.BuscarNom_Ape(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarNombre method, of class Pacientes.
     */
    @Test
    public void testBuscarNombre() throws Exception {
        System.out.println("BuscarNombre");
        String A = "";
        String N = "";
        Pacientes instance = new Pacientes();
        boolean expResult = false;
        boolean result = instance.BuscarNombre(A, N);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
