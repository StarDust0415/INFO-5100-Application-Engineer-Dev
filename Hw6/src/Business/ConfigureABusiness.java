/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.salesFunction.order;
import Business.salesFunction.order_item;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author qwe09
 */
public class ConfigureABusiness{
    
    public static business Initialize(String n){
        business b = new business();
    
        useraccountdirectory uad = b.getUad();
        supplierdirectory sd = b.getSd();
        
        market_offer_catalog moc = b.getMoc();
        market_list ml = b.getMl();
        
        
//加载market 的 csv        
        ml.loadMarket();  
        
//为每个market加载各自的customer      
        for(market m: ml.getMa()){
            m.loadCustomer();
        }

        
//配置 person （salesman & admin）
        b.loadPerson();
        ArrayList<person> pl = b.getPa();
        
//配置userAccount 将 personList输入 userAccount的 配置方法，自动对应。     
        uad.loadAccount(pl);

//配置 supplier
        sd.loadSuppliers();

//为每个supplier 配置 productCatalog        
        for(supplier s: sd.getSa()){           
            s.loadProducts();
        }
        
//配置 MarketOffer
        for(supplier s: sd.getSa()){
            moc.loadMarketOffer(s.getPc());
           // System.out.println(moc.getMarketOfferList().get(1).getM().getName());
        }

        

        
    
    

        
        return b;
    }
    
   
    
    
}

