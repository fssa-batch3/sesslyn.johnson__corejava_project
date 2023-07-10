package Day01.practice;

public class Cat {

    private int age;
    private String color;
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getSpeak() {
       return "Meow!";
    }

    public static void main(String[] args) {
      
        Cat cat1 = new Cat();
        cat1.setColor("White");
        cat1.setAge(4);
        Cat cat2 = new Cat();
        cat2.setColor("Black");
        cat2.setAge(3);

        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Color: " + cat1.getColor());
        System.out.println("Speaks: " + cat1.getSpeak());

        System.out.println("Dog 2:");
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Color: " + cat2.getColor());
        System.out.println("Speaks: " + cat1.getSpeak());
    }
}



