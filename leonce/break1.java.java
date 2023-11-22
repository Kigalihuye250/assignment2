
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Grandchild class inheriting from Dog
class Labrador extends Dog {
    void display() {
        System.out.println("Labrador is a type of dog");
    }
}

public class Main {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat(); // Inherited from Animal
        labrador.bark(); // Inherited from Dog
        labrador.display(); // Specific to Labrador
    }
}