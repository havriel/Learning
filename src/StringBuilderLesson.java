public class StringBuilderLesson {
    public static void main(String[] args) {
        /*
        Все методы класса String возвращают новую строку, а не меняют старую
         */

        /*
        String x = "hello"; //Удалится из ОЗУ сборщиком мусора т.к. не исползуется
        //x.toUpperCase(); -Результат игнорируется
        x=x.toUpperCase();
        System.out.println(x);
        */

        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1+string2+string3; //При сложении string1 и string2 создается новая строка а string1 и string2 удаляются
        System.out.println(stringAll);
    }
}
