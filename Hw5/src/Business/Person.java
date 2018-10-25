/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 *
 * @author Yizhe Liu
 */
public class Person {
    
    private String firstName;
    private String lastName;
    
    ArrayList<UserAccount> personAccountList;
    
    
    public Person(){
        
        personAccountList = new ArrayList();
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<UserAccount> getPersonAccountList() {
        return personAccountList;
    }

    public void setPersonAccountList(ArrayList<UserAccount> personAccountList) {
        this.personAccountList = personAccountList;
    }
    
    
    public UserAccount addUserAccount(){
        UserAccount ua =  new UserAccount();
        personAccountList.add(ua);
        return ua;
    }
            
    public void loadUserAccount(){
      try {
            BufferedReader reader = new BufferedReader(new FileReader("Data_csv/UserAccounts.csv"));//换成你的文件名   
            String line = null; 
            while((line=reader.readLine())!=null){
               
               String Item[] = line.split(",");
               if(Item[1].equals(this.getFirstName())){
                   
                   UserAccount ua;
                   ua = this.addUserAccount();
                   ua.setUserName(Item[0]);
                   ua.setFirstName(Item[1]);
                   ua.setPassword(Item[2]);
                   ua.setRoleType(Item[3]);

                   System.out.println(ua.getUserName() + " of "+ this.getFirstName() + " is added");
               }
            }
        } catch (Exception e) {    
            e.printStackTrace();    
        }  
    }
    
    
 /*   public String toString(){
        return this.getFirstName()+ " " + this.getLastName();
    }*/
     public String toString(){
        return this.getFirstName();
    }
    
     
     
     
    
}
