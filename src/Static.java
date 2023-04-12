public class Static {
    public static void main(String[] args) {
        //static - переменные и методы класса
        //Вызывается от имени класса и будет общей для всех элементов класса
        //Статическая переменная создается один раз(не статическая-отдельно для каждого объекта)
        /*Статические методы и переменные будут существовать при запуске программы, даже если не создано ни одного объекта
        Автоматически присваивается значение null
        Статические методы используются в случае когда не нужно создавать объект класса. Например Math
        */
        Man1 one = new Man1("Artyom",19);
        Man1 two = new Man1("Igor",13);
        Man1 three = new Man1("Igor",13);
        Man1.getAll();
        /*
        Man1.description = "Nice";
        one.getAll();
        two.getAll();
        Man1.description = "Bad";
        one.getAll();
        two.getAll();
        */

    }
}

class Man1 {
    private String name;
    private int age;
    public static String description;
    private static int counter;

    public Man1(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getAll(){
        System.out.println("Num of humans="+counter);
    }
}
