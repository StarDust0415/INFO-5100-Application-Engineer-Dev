/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author gaorong
 */
public class Customer {
   String Name;
   Seat s;
   
   public Customer(){
     s = new Seat();
   }
   
 public String getName() {
  return Name;
 }
 public void setName(String name) {
  Name = name;
 }
 public Seat getS() {
  return s;
 }
 public void setS(Seat s) {
  this.s = s;
 }
   
  
    
}
