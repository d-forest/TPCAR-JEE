/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.impl;

import ejb.Livre;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import session.AbstractFacade;
import session.LivreFacadeLocal;

/**
 *
 * @author Dylan
 */
@Stateless
public class LivreFacade extends AbstractFacade<Livre> implements LivreFacadeLocal {
    @PersistenceContext(unitName = "TPCAR-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LivreFacade() {
        super(Livre.class);
    }
    
}
