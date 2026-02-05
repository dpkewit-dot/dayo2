// A compact, clear Java example demonstrating classes and objects
// No public class is declared so the file name doesn't need to match a class name.

class Person {
    private String name;
    private int age;
    static String species = "Homo sapiens"; // shared by all Person instances

    // Constructors
    public Person() {
        this("Unknown", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters / setters (encapsulation)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // Behavior
    public void introduce() {
        System.out.printf("Hi, I'm %s and I'm %d years old.%n", name, age);
    }

    public static void describeSpecies() {
        System.out.println("Species: " + species);
    }

    @Override
    public String toString() {
        return String.format("Person{name='%s', age=%d}", name, age);
    }
}

class Student extends Person {
    private String studentId;

    public Student() {
        super();
        this.studentId = "N/A";
    }

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    @Override
    public void introduce() {
        System.out.printf("Hi, I'm %s, %d years old, student id %s.%n", getName(), getAge(), studentId);
    }

    public void study() {
        System.out.println(getName() + " is studying.");
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', age=%d, id='%s'}", getName(), getAge(), studentId);
    }
}

// Runner class containing main. Not declared public so filename may differ.
class ClassObjectExample {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person();
        Student s1 = new Student("Bob", 20, "S123");
        Person p3 = new Student("Charlie", 22, "S456"); // polymorphism: Student referenced as Person

        // Static/shared data
        Person.describeSpecies();
        System.out.println();

        // Calls to instance methods
        p1.introduce();
        p2.introduce();
        s1.introduce();

        // Downcast to access Student-specific behavior
        ((Student) p3).study();

        System.out.println();
        System.out.println("Objects via toString:");
        System.out.println(p1);
        System.out.println(s1);
        System.out.println(p3);

        System.out.println();
        // Array demonstrating polymorphic behavior
        Person[] people = { p1, s1, p3 };
        System.out.println("Looping over people array (polymorphism):");
        for (Person p : people) {
            p.introduce();
        }

        // Mutating an object's state through setters
        p2.setName("Daisy");
        p2.setAge(28);
        System.out.println();
        System.out.println("After updating p2:");
        p2.introduce();
    }
}