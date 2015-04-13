/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mahieddine
 */
public class LivreIT {
    
    public LivreIT() {
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
     * Test of getTitre method, of class Livre.
     */
    @Test
    public void testGetTitre() {
        System.out.println("getTitre");
        Livre instance = new Livre("testTitre");
        String expResult = "testTitre";
        String result = instance.getTitre();
        assertEquals(expResult, result);
        instance = new Livre("testTitre","testAuteur", 1991);
        expResult = "testTitre";
        result = instance.getTitre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTitre method, of class Livre.
     */
    @Test
    public void testSetTitre() {
        System.out.println("setTitre");
        String titre = "test";
        Livre instance = new Livre();
        instance.setTitre(titre);
        assertEquals(titre, instance.getTitre());
    }

    /**
     * Test of getAuteur method, of class Livre.
     */
    @Test
    public void testGetAuteur() {
        System.out.println("getAuteur");
        Livre instance = new Livre("testTitre", "testAuteur", 1991);
        String expResult = "testAuteur";
        String result = instance.getAuteur();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAuteur method, of class Livre.
     */
    @Test
    public void testSetAuteur() {
        System.out.println("setAuteur");
        String auteur = "";
        Livre instance = new Livre();
        instance.setAuteur(auteur);

    }

    /**
     * Test of getAnnee method, of class Livre.
     */
    @Test
    public void testGetAnnee() {
        System.out.println("getAnnee");
        Livre instance = new Livre("testTitre", "testAuteur", 1991);
        Integer expResult = 1991;
        Integer result = instance.getAnnee();
        assertEquals(expResult, result);;
    }

    /**
     * Test of setAnnee method, of class Livre.
     */
    @Test
    public void testSetAnnee() {
        System.out.println("setAnnee");
        Integer annee = null;
        Livre instance = new Livre();
        instance.setAnnee(annee);
 
    }

    /**
     * Test of hashCode method, of class Livre.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Livre instance = new Livre();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Livre.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Livre instance = new Livre();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Livre.
     */
    @Test
    public void testToString() {

        
    }
    
}
