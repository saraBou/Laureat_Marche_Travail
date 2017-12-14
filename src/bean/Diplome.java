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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author HP A6
 */
@Entity
public class Diplome implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private String mention;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDobtenation;
    @OneToOne(mappedBy = "diplome")
    private Filiere filiere ;
    @OneToMany(mappedBy = "diplome")
    private List<Laureat> laureats;

    public Diplome() {
    }

    public List<Laureat> getLaureats() {
        if(laureats==null){
         laureats= new ArrayList<>();
        }
        return laureats;
    }

    public void setLaureats(List<Laureat> laureats) {
        
        this.laureats = laureats;
    }

    public Diplome( Long id,String type, String mention) {
       this.id=id;
        this.type = type;
        this.mention = mention;
        this.dateDobtenation = new Date();
       
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMention() {
        return mention;
    }

    public void setMention(String mention) {
        this.mention = mention;
    }

    public Date getDateDobtenation() {
        return dateDobtenation;
    }

    public void setDateDobtenation(Date dateDobtenation) {
        this.dateDobtenation = dateDobtenation;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
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

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diplome)) {
            return false;
        }
        Diplome other = (Diplome) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Diplome{" + "id=" + id + ", type=" + type + ", mention=" + mention + ", dateDobtenation=" + dateDobtenation + '}';
    }

   
    
}


