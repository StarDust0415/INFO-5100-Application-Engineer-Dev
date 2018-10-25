/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gaorong
 */
public class Airliner {
    private ArrayList<Plane> airliner;
    private Date updateTime;

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime() {
        this.updateTime = new Date();
    }
    public Airliner()
    {
        airliner = new ArrayList<Plane>();
        updateTime = new Date();
    }

    public ArrayList<Plane> getAirliner() {
        return airliner;
    }

    public void setAirliner(ArrayList<Plane> airliner) {
        this.airliner = airliner;
    }
   
    public Plane addPlanes()       
    {
        updateTime = new Date();
        Plane vs = new Plane();
        airliner.add(vs);
        return vs;
    }
    public void deletePlanes(Plane v)
    {
        updateTime = new Date();
        airliner.remove(v);
    }
            
     
    
}
