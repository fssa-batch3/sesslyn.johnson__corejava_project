package Day03.mise;

import java.time.LocalDateTime;

public class Logger {

	public static void info(String msg) {
		System.out.println("INFO: " + msg);
	}
	
	public static void debug(String msg) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date.toString().concat(": " + msg));
	}
	
	public static void main(String[] args) {
		Logger.info("Hello World");
		Logger.debug("Hello World");
	}
}
