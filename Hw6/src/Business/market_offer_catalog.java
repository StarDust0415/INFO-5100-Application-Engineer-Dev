/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author qwe09
 */
public class market_offer_catalog {
    ArrayList<market_offer>  marketOfferList;
     
    public market_offer_catalog(){
        marketOfferList = new ArrayList();
    }

    public ArrayList<market_offer> getMarketOfferList() {
        return marketOfferList;
    }

    public void setMarketOfferList(ArrayList<market_offer> marketOfferList) {
        this.marketOfferList = marketOfferList;
    }

    
    
    public market_offer addMarketOffer(){
        market_offer mo = new market_offer();
        marketOfferList.add(mo);
        return mo;
    }
    

    public void loadMarketOffer(product_catalog pc){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Data_csv/MarketOffers.csv"));//换成你的文件名   
            String line = null; 
            while((line=reader.readLine())!=null){
               String Item[] = line.split(","); 

                   for(product p: pc.getAp()){
                       if(p.getID().equals(Item[0])){
                           market_offer mf = this.addMarketOffer();
                           product product = pc.findProductById(Item[0]);
                           mf.setP(product);
                           mf.setMarket(Item[1]);
                           mf.setFloor(Integer.parseInt(Item[2]));
                           mf.setCeiling(Integer.parseInt(Item[3]));
                           mf.setTarget(Integer.parseInt(Item[4]));
                           System.out.println(mf.getP().getID() + "product in market【 " + mf.getMarket() + "】 is added in marketOfferList" + "target is" + mf.getTarget());
                       }
                   }

                   }

        } catch (Exception e) {    
            e.printStackTrace();    
        }  
        
        
    }
    
    public market_offer findOffer(String market, product p){
    
        market_offer mo = new market_offer();
        for(market_offer moResult: marketOfferList){
            
            if(moResult.getP() == p){
                if(moResult.getMarket().equals(market)){
                    System.out.println("hehe");
                    mo = moResult;
                }
            }        
        }
        return mo;
    }
    

}
