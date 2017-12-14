/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Filiere;

/**
 *
 * @author HP A6
 */
public class FiliereService extends AbstractFacade<Filiere>{
     public FiliereService() {
        super(Filiere.class);
    }
     public int ajouter ( String nom){
              Filiere filiere = new Filiere( nom);
                      create(filiere);
                      return 1;

     }
 
    
    
    
}

