package Day03.practice;

public class TestEmployee {
	 
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("naresh");
    	System.out.println("id=" + e1.getId() + ", name=" + e1.getName());
    	
        Employee e2 = new Employee(2, "suresh");
        System.out.println("id=" + e2.getId() + ", name=" + e2.getName());
    }
}
