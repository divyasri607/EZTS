package vehicle;

public class bus extends master {
	private String Type;

	public bus(int model, int engine, String color, String type) {
		super(model, engine, color);
		Type = type;
	}

	@Override
	public String toString() {
		return "bus [Type=" + Type + ", toString()=" + super.toString() + "]";
	}
	
	void busout() {
		super.masterout();
		System.out.println("Type = "+Type);
	}
      
}
