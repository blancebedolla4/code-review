package review;

public class Animal {
    // Parent class

        String sound;
        Animal(String snd) {
            this.sound = snd;
        }
    }

    // Child class
    class Dog extends Animal {
        // super() method can act like the parent constructor inside the child class constructor.
        Dog() {
            super("woof");
        }
        // alternatively, we can override the constructor completely by defining a new constructor.
        Dog() {
            this.sound = "woof";
        }


    }
// Parent class
class Animal {
    public void greeting() {
        System.out.println("The animal greets you.");
    }
}

// Child class
class Cat extends Animal {
    public void greeting() {
        System.out.println("The cat meows.");
    }
}

class MainClass {
    public static void main(String[] args) {
        Animal animal1 = new Animal();  // Animal object
        Animal cat1 = new Cat();  // Cat object
        animal1.greeting(); // prints "The animal greets you."
        cat1.greeting(); // prints "The cat meows."
    }
}
}
