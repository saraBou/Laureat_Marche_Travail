/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Laureat;

/**
 *
 * @author HP A6
 */
public class LaureatService extends AbstractFacade<Laureat>{
     
    public LaureatService() {
        super(Laureat.class);
    }
     public int ajouter ( String nom,String prenom, Long cne,String email, String password){
              Laureat laureat = new Laureat( nom, prenom, cne, email, password);
                      create(laureat);
                      return 1;

     }
    
    
    
}
 * @author Sara
 */

    
    public class LaureatService extends AbstractFacade<Laureat>{
     
    public LaureatService() {
        super(Laureat.class);
    }
     public int ajouter ( String nom,String prenom,String cne,String email, String password){
              Laureat laureat = new Laureat(nom, prenom,cne, password,  email);
                      create(laureat);
                      return 1;

     }
    
    
    
}

    


