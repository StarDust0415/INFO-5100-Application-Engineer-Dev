package business;
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
