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
         
         Logger log = new Logger();
         Logger.debug("Debug the code");
         Logger.debug(15);
         log.error(20);
         log.error("Compilation Error");
         log.info("Practice sum");
         log.info(10);
	} 
}
