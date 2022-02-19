/*
Design an abstract class Car to have carName, chassiNum, modelName as member variables and add two abstract methods, startCar and operateSteering. Inherit MarutiCar and BmwCar from Car class and override the two abstract methods in their own unique way. Design a driver class to have driver name, gender and age as data members and add a method driveCar with abstract class reference variable as argument and invoke the two basic operations namely, startCar and operateStearing and demonstrate run-time polymorphism.
*/

abstract class car{
	public String carName, modelName;
	public int chassisNum;
	
	public car(String carName, String modelName, int chassisNum){
		this.carName = carName;
		this.modelName = modelName;
		this.chassisNum = chassisNum;
	}
	
	abstract public void startCar();
	abstract public void operateSteering();
	
	public void display(){
		System.out.println("Car name: "+carName);
		System.out.println("Model number: "+modelName);
		System.out.println("Chassis number: "+chassisNum);
	}
}

class maruti extends car{
	public maruti(String carName, String modelName, int chassisNum){
		super(carName,modelName,chassisNum);
	}
	
	@Override
	public void startCar(){
		System.out.println("Maruti car is starting");
	}
	
	@Override
	public void operateSteering(){
		System.out.println("It has a manual transmission");
	}
}

class bmw extends car{

	public bmw(String carName, String modelName, int chassisNum){
		super(carName,modelName,chassisNum);
	}
	
	@Override
	public void startCar(){
		System.out.println("BMW car is starting");
	}
	
	@Override
	public void operateSteering(){
		System.out.println("It has an automatic transmission");
	}
}

class driver{

	private String driverName;
	private char gender;
	private int age;
	
	public driver(String driverName, char gender, int age){
		this.driverName = driverName;
		this.gender = gender;
		this.age = age;
	}
	
	public void drive(car obj){
		System.out.println("Driver name: "+driverName);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		obj.display();
		obj.startCar();
		obj.operateSteering();
		System.out.println();
	}
}

class Termwork61{
	public static void main(String args[])
	{
		
		car c = new maruti("swift","dzire",1);
		driver d1 = new driver("Darshan",'M',20);
		d1.drive(c);
		
		c = new maruti("BMW M3 GTR","M3",10);
		driver d2 = new driver("Kiran",'M',21);
		d2.drive(c);
	}
}
