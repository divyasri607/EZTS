package vehicle;

public class master {

	 private int Model;
	 private int Engine;
	 private String Color;
	public master(int model, int engine, String color) {
		
		Model = model;
		Engine = engine;
		Color  = color;
	
	}
	@Override
	public String toString() {
		return "master [Model=" + Model + ", Engine=" + Engine + ", Color=" + Color + ", toString()=" + super.toString()
				+ "]";
	}
	 void masterout()
	 {
		 System.out.println("model = " + Model);
		 System.out.println("Engine = " + Engine);
		 System.out.println("Colour = " + Color);
	 }
       
}
