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
public class AdminServiceTest {
        AdminService instance = new AdminService();
    public AdminServiceTest() {
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
     * Test of ajouter method, of class AdminService.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        String nom = "zouani";
        String prenom = "younes";
        String adresseAdmin = "zouani.younes@gmail.com";
        String motDePasse = "zouani123";
    
        int expResult = 1;
        int result = instance.ajouter(nom, prenom, adresseAdmin, motDePasse);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
