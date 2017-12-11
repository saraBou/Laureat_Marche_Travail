/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Magazin;

/**
 *
 * @author HP A6
 */
public class ServiceMagazin extends AbstractFacade<Magazin> {
    
    public ServiceMagazin() {
        super(Magazin.class);
    }
   
     public Magazin creeMagazin (String nom){
         if (exist(nom)==0){
             Magazin magazin = new Magazin(nom);
             create(magazin);
         }
         return findByNom(nom);
     }
    public int exist(String nom){
        return getMultiplResult("SELECT m FROM Magazin m WHERE m.nom='"+nom+"'").size();
    }
    public Magazin findByNom (String nom){
        return getOneResult("SELECT m FROM Magazin m WHERE m.nom='"+nom+"'");
    }    
}
