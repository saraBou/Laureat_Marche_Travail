/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Sara
 */
@Entity
public class Filiere implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    
    @OneToOne
    private Diplome diplome; 
    @OneToMany(mappedBy = "filiere")
    private List<Laureat> laureats;
    
    
    @OneToOne(mappedBy = "filire")
    private ClassRoom classRoom;

    public List<Laureat> getLaureats() {
        if(laureats==null){
                      laureats =new ArrayList<>();
        }
        return laureats;
    }

    public void setLaureats(List<Laureat> laureats) {
        this.laureats = laureats;
    }

    public Diplome getDiplome() {
        return diplome;
    }

    public void setDiplome(Diplome diplome) {
        this.diplome = diplome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public Filiere( String nom) {
     
        this.nom = nom;
    }

    public Filiere(Long id) {
        this.id = id;
    }

    public Filiere() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

   

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Filiere)) {
            return false;
        }
        Filiere other = (Filiere) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Filiere{" + "id=" + id + ", nom=" + nom + '}';
    }

    
   
    
}
