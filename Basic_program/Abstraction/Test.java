package Abstraction;

public class Test {
    public static void main(String[] args) {
       Dog dog = new Dog();
        dog.color ="Black";
        System.out.println(dog.color);
        dog.sayHello();
        dog.sleep();
        Animal.sayHello();


        // Dog.color  = "Tony Gray";
        // System.out.println(Dog.color);

    }
}
