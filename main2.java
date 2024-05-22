package vehicle;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
   master vehicle = new master(2020, 999, "red");
		
		System.out.println(vehicle.toString());
		
		vehicle.masterout();
		
		car c = new car(2020, 999, "blue", "sports");
		bus b = new bus(2021, 34, "green","metro");
		
		System.out.println(c.toString());
		System.out.println(b.toString());
		
		c.carout();
		b.busout();
	}



	}


