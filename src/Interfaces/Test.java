package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Artyom");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();
    }
}
