package Polimorphism;

public class Test1 {
    public static void main(String[] args) {

        //Upcasting-Восходящее преобразование(от наследника к родителю)
        Animal dog = new Dog();
        Animal cat = new Cat();

        //Downcasting-нисходящее преобразование
        Dog dog2 = new Dog();
        Animal animal = dog2;
        Dog dog1 = (Dog) animal;
        dog1.bark();
    }
}
