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
public class supplierdirectory {
    ArrayList<supplier> sa;

    public supplierdirectory(){
        sa = new ArrayList();
    }
    
    public ArrayList<supplier> getSa() {
        return sa;
    }

    public void setSa(ArrayList<supplier> sa) {
        this.sa = sa;
    }
    
    
    public supplier addSupplier(){
        supplier s = new supplier();
        sa.add(s);
        return s;
    }
    
    public void loadSuppliers(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Data_csv/Suppliers.csv"));//换成你的文件名   
            String line = null; 
            while((line=reader.readLine())!=null){
               String Item[] = line.split(","); 
                   supplier s = this.addSupplier();  
                   s.setName(Item[0]);  
                   
            System.out.println(s.getName() + " is added to SupplierDirectory");
            }
        } catch (Exception e) {    
            e.printStackTrace();    
        }  
        
        
    }
    
    public supplier findSupplierByName(String Name){
        supplier supplier = new supplier();
        for(supplier s: this.getSa()){
            if(s.getName().equals(Name)){
                supplier = s;
            }
        }
        return supplier;
    }
    
}
