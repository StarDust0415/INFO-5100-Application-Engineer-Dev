package business;
import java.util.Date;


public class Flight {
    String fltNum;
    String Time;
    String schedule;
    String deparAirport;
    String arrivAirport;
    AirLiner aln;
    Double seatPrice;
    int curSeatNum;
    //AirPlane ap;

    public Flight() {
        curSeatNum = 24*6;
    }
    
    public int getCurSeatNum() {
        return curSeatNum;
    }

    public void setCurSeatNum(int curSeatNum) {
        this.curSeatNum = curSeatNum;
    }

    public Double getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(Double seatPrice) {
        this.seatPrice = seatPrice;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    
	public String getFltNum() {
		return fltNum;
	}
	public void setFltNum(String fltNum) {
		this.fltNum = fltNum;
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

    @Override
    public String toString() {
        return fltNum;
    }
    
    
    
}
