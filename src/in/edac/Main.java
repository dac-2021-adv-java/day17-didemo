package in.edac;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "mumbai", "mumbai@gmail.com", "221121");
		System.out.println(user1.getId());
		System.out.println(user1.getName());
		System.out.println(user1.getAddress());
		
		
		Address a1 = new Address("kharghar", "MH");
		User user2 = new User(2, "prafulla", "prafull@gmail.com", "121212", a1);
		System.out.println(user2.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getAddress());
		System.out.println(user2.getAddress().getCity());
		
	}
	
}
