/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Embauche;
import java.util.Date;

/**
 *
 * @author HP A6
 */
public class EmbaucheService extends AbstractFacade<Embauche> {
    
    public EmbaucheService() {
        super(Embauche.class);
    }
    public int ajouter (Date dateDembauche,Date dateDeFin,int salairemin,int salairemax){
        Embauche emb = new Embauche(dateDembauche, dateDeFin, salairemax, salairemin);
        create (emb);
        return 1;
    }
    
        
    
}
