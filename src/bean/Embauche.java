/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author HP A6
 */
@Entity
public class Embauche implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Societe societe;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDembauche;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDeFin;
    private int salaireMax;
    private int salaireMin;
    @ManyToOne
    private SecteurActivite secteurActivite;
    @OneToMany(mappedBy = "embauche")
    private List<Laureat> laureats;


  

    public Embauche( Date dateDembauche, Date dateDeFin, int salaireMax, int salaireMin) {
        
        this.dateDembauche = dateDembauche;
        this.dateDeFin = dateDeFin;
        this.salaireMax = salaireMax;
        this.salaireMin = salaireMin;
    }
    
    public Embauche(Long id, Date dateDembauche, Date dateDeFin, int salaireMax, int salaireMin) {
        this.id = id;
        this.dateDembauche = dateDembauche;
        this.dateDeFin = dateDeFin;
        this.salaireMax = salaireMax;
        this.salaireMin = salaireMin;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public SecteurActivite getSecteurActivite() {
        return secteurActivite;
    }

    public void setSecteurActivite(SecteurActivite secteurActivite) {
        this.secteurActivite = secteurActivite;
    }

    public List<Laureat> getLaureats() {
        if(laureats==null){
             laureats = new ArrayList<>();
        }
        return laureats;
    }

    public void setLaureats(List<Laureat> laureats) {
        this.laureats = laureats;
    }

   
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDembauche() {
        return dateDembauche;
    }

    public void setDateDembauche(Date dateDembauche) {
        this.dateDembauche = dateDembauche;
    }

    public int getSalaireMax() {
        return salaireMax;
    }

    public void setSalaireMax(int salaireMax) {
        this.salaireMax = salaireMax;
    }

    public int getSalaireMin() {
        return salaireMin;
    }

    public void setSalaireMin(int salaireMin) {
        this.salaireMin = salaireMin;
    }

  
    public Date getDateDeFin() {
        return dateDeFin;
    }

    public void setDateDeFin(Date dateDeFin) {
        this.dateDeFin = dateDeFin;
    }

   
    public Embauche(Long id) {
        this.id = id;
    }

    public Embauche() {
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
        if (!(object instanceof Embauche)) {
            return false;
        }
        Embauche other = (Embauche) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Embauche{" + "id=" + id + ", societe=" + societe + ", salaireMax=" + salaireMax + ", salaireMin=" + salaireMin +  '}';
    }

    
}

