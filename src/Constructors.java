public class Constructors {
    public static void main(String[] args) {
        //Конструкторы нужно использовать для исключения возможности создания пустого объекта
        //Например объект "человек" не может быть создан без имени и возраста
        Man man = new Man("Artyom", 19);
        System.out.println(man.getName()+","+man.getAge());
    }
}
class Man{
    private String name;
    private int age;

    public Man(){
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
