/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author qwe09
 */
public class supplier {
    String name;
    product_catalog pc;

    public supplier(){
        pc = new product_catalog();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public product_catalog getPc() {
        return pc;
    }

    public void setPc(product_catalog pc) {
        this.pc = pc;
    }
    
    public void loadProducts(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Data_csv/Products.csv"));//换成你的文件名   
            String line = null; 
            while((line=reader.readLine())!=null){
               String Item[] = line.split(","); 
                   
               if(Item[3].equals(this.getName())){
                    product p = this.getPc().addProduct();
                    p.setID(Item[0]);
                    p.setName(Item[1]);
                    p.setDescription(Item[2]);  
                    System.out.println(p.getID() +p.getName() +p.getDescription()+ " is added to Product Directory  of【"+ this.getName() +"】");
            
               }
            }
        } catch (Exception e) {    
            e.printStackTrace();    
        }  
        
        
    
    }
    
    
}
