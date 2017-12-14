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
 * @author Sara
 */
public class AdministrateurServiceTest {
     AdministrateurService instance = new AdministrateurService();
    public AdministrateurServiceTest() {
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
     * Test of ajouter method, of class AdministrateurService.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        String id = "E2";
        String nom = "sara";
        String prenom = "bouhamdane";
        String adresseAdmin = "saraBouhamdane72@gmail.com";
        String motDePasse = "123456";
        int expResult = 1;
        int result = instance.ajouter(id, nom, prenom, adresseAdmin, motDePasse);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
