/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

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
public class LaureatServiceTest {
     LaureatService instance = new LaureatService();
    public LaureatServiceTest() {
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
     * Test of ajouter method, of class LaureatService.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        String nom = "askazay";
        String prenom = "hasna";
        Long cne = 15131214L;
        String email = "hasna.askazay@gmail.com";
        String password = "hasna123";
        int expResult = 1;
         int result = instance.ajouter(nom, prenom, cne, email, password);
        assertEquals(expResult, result);
    }
    
}
