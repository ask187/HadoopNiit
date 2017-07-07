package First;

public class exceptionHandling {

	public static void main(String args[])
	{
		System.out.println("Exception Handling Examples");
		try
		{
			int a=10;
			int b=0;
			int abc[]= new int[3];
			abc[0]=2;
			abc[1]=1;
			System.out.println(abc[8]);
			System.out.println(a/b);
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println(" this is the finally block ");
		}
		
	}
}
