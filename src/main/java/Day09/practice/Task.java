package Day09.practice;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;


public class Task implements Comparable<Task>{

	private int id;
	private String name;
	private LocalDate deadLine;
	private int priority;
	
	public Task(int id, String name, String deadLine, int priority) {
		
		this.id = id;
		this.name = name;
		
		try {
            this.deadLine = LocalDate.parse(deadLine);
            
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid deadline format. Please use the format 'YYYY-MM-DD'");
        }
		
		this.priority = priority;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDeadLine() {
		return deadLine;
	}

	public int getPriority() {
		return priority;
	}
	
	@Override
	public int compareTo(Task t) {
		return this.deadLine.compareTo(t.getDeadLine());
	}

	
	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", deadLine=" + deadLine + ", priority=" + priority + "]";
	}
	
	
}
