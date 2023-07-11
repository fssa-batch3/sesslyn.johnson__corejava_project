package Day02.solved;

public class App {
	public static void main(String[] args) {
		Person1 person1 = new Person1();
		person1.setName("John"); // Setting the name using the setter method
		String name1 = person1.getName(); // Accessing the name using the getter method
		System.out.println(name1); // Output: John
		
		
		Person2 person2 = new Person2();
		person2.setName("John");      // Setting the name using the setter method
		String name2 = person2.getName();  // Accessing the name using the getter method
		System.out.println(name2);    // Output: John
	}
}
