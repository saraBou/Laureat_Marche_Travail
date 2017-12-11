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
 * @author HP A6
 */
public class DiplomeService extends AbstractFacade<Diplome>{
    
    public DiplomeService() {
        super(Diplome.class);
    }
    public int ajouter ( Long id, String type, String mention){
             Diplome diplome = new Diplome( id,type, mention);
                      create(diplome);
                      return 1;

     }
}
