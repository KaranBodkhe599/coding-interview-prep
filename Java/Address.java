import java.util.Scanner;

public class Address
{ 
	String landmark;
	 String city ; 
	 String state ;
	 String pincode ;
	
	public void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Landmark:");
		this.landmark=sc.next();
		System.out.println("Enter City:");
		this.city=sc.next();
		System.out.println("Enter State:");
		this.state=sc.next();
		System.out.println("Enter PIN Code:");
		this.pincode=sc.next();

	}
	
	public void display()
	{
		System.out.println("Address :"+landmark +" ,\n"+city+", \n"+state+", \n"+pincode);
	}

}
