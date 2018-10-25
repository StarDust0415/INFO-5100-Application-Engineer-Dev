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
import java.util.Date;


public class Flight {
 String fltNum;
    String deparTime;
    String arrivTime;
    String deparAirport;
    String arrivAirport;
    AirLiner aln;
    AirPlane ap;
    
 public String getFltNum() {
  return fltNum;
 }
 public void setFltNum(String fltNum) {
  this.fltNum = fltNum;
 }
 public AirPlane getAp() {
  return ap;
 }
 public void setAp(AirPlane ap) {
  this.ap = ap;
 }
 public String getDeparTime() {
  return deparTime;
 }
 public void setDeparTime(String deparTime) {
  this.deparTime = deparTime;
 }
 public String getArrivTime() {
  return arrivTime;
 }
 public void setArrivTime(String arrivTime) {
  this.arrivTime = arrivTime;
 }
 public String getDeparAirport() {
  return deparAirport;
 }
 public void setDeparAirport(String deparAirport) {
  this.deparAirport = deparAirport;
 }
 public String getArrivAirport() {
  return arrivAirport;
 }
 public void setArrivAirport(String arrivAirport) {
  this.arrivAirport = arrivAirport;
 }
 public AirLiner getAln() {
  return aln;
 }
 public void setAln(AirLiner aln) {
  this.aln = aln;
 }
    
   
    
}
