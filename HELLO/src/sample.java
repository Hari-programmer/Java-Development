
public class sample {
	private String name;
	private int  age;
	private long no;
	
 public String getname() {
		return name;
		}
 public void setname(String n) {
	 this.name=name;
 }

 public int getage() {
		return age;
		}
public void setage(int n) {
	 this.age=age;
}
public long getno() {
	return no;
	}
public void setno(long n) {
 this.no=no;
}
public sample (String nm,int ag,long no){
	this.name=nm;
	this.age=ag;
	this.no=no;
	
}
void display () {
	
	System.out.println("name: "  +this.name +"age:"   +this.age +"no:"   +this.no);
}

}



