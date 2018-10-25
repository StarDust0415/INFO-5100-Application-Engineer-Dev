/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profile;
import java.awt.*;  
import javax.swing.ImageIcon;
 
/**
 *
 * @author Rong gao
 */
public class Person {
    private String firstName;
    private String lastName;
    private CreditCard creditCard;
    private FinancialAcc financialAcc;
    private LicenseData licenseData;
    private Address address;
    private ImageIcon image;
    //private Person spuse;
    
    public Person(){
    
    }
    
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
     public String getFirstName(){
        return this.firstName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }  
    public String getLastName(){
        return this.lastName;
    }
    public void setAddress(Address address){
        this.address = address;
    }  
    public Address getAddress(){
        return this.address;
    }
    public void setCreditCard(CreditCard creditCard){
        this.creditCard = creditCard;
    }  
    public CreditCard getCreditCard(){
        return this.creditCard;
    }
    public void setFinancialAcc(FinancialAcc financialAcc){
        this.financialAcc = financialAcc;
    }  
    public FinancialAcc getFinancialAcc(){
        return this.financialAcc;
    }
    public void setLicenseData(LicenseData licenseData){
        this.licenseData = licenseData;
    }  
    public LicenseData getLicenseData(){
        return this.licenseData;
    }
    public void setImage(ImageIcon image){
        this.image = image;
    }  
    public ImageIcon getImage(){
        return this.image;
    }
}
