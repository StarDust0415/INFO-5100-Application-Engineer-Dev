/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Information;
import java.awt.*;
import javax.swing.ImageIcon;


/**
 *
 * @author yizheliu
 */
public class Person {
    
        private String name;
        private String gender;
        private String age;
        private String nationality;
        private Creditdata creditdata;
        private Financialaccounts financialaccounts;
        private Licensedata licensedata;
        private Address address;
        private ImageIcon image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Creditdata getCreditdata() {
        return creditdata;
    }

    public void setCreditdata(Creditdata creditdata) {
        this.creditdata = creditdata;
    }

    public Financialaccounts getFinancialaccounts() {
        return financialaccounts;
    }

    public void setFinancialaccounts(Financialaccounts financialaccounts) {
        this.financialaccounts = financialaccounts;
    }

    public Licensedata getLicensedata() {
        return licensedata;
    }

    public void setLicensedata(Licensedata licensedata) {
        this.licensedata = licensedata;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

  
        
        
    
        
    
}
