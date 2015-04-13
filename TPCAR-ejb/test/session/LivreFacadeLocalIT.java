/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import ejb.Livre;
import java.util.List;
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
public class LivreFacadeLocalIT {
    
    public LivreFacadeLocalIT() {
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
     * Test of create method, of class LivreFacadeLocal.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Livre livre = null;
        LivreFacadeLocal instance = new LivreFacadeLocalImpl();
        instance.create(livre);

    }

    /**
     * Test of edit method, of class LivreFacadeLocal.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Livre livre = null;
        LivreFacadeLocal instance = new LivreFacadeLocalImpl();
        instance.edit(livre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class LivreFacadeLocal.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Livre livre = null;
        LivreFacadeLocal instance = new LivreFacadeLocalImpl();
        instance.remove(livre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class LivreFacadeLocal.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Object id = null;
        LivreFacadeLocal instance = new LivreFacadeLocalImpl();
        Livre expResult = null;
        Livre result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class LivreFacadeLocal.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        LivreFacadeLocal instance = new LivreFacadeLocalImpl();
        List<Livre> expResult = null;
        List<Livre> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class LivreFacadeLocal.
     */
    @Test
    public void testFindRange() {
        System.out.println("findRange");
        int[] range = null;
        LivreFacadeLocal instance = new LivreFacadeLocalImpl();
        List<Livre> expResult = null;
        List<Livre> result = instance.findRange(range);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class LivreFacadeLocal.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        LivreFacadeLocal instance = new LivreFacadeLocalImpl();
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LivreFacadeLocalImpl implements LivreFacadeLocal {

        public void create(Livre livre) {
        }

        public void edit(Livre livre) {
        }

        public void remove(Livre livre) {
        }

        public Livre find(Object id) {
            return null;
        }

        public List<Livre> findAll() {
            return null;
        }

        public List<Livre> findRange(int[] range) {
            return null;
        }

        public int count() {
            return 0;
        }
    }
    
}
