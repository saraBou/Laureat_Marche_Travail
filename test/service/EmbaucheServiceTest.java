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
public class EmbaucheServiceTest {
    EmbaucheService instance = new EmbaucheService();
    public EmbaucheServiceTest() {
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
     * Test of ajouter method, of class EmbaucheService.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        Date dateDembauche = null;
        Date dateDeFin = null;
        int salairemin = 1000;
        int salairemax = 10000;
        boolean embauche = true;
        
        int expResult = 1;
        int result = instance.ajouter(dateDembauche, dateDeFin, salairemin, salairemax);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
