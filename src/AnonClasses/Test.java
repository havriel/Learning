package AnonClasses;

public class Test {
    public static void main(String[] args) {
        //1
        Animal animal=new Animal();
        animal.eat();

        Animal animal1 = new Animal(){
            public void eat(){
                System.out.println("Other animal is eating");
            }
        };
        animal1.eat();
        /*Создается анонимный класс который наследуется от Animal и переопределяет метод eat*/

        //2
        AbleToEat ableToEat = new Animal();
        ableToEat.eat();

        //3
        AbleToEat ableToEat1 = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Other animals are eating");
            }
        };
        ableToEat1.eat();
    }
}

interface AbleToEat{
    public void eat();
}

class Animal implements AbleToEat{
    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }
}
