public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Artyom");
        person.setAge(19);
        if (person.getName()!=null&&person.getAge()>0) {
            person.Talk();
            int year = person.CalculateDateOfBirth();
            System.out.println("My year of birth is " + year);
        }else {
            System.out.println("Please check your data!");
        }
    }
}
class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Please set your name!");
        }else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            System.out.println("Your age must be positive!");
        }else {
            this.age = age;
        }
    }

    void Talk(){
        System.out.println("Hello!My name is "+name+" i`m "+age);
    }

    int CalculateDateOfBirth(){
        int year = 2023-age;
        return year;
    }
}
