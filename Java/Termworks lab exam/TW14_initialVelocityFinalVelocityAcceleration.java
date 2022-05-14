/*
5.3) Design a Vehicle class to include as data members, the vehicle’s initial velocity (u),
final velocity (v) and acceleration (a). The class must be a parameterized constructor to initialize these data members.
Design a class LawsofMotion and write two overloaded methods, computeDistanceTravelled and computeAcceleration to return the distance travelled by the vehicle and acceleration attained respectively, given the different parameter values. The class must have appropriate data members for the following methods to work. 
computeDistanceTravelled(float t)- computes and returns the distance travelled as:
u*t+0.5f*a*t*t
computeDistanceTravelled() - computes and returns the distance travelled as (( v*v
–u*u)/(2*a));
computeAcceleration(float mass, float force) - computes and returns the acceleration as
a=mass/force;
computeAcceleration(float mass, float v, float u,float t) - computes and returns the
acceleration as (m*v-m*u)/t;
Demonstrate the working by instantiating objects of the above class and verify the working of the overloaded methods.
*/

class vehicle{
	protected float u,v,a;
	
	public vehicle(float u, float v, float a){
		this.u = u;
		this.v = v;
		this.a = a;
	}
}

class lawsOfMotion extends vehicle{
	
	public lawsOfMotion(float u, float v, float a){
		super(u,v,a);
	}
	
	public double computeDistanceTravelled(float t){
		return u*t+0.5f*a*t*t;
	}
	
	public double computeDistanceTravelled(){
		return (v*v - u*u) / (2*a);
	}
	
	public double computeAcceleration(float m, float force){
		return (m/force);
	}
	
	public double computeAcceleration(float m, float v, float u, float t){
		return ((m*v-m*u)/t);
	}
}

class TW14_initialVelocityFinalVelocityAcceleration
{
	public static void main(String args[])
	{
		lawsOfMotion obj = new lawsOfMotion(10f,30f,2f);
		System.out.println("Distance Travelled: "+obj.computeDistanceTravelled(5f));
		System.out.println("Distance Travelled: "+obj.computeDistanceTravelled());
		System.out.println("Acceleration: "+obj.computeAcceleration(100f,20f));
		System.out.println("Acceleration: "+obj.computeAcceleration(50f,20f,10f,10f));
	}
}