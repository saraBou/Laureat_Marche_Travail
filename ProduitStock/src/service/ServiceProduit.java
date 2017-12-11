/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Produit;

/**
 *
 * @author HP A6
 */
public class ServiceProduit extends AbstractFacade<Produit> {

    
    public ServiceProduit() {
        super(Produit.class);
    }
     public Produit creeProduit (String nom){
         if (exist(nom)==0){
             Produit produit = new Produit(nom);
             create(produit);
         }
         return findByNom(nom);
     }
    public int exist(String nom){
        return getMultiplResult("SELECT p FROM Produit p WHERE p.libelle='"+nom+"'").size();
    }
    public Produit findByNom (String libelle){
        return getOneResult("SELECT p FROM Produit p WHERE p.libelle='"+libelle+"'");
    }    
}
