/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Magazin;
import bean.Produit;
import bean.Stock;

/**
 *
 * @author HP A6
 */
public class ServiceStock extends AbstractFacade<Stock>{
    ServiceMagazin sm=new ServiceMagazin();
    ServiceProduit sp=new ServiceProduit();
    public ServiceStock (){
    super(Stock.class);
}
    public Stock FindByProduitAndMagazin(Produit produit , Magazin magazin){
        return getOneResult("SELECT s FROM Stock s WHERE s.magazin.id='"+magazin.getId()+"'AND s.produit.id='"+produit.getId()+"'");  
    }
    public void creeStock (Produit p,Magazin m,int qte){
        Stock s= FindByProduitAndMagazin(p, m);
        if(s==null){
            s=new Stock(qte, m, p);
            create(s);
        }else {
            s.setQte(qte+s.getQte());
        }
    }
    public void saisiStock(String np,String nm,int qte){
        Produit p=sp.findByNom(np);
        Magazin m=sm.findByNom(nm);
        creeStock(p,m,qte);
    }
}
