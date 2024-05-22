package vehicle;

public class car extends master {
	private String Type;

	public car(int model, int engine, String color, String type) {
		super(model, engine, color);
		Type = type;
	}

	@Override
	public String toString() {
		return "car [Type=" + Type + ", toString()=" + super.toString() + "]";
	}
	
	void carout() {
		super.masterout();
		System.out.println("Type = "+Type);
	}
	

}
