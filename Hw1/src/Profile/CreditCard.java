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
public class CreditCard {
    private String bank;
    private String cardNum;
    private String nameOnCard;
    private String expiration;
    private String creditLine;
    
    public CreditCard(){
    
    }
    
    public void setBank(String bank){
        this.bank = bank;
    }
    public String getBank(){
        return this.bank;
    }
    public void setNameOnCard(String nameOnCard){
        this.nameOnCard = nameOnCard;
    }
    public String getNameOnCard(){
        return this.nameOnCard;
    }
    public void setExpiration(String expiration){
        this.expiration = expiration;
    }
    public String getExpiration(){
        return this.expiration;
    }
    public void setCardNum(String cardNum){
        this.cardNum = cardNum;
    }
    public String getCardNum(){
        return this.cardNum;
    }
    public void setCreditLine(String creditLine){
        this.creditLine = creditLine;
    }
    public String getCreditLine(){
        return this.creditLine;
    }
}
