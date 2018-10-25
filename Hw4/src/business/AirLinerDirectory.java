/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
import java.util.ArrayList;
/**
 *
 * @author 君实
 */
public class AirLinerDirectory {
    private ArrayList<AirLiner> ald;

    public AirLinerDirectory() {
        this.ald = new ArrayList<AirLiner>();
    }

    public ArrayList<AirLiner> getAld() {
        return ald;
    }

    public void setAld(ArrayList<AirLiner> ald) {
        this.ald = ald;
    }
    public AirLiner addAln()       
    {
        //updateTime = new Date();
        AirLiner aln = new AirLiner();
        ald.add(aln);
        return aln;
    }
    public void deleteAln(AirLiner aln)
    {
        //updateTime = new Date();
        ald.remove(aln);
    }
    
}
