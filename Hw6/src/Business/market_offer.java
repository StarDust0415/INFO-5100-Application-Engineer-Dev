/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author qwe09
 */
public class market_offer {
    product p;
    String market;
    int floor;
    int ceiling;
    int target;

 /*   public market_offer(product p, market m){
        this.p = p;
        this.m = m;
    }

*/
    
    
    
    public product getP() {
        return p;
    }

    public void setP(product p) {
        this.p = p;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCeiling() {
        return ceiling;
    }

    public void setCeiling(int ceiling) {
        this.ceiling = ceiling;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }
    
    public String toString(){
        return this.getP().toString();
    }
    
}
