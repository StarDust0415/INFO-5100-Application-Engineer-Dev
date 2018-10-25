/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author qwe09
 */
public class market_list {
    ArrayList<market> ma;
    
    public market_list(){
          ma = new ArrayList();  
    }

    public ArrayList<market> getMa() {
        return ma;
    }

    public void setMa(ArrayList<market> ma) {
        this.ma = ma;
    }
    
    public market addMarket(){
        market m = new market();
        ma.add(m);
        return m;
    }
    
    public void loadMarket(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Data_csv/Markets.csv"));//换成你的文件名   
            String line = null; 
            while((line=reader.readLine())!=null){
               String Item[] = line.split(","); 
                   market m = this.addMarket();
                   
                   m.setName(Item[0]);

                   System.out.println(m.getName() + " is added to marketList");
               
            }
        } catch (Exception e) {    
            e.printStackTrace();    
        }  
    }
    
    
    public customer findCustomerByName(String name){
        customer customer = new customer();
        for(market m: this.getMa()){
            for(customer c: m.getCa()){
                if(c.getName().equals(name)){
                    customer = c;
                }
            }
        }           
        return customer;
    }
    
    public market findMarketByCustomerName(String name){
         market market=  new market();
         for(market m: this.getMa()){
             for(customer c: m.getCa()){
                 if(c.getName().equals(name))
                      market = m;
             }
         }
        return market;    
    }
    
}
