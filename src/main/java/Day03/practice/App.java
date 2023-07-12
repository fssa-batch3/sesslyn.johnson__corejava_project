package Day03.practice;

public class App {
public static void main(String[] args) {
	 User user1 = new User();
	 user1.setName("Sesslyn");
     user1.setEmail("sesslyn@gmail.com");
     user1.setId(125);
     user1.setPassword("P@ssw0rd");
 	System.out.println("name=" + user1.getName() + ", email=" + user1.getEmail() + ", password=" + user1.getPassword()+ ", id=" + user1.getId());
 	
 	 User user2 = new User("Jerusheya", "jeru@gmail.com", "A@dmin12");
     user2.setId(126);
 	 System.out.println("name=" + user2.getName() + ", email=" + user2.getEmail() + ", password=" + user2.getPassword()+ ", id=" + user2.getId());
 	
}
}
