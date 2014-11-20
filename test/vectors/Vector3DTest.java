/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulinamela
 */
public class Vector3DTest {
    
    public Vector3DTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testLength() {
        System.out.println("length");
        Vector3D instance = new Vector3D(0, 0, 0);
        double expResult = 0.0;
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Vector3D anotherVector = new Vector3D(2, 0, 0);
        Vector3D instance = new Vector3D(-3, 4, 0);
        Vector3D expResult = new Vector3D(-1, 4, 0);
        Vector3D result = instance.add(anotherVector);
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = -2.0;
        Vector3D instance = new Vector3D(-7, 8, 3);
        Vector3D expResult = new Vector3D(14, -16, -6);
        Vector3D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
    }

    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector3D anotherVector = new Vector3D(2, 2, 2);
        Vector3D instance = new Vector3D(-1, 0, 1);
        double expResult = 0.0;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");
        Vector3D anotherVector = new Vector3D(1, -1, 5);
        Vector3D instance = new Vector3D(10, 4, -4);
        Vector3D expResult = new Vector3D(16, -54, -14);
        Vector3D result = instance.crossProduct(anotherVector);
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Vector3D instance = new Vector3D(5, 2, 1);
        String expResult = "[5.0, 2.0, 1.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector3D(2, 3, 3);
        Vector3D instance = new Vector3D(2, 3, 3);
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
    }
    
}
