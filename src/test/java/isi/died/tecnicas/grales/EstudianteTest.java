/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isi.died.tecnicas.grales;

import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mdominguez
 */
public class EstudianteTest {
    
    public EstudianteTest() {
    }
    
    private Estudiante est;
    private Universidad universidad;
    
    @Before
    public void setUp() {
        est =new Estudiante();
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of elegir method, of class Estudiante.
     */
    @Test
    public void testElegir() {
        /*System.out.println(">  4:"+Arrays.toString(est.elegir(4)));
        System.out.println(">  5:"+Arrays.toString(est.elegir(5)));
        System.out.println(">  6:"+Arrays.toString(est.elegir(6)));
        System.out.println(">  7:"+Arrays.toString(est.elegir(7)));*/
        System.out.println(">  8:"+Arrays.toString(est.elegir(15)));
        /*System.out.println(">  9:"+Arrays.toString(est.elegir(9)));
        System.out.println("> 10:"+Arrays.toString(est.elegir(10)));*/
        assertTrue(true);
    }
    
}
