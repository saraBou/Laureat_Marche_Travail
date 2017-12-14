/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Sara
 */
@Entity
public class Administrateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String nom;
    private String prenom;
    private String adresseAdmin;
    private String motDePasse;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresseAdmin() {
        return adresseAdmin;
    }

    public void setAdresseAdmin(String adresseAdmin) {
        this.adresseAdmin = adresseAdmin;
    }

    public Administrateur(String id, String nom, String prenom, String adresseAdmin, String motDePasse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresseAdmin = adresseAdmin;
        this.motDePasse = motDePasse;
    }

   

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }


    public Administrateur(String nom, String prenom, String adresseAdmin, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresseAdmin = adresseAdmin;
        this.motDePasse = motDePasse;
    }

    public Administrateur(String id) {
        this.id = id;
    }

    public Administrateur() {
    }

    
    public String getId() {
        return id;
        
    }

    public void setId(String id) {
        this.id = id;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrateur)) {
            return false;
        }
        Administrateur other = (Administrateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Administrateur{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresseAdmin=" + adresseAdmin + ", motDePasse=" + motDePasse + '}';
    }

    
    
}
