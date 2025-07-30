// Opps.java
// Complete demonstration of OOPs concepts in Java with proper commenting

// ------------------ 1. Access Modifiers ------------------
class AccessModifiers {
    public int publicVar = 1;       // Accessible everywhere
    private int privateVar = 2;     // Accessible only within this class
    protected int protectedVar = 3; // Accessible within package & subclasses
    int defaultVar = 4;             // Accessible within the package

    public void display() {
        System.out.println("Access Modifiers:");
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println();
    }
}

// ------------------ 2 & 3. Encapsulation + Getters/Setters ------------------
class Student {
    private String name;  // private data member
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Display student data
    public void display() {
        System.out.println("Encapsulation + Getters/Setters:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

// ------------------ 4. Constructors & Overloading ------------------
class Car {
    String model;
    int price;

    // Default constructor
    Car() {
        model = "Default";
        price = 0;
    }

    // Parameterized constructor
    Car(String model) {
        this.model = model;
        this.price = 50000;
    }

    // Constructor Overloading
    Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public void show() {
        System.out.println("Model: " + model + ", Price: " + price);
    }

    // Static method to demonstrate constructor usage
    public static void displayConstructors() {
        System.out.println("Constructors + Overloading:");
        Car c1 = new Car();
        Car c2 = new Car("Honda");
        Car c3 = new Car("BMW", 800000);
        c1.show(); c2.show(); c3.show();
        System.out.println();
    }
}

// ------------------ 5. Copy Constructor - Shallow Copy ------------------
class ShallowCopy {
    int[] data;

    // Constructor
    ShallowCopy(int[] data) {
        this.data = data;
    }

    // Shallow copy constructor
    ShallowCopy(ShallowCopy original) {
        this.data = original.data; // references same array
    }

    public void display() {
        System.out.println("Shallow Copy: " + java.util.Arrays.toString(data));
    }

    public static void run() {
        System.out.println("Shallow Copy Constructor:");
        int[] arr = {1, 2, 3};
        ShallowCopy obj1 = new ShallowCopy(arr);
        ShallowCopy obj2 = new ShallowCopy(obj1);
        arr[0] = 99; // modifies both
        obj1.display();
        obj2.display();
        System.out.println();
    }
}

// ------------------ 6. Copy Constructor - Deep Copy ------------------
class DeepCopy {
    int[] data;

    // Constructor with clone
    DeepCopy(int[] data) {
        this.data = data.clone(); // creates new copy
    }

    // Deep copy constructor
    DeepCopy(DeepCopy original) {
        this.data = original.data.clone();
    }

    public void display() {
        System.out.println("Deep Copy: " + java.util.Arrays.toString(data));
    }

    public static void run() {
        System.out.println("Deep Copy Constructor:");
        int[] arr = {1, 2, 3};
        DeepCopy obj1 = new DeepCopy(arr);
        DeepCopy obj2 = new DeepCopy(obj1);
        arr[0] = 99; // doesn't affect cloned arrays
        obj1.display();
        obj2.display();
        System.out.println();
    }
}

// ------------------ 7. Destructor (finalize method) ------------------
class DestructorDemo {
    // finalize() runs before garbage collection (not reliable anymore)
    protected void finalize() throws Throwable {
        System.out.println("Destructor (finalize) called");
    }

    public static void run() {
        System.out.println("Destructor (finalize) Demo:");
        DestructorDemo obj = new DestructorDemo();
        obj = null; // eligible for GC
        System.gc(); // request garbage collection
        try { Thread.sleep(1000); } catch (Exception e) {}
        System.out.println();
    }
}

// ------------------ 8. Single Inheritance ------------------
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }

    public static void run() {
        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.sound();
        d.bark();
        System.out.println();
    }
}

// ------------------ 9. Multilevel Inheritance ------------------
class Grandfather {
    void property() {
        System.out.println("Grandfather's Property");
    }
}

class Father extends Grandfather {
    void car() {
        System.out.println("Father's Car");
    }
}

class Son extends Father {
    void bike() {
        System.out.println("Son's Bike");
    }

    public static void run() {
        System.out.println("Multilevel Inheritance:");
        Son s = new Son();
        s.property();
        s.car();
        s.bike();
        System.out.println();
    }
}

// ------------------ 10. Hierarchical Inheritance ------------------
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void wheels() {
        System.out.println("Bike has 2 wheels");
    }
}

class Car2 extends Vehicle {
    void wheels() {
        System.out.println("Car has 4 wheels");
    }

    public static void run() {
        System.out.println("Hierarchical Inheritance:");
        Bike b = new Bike();
        Car2 c = new Car2();
        b.run(); b.wheels();
        c.run(); c.wheels();
        System.out.println();
    }
}

// ------------------ 11. Hybrid Inheritance (via Interface) ------------------
interface A {
    void showA();
}

interface B {
    void showB();
}

class Hybrid implements A, B {
    public void showA() {
        System.out.println("Interface A method");
    }

    public void showB() {
        System.out.println("Interface B method");
    }

    public static void run() {
        System.out.println("Hybrid Inheritance (via Interface):");
        Hybrid h = new Hybrid();
        h.showA();
        h.showB();
        System.out.println();
    }
}

// ------------------ MAIN CLASS ------------------
public class Opps {
    public static void main(String[] args) {
        // 1. Access Modifiers
        AccessModifiers am = new AccessModifiers();
        am.display();

        // 2 & 3. Encapsulation + Getters/Setters
        Student s = new Student();
        s.setName("Bhavesh");
        s.setAge(20);
        s.display();

        // 4. Constructors
        Car.displayConstructors();

        // 5. Copy Constructor - Shallow
        ShallowCopy.run();

        // 6. Copy Constructor - Deep
        DeepCopy.run();

        // 7. Destructor
        DestructorDemo.run();

        // 8. Single Inheritance
        Dog.run();

        // 9. Multilevel Inheritance
        Son.run();

        // 10. Hierarchical Inheritance
        Car2.run();

        // 11. Hybrid Inheritance
        Hybrid.run();
    }
}
