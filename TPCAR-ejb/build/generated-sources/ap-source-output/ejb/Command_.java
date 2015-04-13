package ejb;

import ejb.Livre;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-14T00:42:17")
@StaticMetamodel(Command.class)
public class Command_ { 

    public static volatile CollectionAttribute<Command, Livre> livreCollection;
    public static volatile SingularAttribute<Command, Integer> id;

}