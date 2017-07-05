package First;

class Biology extends hybridInheritance
{
	String dept;
	Biology()
	{
		super();
		dept="Name of department";
					
	}
	public void display()
	{
		System.out.println("This is in the Biology class"+dept);
	}
	
	
}
class Botony extends Biology
{
	String Subject1;
	String Subject2;
	Botony()
	{
		super();
		Subject1="There is nothing else";
		Subject2="There is Something now";
		
	}
	public void display()
	{
		System.out.println("This is in the Botony class\n"+Subject1);
	}
}

 class Zoology extends Biology
{
	String Thesis1;
	String Thesis2;
	Zoology()
	{
		
		Thesis1="One year Project ";
		Thesis2="A Half semester Project";
	}
	public void display()
	{
		System.out.println("Variable 1 in Zoology"+Thesis1);
	}
	
}	
 class Computer extends hybridInheritance
 {
	 String skillSet;
	 Computer()
	 {
		 skillSet="These are my skillSets ";
	 }
	 
 }
 class hardware extends Computer
 {
	 String hdName;
	 hardware()
	 {
		 hdName="This is hardware Section";
	 }
	 void display()
	 {
		 System.out.println(hdName+"\n this is the hardware class");
	 }
 }
 class software extends Computer
 {
	 String Thesis1;
	 String Thesis2;
	 software()
	 {
		Thesis1=" welcome to the Software Class";
		Thesis2="This is the second variable in this class";
	 }
	 void display()
	 {

			System.out.println("First Thesis is "+ Thesis1);
			System.out.println("\n the second thesis "+ Thesis2);
	 }
 }
public class hybridInheritance 
{
		String name;
		String regNo;
		hybridInheritance()
		{
			name="defaultName";
			regNo="13BCE0XXX";
		}
		public void display1()
		{
			System.out.println(this.name+"\n"+this.regNo);
		}
	
		public static void main(String args[])
		{
			hybridInheritance a= new hybridInheritance();
			a.display1();
			Zoology b = new Zoology();
			b.display();
			Botony c= new Botony();
			c.display();
			hardware h= new hardware();
			h.display();
			software s= new software();
			s.display();
			
			
		}
}

	
