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
public class Seat {
   private int row;
   private int col;
   private int price;
   private AirPlane ap;
   
   public Seat(){
    ap = new AirPlane();
   }
   
 public int getRow() {
  return row;
 }
 public void setRow(int row) {
  this.row = row;
 }
 public int getCol() {
  return col;
 }
 public void setCol(int col) {
  this.col = col;
 }
 public int getPrice() {
  return price;
 }
 public void setPrice(int price) {
  this.price = price;
 }
 public AirPlane getAp() {
  return ap;
 }
 public void setAp(AirPlane ap) {
  this.ap = ap;
 }
    
   
}
