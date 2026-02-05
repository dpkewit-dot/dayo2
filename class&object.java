class Student {

    // Variables (properties)
    int id;
    String name;

    // Method (behavior)
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student();
        Student s2 = new Student();

        // Assigning values
        s1.id = 101;
        s1.name = "Amit";

        s2.id = 102;
        s2.name = "Neha";

        // Calling methods using objects    
        s1.display();
        System.out.println();
        s2.display();
    }
}

