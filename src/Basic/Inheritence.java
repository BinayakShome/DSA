package Basic;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makesound() {
        System.out.println(name + " is making sound");
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makesound();
    }
}