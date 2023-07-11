package Day02.practice;

public class App {
	public static void main(String[] args) {
		 
		 User user = new User();
		 user.setName("Sesslyn");
         user.setEmail("sesslyn@gmail.com");
         user.setId(125);
         user.setPassword("P@ssw0rd");
         System.out.println(user.getName());
         System.out.println(user.getEmail());
         System.out.println(user.getId());
         System.out.println(user.getPassword());
         
        
         Logger.debug("Debug the code");
         Logger.debug(15);
         Logger.error(20);
         Logger.error("Compilation Error");
         Logger.info("Practice sum");
         Logger.info(10);
	} 
}
