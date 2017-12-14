/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Diplome;
import java.util.Date;

/**
 *
 * @author Sara
 */
public class DiplomeService extends AbstractFacade<Diplome>{

    public DiplomeService() {
        super(Diplome.class);
    }
    public int ajouterDiplome (Long id, String type, String mention, Date dateObtention){
        Diplome diplome = new Diplome(id, type, mention);
         
                      create(diplome);
                      return 1;

    }
    
    
}
