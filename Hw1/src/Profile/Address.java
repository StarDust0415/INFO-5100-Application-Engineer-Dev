/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profile;

/**
 *
 * @author Rong gao
 */
public class Address {
    private String country;
    private String state;
    private String city;
    private String street;    
    private String zipCode;
    
    public Address(){
        
    }
    
    public void setCountry(String country){
        this.country = country;
    }  
    public String getCountry(){
        return this.country;
    }
    public void setState(String state){
        this.state = state;
    }  
    public String getState(){
        return this.state;
    }
    public void setCity(String city){
        this.city = city;
    }  
    public String getCity(){
        return this.city;
    }
    public void setStreet(String street){
        this.street = street;
    }  
    public String getStreet(){
        return this.street;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }  
    public String getZipCode(){
        return this.zipCode;
    }
}
