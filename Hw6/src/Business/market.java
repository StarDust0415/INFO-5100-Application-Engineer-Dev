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
public class market {
    String name;
    ArrayList<customer> ca;

    public market(){
        ca = new ArrayList();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<customer> getCa() {
        return ca;
    }

    public void setCa(ArrayList<customer> ca) {
        this.ca = ca;
    }
    
    
    public customer addCustomer(){
        customer c =  new customer();
        ca.add(c);
        return c;
    }
    
    public void loadCustomer(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Data_csv/Customers.csv"));//换成你的文件名   
            String line = null; 
            while((line=reader.readLine())!=null){
               String Item[] = line.split(","); 
                   
                   if(Item[1].equals(this.getName())){
                       customer c = this.addCustomer();
                       c.setName(Item[0]);
                       System.out.println(c.getName() + "|| is added to marketList ||" + this.getName() +" Market");
                   }
                   
               
            }
        } catch (Exception e) {    
            e.printStackTrace();    
        }  
    }
    
    
}
