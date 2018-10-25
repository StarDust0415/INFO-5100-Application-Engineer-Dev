package business;
public class AirLiner {
    String Name;
    String Abbreviation;
    FlightSchedule fls;

   
    
    public AirLiner(){
    	fls = new FlightSchedule();
    }
    
    public String getAbbreviation() {
        return Abbreviation;
    }

    public void setAbbreviation(String Abbreviation) {
        this.Abbreviation = Abbreviation;
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

    @Override
    public String toString() {
        return  Abbreviation;
    }
    
    
}
