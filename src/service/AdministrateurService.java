/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Administrateur;

/**
 *
 * @author Sara
 */
public class AdministrateurService extends AbstractFacade<Administrateur> {

    public AdministrateurService() {
        super(Administrateur.class);
    }

    public int ajouter(String id, String nom, String prenom, String adresseAdmin, String motDePasse) {
        Administrateur admin = new Administrateur(id,nom, prenom, adresseAdmin, motDePasse);
        create(admin);
        return 1;
    }
    
//    public static void main(String[] args) {
//        AdministrateurService administrateurService= new AdministrateurService();
//        administrateurService.ajouter(null, null, null, null, null)
//    }
public int seConnecter (Administrateur adminestrateur){
        Administrateur loeadUser= find(adminestrateur.getId());
        if(loeadUser==null){
            return -1;
        }
        else if(!loeadUser.getMotDePasse().equals(adminestrateur.getMotDePasse())){
            return -2;
        }
        else{
            return 1;
            
        }
    }
        
}
