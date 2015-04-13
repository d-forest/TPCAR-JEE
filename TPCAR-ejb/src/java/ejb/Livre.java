/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dylan
 */
@Entity
@Table(name = "LIVRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livre.findAll", query = "SELECT l FROM Livre l"),
    @NamedQuery(name = "Livre.findByTitre", query = "SELECT l FROM Livre l WHERE l.titre = :titre"),
    @NamedQuery(name = "Livre.findByAuteur", query = "SELECT l FROM Livre l WHERE l.auteur = :auteur"),
    @NamedQuery(name = "Livre.findByAnnee", query = "SELECT l FROM Livre l WHERE l.annee = :annee")})
public class Livre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "TITRE")
    private String titre;
    @Size(max = 250)
    @Column(name = "AUTEUR")
    private String auteur;
    @Column(name = "ANNEE")
    private Integer annee;

    public Livre() {
    }

    public Livre(String titre) {
        this.titre = titre;
    }
    
    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (titre != null ? titre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livre)) {
            return false;
        }
        Livre other = (Livre) object;
        if ((this.titre == null && other.titre != null) || (this.titre != null && !this.titre.equals(other.titre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.Livre[ titre=" + titre + " ]";
    }
    
}
