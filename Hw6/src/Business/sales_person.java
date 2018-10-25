/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.salesFunction.order;
import java.util.ArrayList;

/**
 *
 * @author qwe09
 */
public class sales_person extends person {
    
    ArrayList<order> oa;

    public sales_person(){
        oa = new ArrayList();
    }
    
    public ArrayList<order> getOa() {
        return oa;
    }

    public void setOa(ArrayList<order> oa) {
        this.oa = oa;
    }
    
    public order addOrder(){
        order o = new order();
        oa.add(o);
        return o;
    }
    
    
    public boolean orderExist(String custName){
        boolean exist = false;
        for(order o: this.getOa()){
            if(o.getCustomer().equals(custName))
                exist = true;
        
        }
        return exist;
    }
    
    public order findOrderByCustomerName(String custName){
        order order = new order();
        for(order o: this.getOa()){
            if(o.getCustomer().equals(custName))
                order = o;       
        }
        return order;
        
    }
}
