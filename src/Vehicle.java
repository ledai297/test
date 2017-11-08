

import java.lang.Math;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Vehicle {
	
	double X, Y, angle, velocity, turnSpeed;
	double acceleration = 0;
	
	public Vehicle(double X, double Y, double angle, double velocity, double turnSpeed) {
		this.X = X;
		this.Y = Y;
		this.angle = angle;
		this.velocity = velocity;
		this.turnSpeed = turnSpeed;
	}
	
	public void ahead() {
		
		this.X += (this.velocity*Math.cos(angle));
		this.Y += (this.velocity*Math.sin(angle));
		
	}
	
	public void ahead(double distance) {
		
		this.X += (distance*Math.cos(angle));
		this.Y += (distance*Math.sin(angle));
		this.velocity = Math.sqrt(this.velocity*this.velocity + 2*this.acceleration*distance);
		
	}
	
	public void turnLeft(double degree) {
		
		double d = (degree/this.turnSpeed)*this.velocity;
		ahead(d);
		this.angle += degree;
		
	}
	
	public void turnRight(double degree) {
		
		double d = (degree/this.turnSpeed)*this.velocity;
		ahead(d);
		this.angle -= degree;
		
	}
	
	public void turnLeft() {
		
		double d = (Math.PI/2/this.turnSpeed)*this.velocity;
		ahead(d);
		this.angle += Math.PI/2;
		
	}
	
	public void turnRight() {
		
		double d = (Math.PI/2/this.turnSpeed)*this.velocity;
		ahead(d);
		this.angle -= Math.PI/2;
		
	}

	public void display() {
		
		NumberFormat numberFormat = new DecimalFormat("#0.000");
		
		System.out.print("current X : " + numberFormat.format(this.X));
		System.out.println("\tcurrent Y : " + numberFormat.format(this.Y));
		System.out.println("current angle : " + numberFormat.format(this.angle) + " rad");
		System.out.println("current velocity : "+numberFormat.format(this.velocity) +" m/s");
		System.out.println();
	}
	
	
	
}

