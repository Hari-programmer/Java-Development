public class Clock {					//HAS -A- REALATION BY USING  ENCAPSULATION 
		private int hr;
		private int min;
		private int sec;

		public void sethr(int hr){			//SETTERS ----WRITE A CODE 
		if(hr>=1  && hr<=12)
		this.hr=hr;
		else
		System.out.println("Enter hours incorrect");
		}

		public int gethr(){				// GETTERS ----READ THE CODE BY USERS
		return this.hr;
		}

		public void setmin(int min){		//SETTERS ----WRITE A CODE 

		if(min>=0  && min<=59)
		this.min=min;
		else
		System.out.println("Enter minites incorrect");
		}

		public int getmin(){				// GETTERS ----READ THE CODE BY USERS

		return this.min;
		}

		public void setsec(int sec){ 		//SETTERS ----WRITE A CODE 

		if(sec>=0  && sec<=59)
		this.sec=sec;
		else
		System.out.println("Enter secounds incorrect");
		}

		public int getsec(){				// GETTERS ----READ THE CODE BY USERS

		return this.sec;
		}





		public Clock(int hr,int min,int sec){		//CONSTRACTOR BY PASSING FORMAL ARGUMENTS 

		if((hr>=1 && hr<=12) &&(min>=0 && min<=59)&& (sec>=0 && sec<=59)){		 //IF-CONDITION OF INSTRACTION 

		this.hr=hr;
		this.min=min;
		this.sec=sec;
		}
		 else {
		System.out.println("Idiot ! Enter Correct Number");
		}

		}


		public void display(){
		System.out.println(this.hr+" :"+this.min+ " :"+this.sec);
		}
		}

		class ClockTower{			//BY TACKING ANOTHER CLASS 
		 Clock clock;				//REFRENCE OF ONE CLASS IN ANOTHER CLASS AS A GLOBAL VARIABLE 
		 String loc;

		public ClockTower(Clock clock,String loc){ // CONSTRACTOR BY PASSING FORMAL ARGUMENTS 

		 this .clock=clock;
		 this .loc=loc;
		}

		void display1(){
		System.out.println("Location: "+this.loc);
		}


		}


		class Time{ 				// BY TACKING ANOTHER CLASS 

		public static void main(String [] args){

		System.out.println("hello guys ..... ");

		ClockTower clocktower=new ClockTower(new Clock(12,25,59),"YANAM");	//CREATE OBJECT OF CLASS & CONSTRACTOR PASSING PARAMETERS VALUES . 

		clocktower.clock.display();
		clocktower.display1();

		ClockTower clocktower1=new ClockTower(new Clock(10,30,20),"HYDERABAD");
		clocktower1.clock.display();
		clocktower1.display1();

		ClockTower clocktower2=new ClockTower(new Clock(11,55,44),"CHENNAI");
		clocktower2.clock.display();
		clocktower2.display1();


		}

		} 



