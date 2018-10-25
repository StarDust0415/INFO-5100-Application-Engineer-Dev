/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author qwe09
 */
public class product_catalog {
    ArrayList<product> ap;

    public product_catalog(){
        ap = new ArrayList();
    }
    
    public ArrayList<product> getAp() {
        return ap;
    }

    public void setAp(ArrayList<product> ap) {
        this.ap = ap;
    }
    
    public product addProduct(){
    
        product p = new product();
        ap.add(p);
        return p;
    }
    
    
    public product findProductById(String s){
        product product = new product();
        for(product p: this.getAp()){
           if(p.getID().equals(s)){
               product = p;
           }
        }
        return product;
    }

    
    
}
