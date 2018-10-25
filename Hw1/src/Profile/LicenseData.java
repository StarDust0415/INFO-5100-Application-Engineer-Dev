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
public class LicenseData {
    private String num;
    private String doi;
    private String doe;
    private String dob;
    private String state;
    
    public LicenseData(){
        
    }
    
    public void setNum(String num){
        this.num = num;
    }
    public String getNum(){
        return this.num;
    }
    public void setDoe(String doe){
        this.doe = doe;
    }
    public String getDoe(){
        return this.doe;
    }
    public void setDoi(String doi){
        this.doi = doi;
    }
    public String getDoi(){
        return this.doi;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public String getDob(){
        return this.dob;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return this.state;
    }
}
