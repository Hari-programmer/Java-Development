package User_Define_Exception;

public class Clock {
	
	
	private int hr;
	private int min;
	private int sec;

	
	public int gethr(){
		return hr;
	}
	public void sethr(int hr) {
		if(hr>=1 && hr<=12) 
			this.hr=hr;
		else 
			Throw new TimeInCorrectException();	
	}
	
	public int getmin() {
		return min;
	}
	public void setmin(int min) {
		if(min>=0 && min<=59) 
			this.min=min;
		else 
			Throw new TimeInCorrectException();	
	}
	
	public int getsec(){
		return sec;
	}
	public void setsec(int sec) {
		if(sec>=1 && sec<=12) 
			this.sec=sec;
		else 
			Throw new TimeInCorrectException();	
	}
	public Clock(int hr,int min,int sec) {
		super();
				if((hr>=1 && hr<=12) &&(min>=0 && min<=59 ) &&(sec>=0 && sec<=59)) {
				this.hr=hr;
				this.min=min;
				this.sec=sec;
	
	} else
	{
		Throw new TimeInCorrectException();	
		
	}
	}
	
}
