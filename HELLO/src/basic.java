public class basic {
	int  number ;
	String name;
	double sal;
	char sex;
	

	public basic(int nmb,String nm,double sal,char sex)
	
	{
		this.number=nmb;
		this.name=nm;
		this.sal=sal;
		this.sex=sex;
		// TODO Auto-generated constructor stub
	}

	
	public void display() {
		
		System.out.println("id:"+this.number);
		System.out.println("name:"+this.name);
		System.out.println("salary:"+this.sal);
		System.out.println("sex:"+this.sex);
		
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		basic b=new basic(1,"priya",30000.00,'F');
		b.display();
		
		basic b1=new basic(2,"hari",50000.00,'M');
		b1.display();
		
		
		

	}

}
