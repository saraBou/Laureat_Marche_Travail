/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Sara
 */
@Entity
public class Laureat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
   
     private String cne;
    private String nom; 
    private String prenom;
    
    @ManyToOne
    private Filiere filiere;
  
    @ManyToOne
    private Diplome diplome;
    
    private String email;
    private String password;
  
    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public Diplome getDiplome() {
        return diplome;
    }

    public void setDiplome(Diplome diplome) {
        this.diplome = diplome;
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

    public Laureat() {
    }

  

    public Laureat( String nom, String prenom, String cne, String email, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.cne = cne;
        this.email = email;
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laureat other = (Laureat) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Laureat{" + "cne=" + cne + ", nom=" + nom + ", prenom=" + prenom + ", filiere=" + filiere + ", diplome=" + diplome + ", email=" + email + ", password=" + password + '}';
    }

    
    

   

   

   
}