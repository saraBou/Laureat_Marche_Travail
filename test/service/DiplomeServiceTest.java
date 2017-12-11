/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP A6
 */
public class DiplomeServiceTest {
    DiplomeService instance = new DiplomeService();
    public DiplomeServiceTest() {
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

    /**
     * Test of ajouter method, of class DiplomeService.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        String type = "licence";
        String mention = "bien";
        Long id=1L;
        
        int expResult = 1;
        int result = instance.ajouter(id,type, mention);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
