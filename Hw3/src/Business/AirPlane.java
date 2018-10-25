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
import java.util.ArrayList;


public class AirPlane {
   private int serialNum;
   private ArrayList<Seat> assginedSeat;
   public AirPlane(){
    assginedSeat = new ArrayList<Seat>();
   }
   public int getSerialNum() {
 return serialNum;
   }
   public void setSerialNum(int serialNum) {
 this.serialNum = serialNum;
   }
   public ArrayList<Seat> getAssginedSeat() {
 return assginedSeat;
   }
   public void setAssginedSeat(ArrayList<Seat> assginedSeat) {
 this.assginedSeat = assginedSeat;
   }
   
   
   
   
}
    

