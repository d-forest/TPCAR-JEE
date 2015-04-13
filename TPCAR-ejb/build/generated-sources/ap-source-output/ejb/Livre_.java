package ejb;

import ejb.Command;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-14T00:42:17")
@StaticMetamodel(Livre.class)
public class Livre_ { 

    public static volatile SingularAttribute<Livre, String> titre;
    public static volatile CollectionAttribute<Livre, Command> commandCollection;
    public static volatile SingularAttribute<Livre, Integer> annee;
    public static volatile SingularAttribute<Livre, String> auteur;

}