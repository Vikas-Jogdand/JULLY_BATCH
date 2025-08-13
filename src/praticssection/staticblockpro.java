package praticssection;

public class staticblockpro {
	int a = 10;

	// Constructor
	public staticblockpro() {
		System.out.println("Inside constructor, a = " + a);
	}

	// Static block - runs once when the class is loaded
	static {
		System.out.println("Static block executed before main method");
	}

	public static void main(String[] args) {
		// Object creation
		staticblockpro sc = new staticblockpro();
		
	}
}
