/*
4.2) Design a base class called Employee who work for a Hospital and this class would have name, dob, address, salary and designation as the attributes.
Add a constructor to initialize all these data members. This class would have reportForDuty method to display reporting time and date with a “Welcome” message to the employee. 
Devise two derived classes Doctor and Nurse to have expertise and yearsofExperience as data members respectively. Devise a method performDuty in each of these derived classes to print appropriate message depending on expertise of doctor and years of experience. For instance if the experitise of the Doctor is Surgeon and yearsofExperience &gt;10 then print “Perform Heart Operation” else perform “Perform minor Surgery”. If his expertise is orthopedic and experience is more than 5 years “Perform surgery and Plastering” else “Perform Plastering”. If the nurse has more than 3 years experience in performDuty method print “Check BP, Sugar” and “Administer medicine” else print “Look after the patient”. Create a Hospital Class that has main method, and instantiate objects of Doctor and Nurse and Perform reportForDuty and performDuty and record the output. Add a static method generateReport(Employee e) that accepts object of employee type and prints in a tabular form, Name, dob, birthday salary and the designation.

Note :
To get current time and date create an object of Calendar class declared in java.util package
by importing it… import java.util.Calendar. to create calendar object..
Calendar cal=Calendar.getInstance();
To print date and time System.out.println(cal.getTime());
*/
import java.util.Calendar;
class employee
{
	protected String name, address, designation;
	protected int d,m,y;
	protected double salary;
	
	public employee(String name, String address, String designation, int d, int m, int y, double salary)
	{
		this.name = name;
		this.address = address;
		this.designation = designation;
		this.d = d;
		this.m = m;
		this.y = y;
		this.salary = salary;
	}
		
	public void reportForDuty()
	{
		Calendar cal = Calendar.getInstance();
		System.out.println("Welcome");
		System.out.println("Reporting time: "+cal.getTime());
		System.out.println("Date: "+cal);
	}
	
	public static void generateReport(employee e)
	{
		System.out.println("Name: "+e.name);
		System.out.println("Address: "+e.address);
		System.out.println("Date of birth: "+e.d+"/"+e.m+"/"+e.y);
		System.out.println("Salary: "+e.salary);
		System.out.println("Designation: "+e.designation);
	}
}

class doctor extends employee
{
	String expertise;
	int yearsOfExperience;
	
	public doctor(String name, String address, String designation, int d, int m, int y, double salary, String expertise, int yearsOfExperience)
	{
		super(name,address,designation,d,m,y,salary);
		this.expertise = expertise;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public void performDuty()
	{
		if(expertise.equalsIgnoreCase("Surgeon") && yearsOfExperience > 10)
		{
			System.out.println("Expertise: "+"Perform Heart Operation");	
		}
		else if(expertise.equalsIgnoreCase("Surgeon") && yearsOfExperience < 10)
		{
			System.out.println("Expertise: "+"Perform minor Operation");
		}
		else if(expertise.equalsIgnoreCase("orthopedic") && yearsOfExperience > 5)
		{
			System.out.println("Expertise: "+"Perform surgery and Plastering");	
		}
		else if(expertise.equalsIgnoreCase("orthopedic") && yearsOfExperience < 5)
		{
			System.out.println("Expertise: "+"Perform Plastering");
		}
		System.out.println("\n");
	}
}

class nurse extends employee
{
	String expertise;
	int yearsOfExperience;
	
	public nurse(String name, String address, String designation, int d, int m, int y, double salary, String expertise, int yearsOfExperience)
	{
		super(name,address,designation,d,m,y,salary);
		this.expertise = expertise;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public void performDuty()
	{
		if(yearsOfExperience > 3)
		{
			System.out.println("Check BP, Sugar and Administer medicine");	
		}
		else
		{
			System.out.println("Look after the patient");
		}
		System.out.println("\n");
	}
}

class Termwork42
{
	public static void main(String args[])
	{
		doctor doc1 = new doctor("Yash Herekar","C.T.S 10919 1st main 2nd cross, sadashiv nagar.","Senior surgeon",12,9,2001,1500000,"Surgeon",15);
		employee.generateReport(doc1);
		doc1.performDuty();
		
		doctor doc2 = new doctor("Aditya Don mulla","C.T.S 20935 5st main 10nd cross, Shastri nagar","Junior surgeon",1,1,2011,100000,"Surgeon",9);
		employee.generateReport(doc2);		
		doc2.performDuty();
		
		doctor doc3 = new doctor("Vinit Gunaki","C.T.S 45678 10st main 3nd cross, Shahpur.","Senior orthopedic",15,9,2002,1000000,"Orthopedic",5);
		employee.generateReport(doc3);	
		doc3.performDuty();			
		
		doctor doc4 = new doctor("Arbaaz khatib","C.T.S 30547 8st main 15nd cross, Azam nagar","Junior orthopedic",13,12,2009,100000,"Orthopedic",2);
		employee.generateReport(doc4);
		doc4.performDuty();
		
		nurse n1 = new nurse("Darshan Parsannavar","C.T.S 50897 8st main 5nd cross, Ambedkar nagar","Senior Nurse",18,9,2001,10000,"Nurse",4);
		employee.generateReport(n1);
		n1.performDuty();
		
		nurse n2 = new nurse("Deeptanshu Chandgadkar","C.T.S 58005 12st main 25nd cross, shau nagar","Junior Nurse",13,10,2001,10000,"Nurse",2);
		employee.generateReport(n2);
		n2.performDuty();
		
	}
}

