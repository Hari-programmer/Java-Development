
interface Demo{
	public int getValue();
}
class B implements Demo{ 
	public int getValue()
	{return 1;
	}
} 
class C extends B {
	public void add(C c1,C c2){c1.getValue();}
}
	
	

