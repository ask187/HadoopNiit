package First;
import java.util.Scanner;


public class StudentInformation {

	String StudId;
	String StudName;
	int StudAge;
	String StudCity;
	
	void getDetails(){
		
		Scanner s= new Scanner(System.in);
		int totalStudentsAbove21=0;
		System.out.println("enter Student Id");
		StudId=s.next();
		System.out.println("enter Student Name");
		StudName=s.next();
		System.out.println("enter Student Age");
		StudAge=s.nextInt();
		System.out.println("enter City");
		StudCity=s.next();
		if(StudAge>21)
		{
			totalStudentsAbove21++;
			
		}
		System.out.println(StudId+"\n"+StudName+"\n"+StudAge+"\n"+StudCity);
		System.out.println("The no of studenst above 21 is "+ totalStudentsAbove21);
	}

	public static void main(String Args[])
	{
		StudentInformation N= new StudentInformation();
		N.getDetails();
		N.getDetails();
	}
}
