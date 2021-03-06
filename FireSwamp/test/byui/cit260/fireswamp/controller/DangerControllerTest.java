/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.fireswamp.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author ryahh
 */
public class DangerControllerTest {
    
    public DangerControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of calcLightingSand method, of class DangerController.
     */
//    @Test
//    public void testCalcLightingSand() {
//        System.out.println("calcLightingSand");
//        double diameter = 0.0;
//        DangerController instance = new DangerController();
//        double expResult = -1;
//        double result = instance.calcLightningSand(diameter);
//        assertEquals(expResult, result, 0.1);
//        
//        diameter = 2;
//        expResult = 3.14;
//        result = instance.calcLightningSand(diameter);
//        assertEquals(expResult, result, 0.1);
//        
//        diameter = 8;
//        expResult = 12.5;
//        result = instance.calcLightningSand(diameter);
//        assertEquals(expResult, result, 0.1);
//    }
  

    /**
     * Test of calcRous method, of class DangerController.
     */
//    @Test
//    public void testCalcRous() {
//        System.out.println("calcRous");
//        int nextNumber = 2;
//        DangerController instance = new DangerController();
//        int expResult = 4;
//        double result = instance.calcRous(nextNumber);
//        assertEquals(expResult, result, 0.0);
//        /*
//        nextNumber = 4;
//        expResult = 4;
//        result = instance.calcRous(nextNumber);
//        assertEquals(expResult, result, 0.0);
//        
//        nextNumber = 3;
//        expResult = -1;
//        result = instance.calcRous(nextNumber);
//        assertEquals(expResult, result, 0.0);
//        */
//    }

    /**
     * Test of calcFireSpouts method, of class DangerController.
     */
    @Test
    public void testCalcFireSpouts() {
        System.out.println("calcFireSpouts");
        int height = 9;
        int base = 9;
        DangerController instance = new DangerController();
        double expResult = 40.5;
        try {
            double result = instance.calcFireSpouts(height, base);
            assertEquals(expResult, result, 0.0);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        
        
//        height = 30;
//        base = 10;
//        expResult = 150;
//        result = instance.calcFireSpouts(height, base);
//        assertEquals(expResult, result, 0.0);
//        
//        height = 10;
//        base = 3;
//        expResult = 15;
//        result = instance.calcFireSpouts(height, base);
//        assertEquals(expResult, result, 0.0);
//        
//        height = 0;
//        base = 5;
//        expResult = -1;
//        result = instance.calcFireSpouts(height, base);
//        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcLightningSand method, of class DangerController.
     */
//    @Test
//    public void testCalcLightningSand() {
//        System.out.println("calcLightningSand");
//        double diameter = 5.0;
//        DangerController instance = new DangerController();
//        double expResult = 7.85;
//        double result = instance.calcLightningSand(diameter);
//        assertEquals(expResult, result, 0.01);
//    }
    
}


