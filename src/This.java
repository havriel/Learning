public class This {
    public static void main(String[] args) {
        //this используется для указания на переменную класса, а не метода
        /*Как правило, применять this нужно в двух случаях:
        Когда у переменной экземпляра класса и переменной метода/конструктора одинаковые имена;
        Когда нужно вызвать конструктор одного типа (например, конструктор по умолчанию или параметризированный) из другого.
        Это еще называется явным вызовом конструктора.
         */
    }
}
class Human{
    private String name;
    private int age;

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
