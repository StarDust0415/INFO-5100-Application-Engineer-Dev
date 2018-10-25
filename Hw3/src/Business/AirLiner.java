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
public class AirLiner {
    String Name;
    FlightSchedule fls;
    
    public AirLiner(){
     fls = new FlightSchedule();
    }
 public String getName() {
  return Name;
 }
 public void setName(String name) {
  Name = name;
 }
 public FlightSchedule getFls() {
  return fls;
 }
 public void setFls(FlightSchedule fls) {
  this.fls = fls;
 }
    
    
}
    

