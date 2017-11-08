//Class chua ham main


public class mainVehicle {

	public static void main(String[] args) {
		System.out.println("Le Trong Dai-- 20155320");
		System.out.println();
		Vehicle vehicle = new Vehicle(1, 1, Math.PI/3, 10, 1);
		
		vehicle.display();
		
		System.out.println("Re trai voi goc quay: PI/3");
		vehicle.turnLeft(Math.PI/3);
		vehicle.display();
		
		
		
		System.out.println("Tien ve phia truoc voi gia toc bang 2");
		vehicle.acceleration = 2;
		vehicle.ahead(100);
		vehicle.display();
		
		

	}

}
