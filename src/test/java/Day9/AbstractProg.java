package Day9;

abstract class Car  
{  
//abstract method   
abstract void start();  
//non-abstract method  
public void stop()  
{  
System.out.println("The car engine is not started.");  
}  
}  

public class AbstractProg extends Car {
	void start()  
	{  
	System.out.println("The car engine has been started.");  
	}  

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		AbstractProg obj = new AbstractProg(); 		 
		obj.start();  
		obj.stop();  

	}

}
