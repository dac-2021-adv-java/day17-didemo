package in.edac;

public class Main {

	public static void main(String[] args) {
		
		// COMPLEX OBJECT :: DISEL/PETROL/ELECTRIC/BATTERY/SOLAR
		Engine e = new Engine("SOLAR");
		
		Car car = new Car(1, "AAA", "BLACK", e);
		
		System.out.println(car);
		
	}
	
}
