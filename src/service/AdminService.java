/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Admin;

/**
 *
 * @author HP A6
 */
public class AdminService extends AbstractFacade<Admin>{
      public AdminService() {
        super(Admin.class);
    }
     public int ajouter ( String nom,String prenom,String adresseAdmin,String motDePasse){
              Admin admin = new Admin(adresseAdmin, nom, prenom, motDePasse);
                      create(admin);
                      return 1;

     }
}
