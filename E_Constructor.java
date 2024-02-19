public class Student {
    private int id;
    private String name;
    private int age;
    
    // Default constructor
    public Student() {
        this.id = 0;
        this.name = "Unknown";
        this.age = 0;
    }
    
    // Constructor with parameters
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    // Constructor with partial parameters
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.age = 0; // Age set to 0 for simplicity
    }
    
    // Constructor with age only
    public Student(int age) {
        this.id = 0; // ID set to 0 for simplicity
        this.name = "Unknown"; // Name set to "Unknown" for simplicity
        this.age = age;
    }
    
    // Method to display student details
    public void display() {
        System.out.println("Student ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    
    public static void main(String[] args) {
        // Instantiating objects using different constructors
        Student student1 = new Student(); // Default constructor
        Student student2 = new Student(101, "John Doe", 20); // Constructor with parameters
        Student student3 = new Student(102, "Jane Smith"); // Constructor with partial parameters
        Student student4 = new Student(22); // Constructor with age only
        
        // Displaying student details
        System.out.println("Student 1 details:");
        student1.display();
        System.out.println();
        
        System.out.println("Student 2 details:");
        student2.display();
        System.out.println();
        
        System.out.println("Student 3 details:");
        student3.display();
        System.out.println();
        
        System.out.println("Student 4 details:");
        student4.display();
    }
}
