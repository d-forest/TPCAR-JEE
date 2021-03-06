/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import ejb.Command;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Dylan
 */
@Local
public interface CommandFacadeLocal {

    void create(Command command);

    void edit(Command command);

    void remove(Command command);

    Command find(Object id);

    List<Command> findAll();

    List<Command> findRange(int[] range);

    int count();
    
}
