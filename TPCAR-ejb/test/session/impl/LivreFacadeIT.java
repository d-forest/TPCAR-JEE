/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.impl;

import ejb.Livre;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import session.LivreFacadeLocal;

/**
 *
 * @author mahieddine
 */
public class LivreFacadeIT {
    
    public LivreFacadeIT() {
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
     * Test of create method, of class LivreFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Livre entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LivreFacadeLocal instance = (LivreFacadeLocal)container.getContext().lookup("java:global/classes/LivreFacade");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class LivreFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Livre entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LivreFacadeLocal instance = (LivreFacadeLocal)container.getContext().lookup("java:global/classes/LivreFacade");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class LivreFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Livre entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LivreFacadeLocal instance = (LivreFacadeLocal)container.getContext().lookup("java:global/classes/LivreFacade");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class LivreFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LivreFacadeLocal instance = (LivreFacadeLocal)container.getContext().lookup("java:global/classes/LivreFacade");
        Livre expResult = null;
        Livre result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class LivreFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LivreFacadeLocal instance = (LivreFacadeLocal)container.getContext().lookup("java:global/classes/LivreFacade");
        List<Livre> expResult = null;
        List<Livre> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class LivreFacade.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LivreFacadeLocal instance = (LivreFacadeLocal)container.getContext().lookup("java:global/classes/LivreFacade");
        List<Livre> expResult = null;
        List<Livre> result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class LivreFacade.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        LivreFacadeLocal instance = (LivreFacadeLocal)container.getContext().lookup("java:global/classes/LivreFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
