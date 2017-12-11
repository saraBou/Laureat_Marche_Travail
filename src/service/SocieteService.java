/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Societe;

/**
 *
 * @author HP A6
 */
public class SocieteService extends AbstractFacade<Societe> {
    
    public SocieteService() {
        super(Societe.class);
    }
    public int ajouter(Long id,String nom,String lieu,String poste){
        Societe societe=new Societe(id, nom, lieu, poste);
        create(societe);
        return 1;
    }
}
