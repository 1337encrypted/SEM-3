/*
4.1) A company has two types of employees – FullTime and Partime. The company records
for each employee his/her name, age, address, salary and gender. Given the basic salary of
the FullTime employee the components of his/her gross salary are: Dearness allowance –
75% of basic salary, HRA – 7.5% of basic salary, IT – 10% of basic. The salary of a Partime
employee is dependent on the qualification, experience, number of working hours and the
rate per hour, as below:

Qualification
Experience BE MTech Ph.D
1-5 years 300 Rs. 500 Rs. 800 Rs.
6-10 years 400 Rs. 700 Rs. 1200 Rs.
&gt;10 years 500 Rs. 1000 Rs. 1500 Rs.

Model this as a problem of hierarchical inheritance by:
1) Identifying the super class with its data members and member functions.
2) Identify the sub-class/sub-classes and their associated data members and member
functions.
Test the program by creating objects of the classes that are so identified.
*/

class employee
{
	protected String name, address, gender;
	protected int age;
	protected double salary;
	
	protected employee(String name, String address, String gender, int age, double salary)
	{
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}
	
	protected void display()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Address: "+this.address);
		System.out.println("gender: "+this.gender);
		System.out.println("Age: "+this.age);
		System.out.println("Salary: "+this.salary);
	}
}

class fullTimeEmployee extends employee
{
	private double grossSalary, HRA, IT, allowance;
	
	public fullTimeEmployee(String name, String address, String gender, int age, double salary)
	{
		super(name,address,gender,age,salary);
		this.allowance = 0.75*this.salary;
		this.HRA = 0.075*this.salary;
		this.IT = 0.1*salary;
		this.grossSalary = allowance+HRA+IT;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Dearness Allowance: "+allowance);
		System.out.println("HRA: "+HRA);
		System.out.println("IT: "+IT);
		System.out.println("Gross salary: "+grossSalary);
		System.out.println();
	}
}

class partTimeEmployee extends employee
{
	private double ratePerHour;
	private String qualification;
	private int experience,numberOfWorkingHours;
	
	public partTimeEmployee(String name, String address, String gender, int age, double salary, String qualification, int experience, int numberOfWorkingHours)
	{
		super(name,address,gender,age,salary);
		this.qualification = qualification;
		this.experience = experience;
		this.numberOfWorkingHours = numberOfWorkingHours;
		
		if(experience <= 5)
		{
			if(qualification.equalsIgnoreCase("BE"))
				{
					this.ratePerHour = 300;
					this.salary = ratePerHour*numberOfWorkingHours;
				}
			else if(qualification.equalsIgnoreCase("MTech"))
				{
					this.ratePerHour = 500;
					this.salary = ratePerHour*numberOfWorkingHours;
				}
			else if(qualification.equalsIgnoreCase("Ph.D"))
				{
					this.ratePerHour = 800;
					this.salary = ratePerHour*numberOfWorkingHours;
				}
		}
		else if(experience > 6 && experience < 10)
		{
			if(qualification.equalsIgnoreCase("BE"))
				{
					this.ratePerHour = 400;
					this.salary = ratePerHour*numberOfWorkingHours;
				}
			else if(qualification.equalsIgnoreCase("MTech"))
				{
					this.ratePerHour = 700;
					this.salary = ratePerHour*numberOfWorkingHours;
				}
			else if(qualification.equalsIgnoreCase("Ph.D"))
				{
					this.ratePerHour = 1200;
					this.salary = ratePerHour*numberOfWorkingHours;
				}
		}
		else if(experience >= 10)
		{
			if(qualification.equalsIgnoreCase("BE"))
				{
					this.ratePerHour = 500;
					this.salary = ratePerHour*numberOfWorkingHours;
				}
			else if(qualification.equalsIgnoreCase("MTech"))
				{
					this.ratePerHour = 1000;
					this.salary = ratePerHour*numberOfWorkingHours;
				}
			else if(qualification.equalsIgnoreCase("Ph.D"))
				{
					this.ratePerHour = 1500;
					this.salary = ratePerHour*numberOfWorkingHours;
				}
		}
		
	}
	
	public void display()
	{
		super.display();
		System.out.println("Qualification "+this.qualification);
		System.out.println("Experience: "+this.experience);
		System.out.println("Rate per hour: "+this.ratePerHour);
		System.out.println("Salary: "+this.salary);
		System.out.println();
	}
}

class Termwork41
{
	public static void main(String args[])
	{
		fullTimeEmployee f1 = new fullTimeEmployee("Yash Herekar","C.T.S 10919 1st main 2nd cross, sadashiv nagar","Male",20,150000);
		f1.display();
		
		fullTimeEmployee f2 = new fullTimeEmployee("Aditya Herekar","C.T.S 20457 4st main 7th cross, shau nagar","Male",10,134000);
		f2.display();
		
		partTimeEmployee p1 = new partTimeEmployee("Darshan shanky","C.T.S 34566 12th main 6th cross, ambedkar nagar","Male",20,0,"BE",4,12);
		p1.display();
		
		partTimeEmployee p2 = new partTimeEmployee("Arbaaz Khatib","C.T.S 345978 3rd main 8th cross, Azam nagar","Male",20,0,"MTech",3,10);
		p2.display();
		
		partTimeEmployee p3 = new partTimeEmployee("Vinit Gunaki","C.T.S 34577 1st main 9th cross, Shahpur","Male",19,0,"Ph.D",2,15);
		p3.display();
		
		partTimeEmployee p4 = new partTimeEmployee("Yash Gadgil","C.T.S 897235 1st main 4th cross, Sadashiv nagar","Male",19,0,"MTech",7,10);
		p4.display();
		
		partTimeEmployee p5 = new partTimeEmployee("Ghandarv Talikoti","Scheme No. 40, Kuvempu Nagar, Hindalga, 591108","Male",19,0,"BE",8,15);
		p5.display();
		
		partTimeEmployee p6 = new partTimeEmployee("Piyush Airani","96 / Nagdevi Street Near Masjid Bunder Station Nagdevi,Belgaum,400003,India","Male",19,0,"Ph.D",9,13);
		p6.display();
		
		partTimeEmployee p7 = new partTimeEmployee("Puneet Joshi","42 Ratan Jyot Indl Estate Vile Parle West,Belgaum,400056,India","Male",20,0,"BE",15,22);
		p7.display();
		
		partTimeEmployee p8 = new partTimeEmployee("Shashank Joshi","H-6 1st Fl. Omkar Near Marathi Vidhiyalaya Mulund,Belgaum,400081,India","Male",22,0,"MTech",17,21);
		p8.display();
		
		partTimeEmployee p9 = new partTimeEmployee("Clyde D'souza","247  Agarwal Chs  Vashi Navi Belgaum,400703,India","Male",23,0,"Ph.D",15,16);
		p9.display();
	}
}
