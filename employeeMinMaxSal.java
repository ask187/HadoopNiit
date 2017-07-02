package First;
import java.util.Scanner;

public class employeeMinMaxSal {
String empName;
String empId;
int empAge;
double empSal;
String empDept;
 
void getDetails()
{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Name");
	empName=in.next();
	System.out.println("Enter the id");
	empId=in.next();
	System.out.println("Enter the age");
	empAge=in.nextInt();
	System.out.println("Enter the Salary");
	empSal=in.nextDouble();
	System.out.println("Enter the Department");
	empDept=in.next();
	
	
}
double getSal()
{
	return empSal;
}
public static void main(String args[])
{
	employeeMinMaxSal e= new employeeMinMaxSal();
	int i;
	double minSal=1000000,maxSal=0,Salary;
	for(i=0;i<3;i++)
	{
		e.getDetails();
		Salary=e.getSal();
		if(minSal>Salary)
		{
			minSal=Salary;
		}
		if(maxSal<Salary)
		{
			maxSal=Salary;
		}
	}
	System.out.println("The Minimum Salary is "+ minSal);
	System.out.println("The Maximum Salary is"+ maxSal);
}	

}
