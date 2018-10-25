/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.salesFunction;

import java.util.ArrayList;

/**
 *
 * @author qwe09
 */
public class order {
    int id;
    static int count = 30000;
    int total_price;
    String market;
    String customer;
    ArrayList<order_item> oia;

    public order(){
        oia = new ArrayList();
        id = count;
        count ++;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public ArrayList<order_item> getOia() {
        return oia;
    }

    public void setOia(ArrayList<order_item> oia) {
        this.oia = oia;
    }
    
    
    public order_item addOrderItem(){
    
        order_item oi = new order_item();
        oia.add(oi);
        return oi;
    }
    
    public void removeOrderItem(order_item oi){
        
        oia.remove(oi);
    }
    
    public boolean checkItemExist(String productID){
        boolean exist = false;
        for(order_item eoi: this.getOia()){
            if(productID.equals(eoi.getProduct().getID()))
                exist = true;
        }
        return exist;
    }
    
    public int countTotal(){
        int totalPrice = 0;
        for(order_item oi: this.getOia()){
            totalPrice = totalPrice + oi.getActualPrice()* oi.getQuantity();
        }
        return totalPrice;
    }         
    
    public String toString(){
        return String.valueOf(this.getId());
    }
    
    
    
}
