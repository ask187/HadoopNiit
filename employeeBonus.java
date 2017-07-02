package First;
import java.util.Scanner;

public class employeeBonus {
	String empName;
	double empSal;
	double bonus;
	void getDetails()
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the Employee Name");
		empName=in.next();		
		System.out.println("Enter the Employee Salary");
		empSal=in.nextDouble();
		
	}
	void bonusCal()
	{
		if(empSal==10000)
		{
			bonus=0.3*empSal;
		}
		else
			if(empSal==50000)
			{
				bonus=0.2*empSal;
			}
			else
				if(empSal==100000)
				{
					bonus=0.1*empSal;
				}
		empSal=bonus+empSal;
		System.out.println("The new salary is "+ empSal);
		
	}
	public static void main(String args[])
	{
		employeeBonus A= new employeeBonus();
		A.getDetails();
		A.bonusCal();
	}

}
