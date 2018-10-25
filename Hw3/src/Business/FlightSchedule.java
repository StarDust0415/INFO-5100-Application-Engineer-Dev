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


public class FlightSchedule {
    private ArrayList<Flight> fls;
    private String airlineName;
    
    public String getAirlineName() {
  return airlineName;
 }
 public void setAirlineName(String airlineName) {
  this.airlineName = airlineName;
 }
 public FlightSchedule(){
     fls = new ArrayList<Flight>();
    }
 public ArrayList<Flight> getFls() {
  return fls;
 }

 public void setFls(ArrayList<Flight> fls) {
  this.fls = fls;
 }
    
 public Flight addFlight(){
  Flight fl = new Flight();
  fls.add(fl);
  return fl;
 }
    
}