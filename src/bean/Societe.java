/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Sara
 */
@Entity
public class Societe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String lieu;
    private String poste;
   
    @ManyToOne
    private SecteurActivite secteurActivite;
    @OneToMany(mappedBy = "societe")
    private List<Embauche> embauches;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Embauche> getEmbauches() {
        return embauches;
    }

    public void setEmbauches(List<Embauche> embauches) {
        this.embauches = embauches;
    }

   

   
    

    public SecteurActivite getSecteurActivite() {
        return secteurActivite;
    }

    public void setSecteurActivite(SecteurActivite secteurActivite) {
        this.secteurActivite = secteurActivite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Societe() {
    }

    public Societe(Long id) {
        this.id = id;
    }

    public Societe(Long id, String nom, String lieu, String poste) {
        this.id = id;
        this.nom = nom;
        this.lieu = lieu;
        this.poste = poste;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Societe{" + "id=" + id + ", nom=" + nom + ", lieu=" + lieu + ", poste=" + poste + '}';
    }
}