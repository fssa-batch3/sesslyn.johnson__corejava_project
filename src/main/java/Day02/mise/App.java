package Day02.mise;

public class App {
	public static void main(String[] args) {
		Academy academy = new Academy();
		academy.setName("Freshworks Software Academy");
		academy.setId(15);
		academy.setCode("fssa");

		Student student1 = new Student();
		student1.setName("Sesslyn");
		student1.setEmail("sesslyn@gmail.com");
		student1.setId(0125);
		System.out.println(Student.count);

		Student student2 = new Student();
		student2.setName("Mathivanan");
		student2.setEmail("mathi@gmail.com");
		student2.setId(0126);
		System.out.println(Student.count);

	}
}
