class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}


class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();
        System.out.println("Animals can eat");

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
