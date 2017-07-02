package First;
import java.util.Scanner;

public class highestNumber {
	int number1;
	int number2;
	int number3;
	int highest;
	void function()
	{
		System.out.println("enter the number 1");
		Scanner in = new Scanner(System.in);
		number1 = in.nextInt();
		System.out.println("enter the number 2");

		number2 = in.nextInt();
		System.out.println("enter the number 3");
		
		number3 = in.nextInt();
	}
	void compare()
	{
		if(number1>=number2 && number1>=number3)
		{
			highest=number1;
		}
		else
			if(number2>=number1 && number2>=number1)
			{
				highest=number2;
			}
			else
				if(number3>=number1 && number3>=number3)
				{
					highest=number3;
				}
		System.out.println("the greatest number is "+ highest);
	}
	public static void main(String args[]){
		highestNumber a= new highestNumber();
		a.function();
		a.compare();
		
	}
}
