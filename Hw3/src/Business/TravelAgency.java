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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TravelAgency {
    private ArrayList<Customer> costumerCatalog;
    private ArrayList<AirLiner> Airliners;
    private ArrayList<Flight> MasterSchedule;
    
    public TravelAgency(){
    	costumerCatalog = new ArrayList<Customer>();
    	Airliners = new ArrayList<AirLiner>();
    	MasterSchedule = new ArrayList<Flight>();
    }
    
	public ArrayList<Customer> getCostumerCatalog() {
		return costumerCatalog;
	}

	public void setCostumerCatalog(ArrayList<Customer> costumerCatalog) {
		this.costumerCatalog = costumerCatalog;
	}

	public ArrayList<AirLiner> getAirliners() {
		return Airliners;
	}

	public void setAirliners(ArrayList<AirLiner> airliners) {
		Airliners = airliners;
	}

	public ArrayList<Flight> getMasterSchedule() {
		return MasterSchedule;
	}

	public void setMasterSchedule(ArrayList<Flight> masterSchedule) {
		MasterSchedule = masterSchedule;
	}

    
   public void readAlns(){
	   File csv = new File("Airliners.csv");  // CSV文件路径
	    BufferedReader br = null;
	    try
	    {
	        br = new BufferedReader(new FileReader(csv));
	    } catch (FileNotFoundException e)
	    {
	        e.printStackTrace();
	    }
	    String line = "";
	    String everyLine = "";
	    try {
	            List<String> allString = new ArrayList<>();
	            while ((line = br.readLine()) != null)  //读取到的内容给line变量
	            {
	                everyLine = line;
	                String arg[] = everyLine.split(",");
	                AirLiner aln = new AirLiner();
	                aln.setName(arg[0]);
	                Airliners.add(aln);
	            }
	            System.out.println("csv表格中所有行数："+allString.size());
	    } catch (IOException e)
	    {
	        e.printStackTrace();
	    }
   }
   
   public void readSchedule(){
	   File csv = new File("Master Schedule.csv");  // CSV文件路径
	    BufferedReader br = null;
	    try
	    {
	        br = new BufferedReader(new FileReader(csv));
	    } catch (FileNotFoundException e)
	    {
	        e.printStackTrace();
	    }
	    String line = "";
	    String everyLine = "";
	    try {
	            List<String> allString = new ArrayList<>();
	            while ((line = br.readLine()) != null)  //读取到的内容给line变量
	            {
	                everyLine = line;
	                String arg[] = everyLine.split(",");
	                
	                for(AirLiner aln : Airliners )
	                {
	                	if(aln.getName().equals(arg[0]))
	                	{
	                		FlightSchedule fs = aln.getFls();
	                		Flight flt = fs.addFlight();
	                		flt.setAln(aln);
	                		flt.setDeparTime(arg[3]);
			                flt.setArrivTime(arg[4]);
			                flt.setDeparAirport(arg[1]);
			                flt.setArrivAirport(arg[2]);
			                flt.setFltNum(arg[6]);
			                AirPlane ap = new AirPlane();
			                ap.setSerialNum(Integer.parseInt(arg[5]));
			                flt.setAp(ap);
			                aln.setFls(fs);
			                MasterSchedule.add(flt);
	                	}
	                	
	                }
	                
	                
	                
	            }
	            System.out.println("csv表格中所有行数："+allString.size());
	    } catch (IOException e)
	    {
	        e.printStackTrace();
	    }
   }
   
   
   public void readCustomer(){
	   File csv = new File("Costumer Directory.csv");  // CSV文件路径
	    BufferedReader br = null;
	    try
	    {
	        br = new BufferedReader(new FileReader(csv));
	    } catch (FileNotFoundException e)
	    {
	        e.printStackTrace();
	    }
	    String line = "";
	    String everyLine = "";
	    try {
	            List<String> allString = new ArrayList<>();
	            while ((line = br.readLine()) != null)  //读取到的内容给line变量
	            {
	                everyLine = line;
	                String arg[] = everyLine.split(",");
	                Customer c = new Customer();
	                c.setName(arg[0]);
	                c.getS().setCol(Integer.parseInt(arg[7]));
	                c.getS().setRow(Integer.parseInt(arg[6]));
	                c.getS().setPrice(Integer.parseInt(arg[8]));
	                costumerCatalog.add(c);
	                for(Flight flt : MasterSchedule){
	                	if(flt.getAln().getName().equals(arg[1]) && flt.getDeparTime().equals(arg[4]))
	                	{
	                	   flt.getAp().getAssginedSeat().add(c.getS());
	                	}
	                }
	                
	                
	            }
	            System.out.println("csv表格中所有行数："+allString.size());
	    } catch (IOException e)
	    {
	        e.printStackTrace();
	    }
	   
	   
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TravelAgency ta = new TravelAgency();
        ta.readAlns();
        ta.readSchedule();
        ta.readCustomer();
        int total = 0;
        System.out.println("------------------------------------------");
        System.out.println("Revenue per flight:");
        System.out.println("------------------------------------------");
        for(Flight flt : ta.getMasterSchedule()){
        	int sum = 0;
        	for(Seat s : flt.getAp().getAssginedSeat())
        	{
        		sum+=s.getPrice();
        	}
        	System.out.println(flt.getFltNum()+" has revenue: "+sum);
        	total +=sum;
        }
        
        System.out.println("------------------------------------------");
        System.out.println("Revenue per Airliner:");
        System.out.println("------------------------------------------");
        for(AirLiner aln : ta.getAirliners()){
        	int sum = 0;
        	for(Flight flt : aln.getFls().getFls()){
	        	for(Seat s : flt.getAp().getAssginedSeat())
	        	{
	        		sum+=s.getPrice();
	        	}
        	}
        	System.out.println(aln.getName()+" has revenue: "+sum);
        }
        
        System.out.println("------------------------------------------");
        System.out.println("Total revenue is: "+ total);
        System.out.println("------------------------------------------");
        
	}

}
