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
public class useraccountdirectory {
    ArrayList<user_account> userAccountList;

    public useraccountdirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<user_account> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<user_account> userAccountList) {
        this.userAccountList = userAccountList;
    }
   
    public user_account addAccount(){
        
        user_account u = new user_account();
        userAccountList.add(u);
        return u;
    
    }
    
    public void loadAccount(ArrayList<person> pl){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Data_csv/UserAccounts.csv"));//换成你的文件名   
            String line = null; 
            while((line=reader.readLine())!=null){
               String Item[] = line.split(","); 
                   user_account u = this.addAccount();
                   u.setUsername(Item[0]);
                   u.setPassword(Item[1]);
                   u.setRole(Item[2]);
                   for(person p: pl){
                       if(p.getName().equals(Item[3])){
                       u.setP(p);
                       }
                       
                   }

                   System.out.println(u.getUsername() + " is added to accountList (Person p configured)");
               
            }
        } catch (Exception e) {    
            e.printStackTrace();    
        }  
    }
        
        
    
    
}
