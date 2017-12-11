/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.SecteurActivite;

/**
 *
 * @author HP A6
 */
public class SecteurActiviteService extends AbstractFacade<SecteurActivite> {
    
    public SecteurActiviteService() {
        super(SecteurActivite.class);
    }
      public int ajouter ( Long id,String nom ){
             SecteurActivite secteur = new SecteurActivite(id, nom);
                      create(secteur);
                      return 1;

     }
    
}
