/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Yizhe Liu
 */
public class UserAccount {
    
    String firstName;
    String userName;
    String password;
    String roleType;
    
    Boolean active = true;
    
    

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getFirstName() {
        return firstName;
        
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = this.encryptPassword(password);
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }
    
    
    
    
    public String toString(){
        return this.getUserName();
    }
    
    public static String encryptPassword (String password){
     
         try{
             MessageDigest md5 = MessageDigest.getInstance("MD5");
             byte[] passBytes = password.getBytes();
             md5.reset();
             byte[] digested = md5.digest(passBytes);
             StringBuilder s = new StringBuilder();
             for(int i =0; i<digested.length;i++){
             s.append(Integer.toHexString(0xff & digested[i]));
                 
             }
             return s.toString();
         }catch (NoSuchAlgorithmException e){
             e.printStackTrace();
             return null;
         }
         
     }
}
