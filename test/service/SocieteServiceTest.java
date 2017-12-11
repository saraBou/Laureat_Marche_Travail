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
public class SocieteServiceTest {
    SocieteService instance = new SocieteService();
    public SocieteServiceTest() {
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
     * Test of ajouter method, of class SocieteService.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        Long id = 1L;
        String nom = "Anapec";
        String lieu = "Marrakech";
        String poste = "ingenieur";
        
        int expResult = 1;
        int result = instance.ajouter(id, nom, lieu, poste);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
