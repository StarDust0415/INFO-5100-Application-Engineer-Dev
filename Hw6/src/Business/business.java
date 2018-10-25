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
public class business {
    ArrayList<person> pa;
    useraccountdirectory uad;
    market_offer_catalog moc;
    market_list ml;
    supplierdirectory sd;
    
    
    public business() {
        pa = new ArrayList();
        uad = new useraccountdirectory();
        moc = new market_offer_catalog();
        ml = new market_list();
        sd = new supplierdirectory();
    }

    
    public supplierdirectory getSd() {
        return sd;
    }

    public void setSd(supplierdirectory sd) {
        this.sd = sd;
    }
    
    public market_list getMl() {
        return ml;
    }

    public void setMl(market_list ml) {
        this.ml = ml;
    }
    
    public market_offer_catalog getMoc() {
        return moc;
    }

    public void setMoc(market_offer_catalog moc) {
        this.moc = moc;
    }
    

    public ArrayList<person> getPa() {
        return pa;
    }

    public void setPa(ArrayList<person> pa) {
        this.pa = pa;
    }

    public useraccountdirectory getUad() {
        return uad;
    }

    public void setUad(useraccountdirectory uad) {
        this.uad = uad;
    }
    
    
    
    public void loadPerson(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Data_csv/Persons.csv"));//换成你的文件名   
            String line = null; 
            while((line=reader.readLine())!=null){
               String Item[] = line.split(","); 
                   if(Item[1].equals("salesman")){
                       sales_person s = new sales_person();
                       s.setName(Item[0]);
                       
                       pa.add(s);
                       
                       System.out.println("salesman 【" + s.getName() + "】 is added to personList");
                       
                   }else if(Item[1].equals("admin")){
                       admin a = new admin();
                       a.setName(Item[0]);
                       pa.add(a);
                       System.out.println("admin 【" + a.getName() + "】 is added to personList");
                   }
            }
        } catch (Exception e) {    
            e.printStackTrace();    
        }  
    }
    
    public person findPersonByName(String name){
        person person = new person();
        for(person p: pa){
            if(p.getName().equals(name)){
                person = p;
            }      
        }
        return person;
    }
    
    
    
}
