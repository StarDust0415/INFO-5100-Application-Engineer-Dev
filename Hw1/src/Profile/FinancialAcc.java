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
public class FinancialAcc {
   private String accNum;
   private String debt;
   private String credit;
   private String cretionDate;
   private boolean activeStatus;
   private boolean isSavingAcc;
   
   public FinancialAcc(){
       
   }
   
   public void setAccNum(String accNum){
        this.accNum = accNum;
   }
   public String getAccNum(){
        return this.accNum;
   }
   
   public void setCretionDate(String cretionDate){
        this.cretionDate = cretionDate;
   }
   public String getCretionDate(){
        return this.cretionDate;
   }
   public void setDebt(String debt){
        this.debt = debt;
   }
   public String getDebt(){
        return this.debt;
   }
   public void setCredit(String credit){
        this.credit = credit;
   }
   public String getCredit(){
        return this.credit;
   }
   public void setActiveStatus(boolean activeStatus){
        this.activeStatus = activeStatus;
   }
   public boolean getActiveStatus(){
        return this.activeStatus;
   }
   public void setIsSavingAcc(boolean isSavingAcc){
        this.isSavingAcc = isSavingAcc;
   }
   public boolean getIsSavingAcc(){
        return this.isSavingAcc;
   }
}
