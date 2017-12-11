/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author HP A6
 */
@Entity
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String adresseAdmin;
     private String nom;
    private String prenom;
    private String motDePasse;

    public Admin(String adresseAdmin) {
        this.adresseAdmin = adresseAdmin;
    }

    public Admin(String adresseAdmin, String nom, String prenom, String motDePasse) {
        this.adresseAdmin = adresseAdmin;
        this.nom = nom;
        this.prenom = prenom;
        this.motDePasse = motDePasse;
    }

    public Admin() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.adresseAdmin);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Admin other = (Admin) obj;
        if (!Objects.equals(this.adresseAdmin, other.adresseAdmin)) {
            return false;
        }
        return true;
    }

    public String getAdresseAdmin() {
        return adresseAdmin;
    }

    public void setAdresseAdmin(String adresseAdmin) {
        this.adresseAdmin = adresseAdmin;
    }

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

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Override
    public String toString() {
        return "Admin{" + "adresseAdmin=" + adresseAdmin + ", nom=" + nom + ", prenom=" + prenom + ", motDePasse=" + motDePasse + '}';
    }

  
    
}
