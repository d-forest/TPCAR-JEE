/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import ejb.Livre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Dylan Forest et Mahieddine Yaker
 */
@Local
public interface LivreFacadeLocal {

    void create(Livre livre);

    void edit(Livre livre);

    void remove(Livre livre);

    Livre find(Object id);

    List<Livre> findAll();

    List<Livre> findRange(int[] range);

    int count();
    
}
