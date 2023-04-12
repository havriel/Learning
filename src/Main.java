import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //1 Проверка условий

        /*int num1 = 1357;
        int num2 = 2468;
        String result;
        result = (num1 % 2 == 0) ? "Четное" : "Нечетное";
        System.out.println(num1 + "-" + result);
        result = (num2 % 2 == 0) ? "Четное" : "Нечетное";
        System.out.println(num2 + "-" + result);*/

        //2 Управляющие литералы

        /*
        \n Перевод строки
        \t Табуляция
        \b Шаг назад (забой)
        \r Возврат каретки
        \f Перевод страницы
        \\ Обратный слеш
        \' Одиночная кавычка (апостроф)
        \" Двойная кавычка

        String header = "\n\tНЬЮ-ЙОРК ПРОГНОЗ НА 3 ДНЯ:\n" ;
        header += "\n\tДень\t\tМакс\tМин\tОсадки\n" ;
        header += "\t---\t\t----\t---\t----------\n" ;
        String forecast = "\tВоскресенье\t68F\t48F\tЯсно\n" ;
        forecast += "\tПонедельник\t69F\t57F\tЯсно\n" ;
        forecast += "\tВторник\t\t71F\t50F\tОблачность\n" ;
        System.out.print( header + forecast ) ;*/

        //3 Работа с битами

        /*
        & И a & b 1, если оба бита 1
        | ИЛИ a | b 1, если хотя бы один бит 1
        ^ Исключающее ИЛИ a ^ b 1, если биты отличаются
        ~ НЕ (отрицание) ~a Изменяет значение бита на противоположное
        << Сдвиг влево n << p Сдвигает биты значения n на p позиций влево
        >> Сдвиг вправо n >> p Сдвигает биты значения n на p позиций вправо
        int fs = 53 ; // Двоичное представление 00110101
        System.out.println("Флаг 1: "+(( (fs&1)>0) ? "ВКЛ" : "выкл"));
        System.out.println("Флаг 2: "+(( (fs&2)>0) ? "ВКЛ" : "выкл"));
        System.out.println("Флаг 3: "+(( (fs&4)>0) ? "ВКЛ" : "выкл"));
        System.out.println("Флаг 4: "+(( (fs&8)>0) ? "ВКЛ" : "выкл"));
        System.out.println("Флаг 5: "+(( (fs&16)>0)? "ВКЛ" : "выкл"));
        System.out.println("Флаг 6: "+(( (fs&32)>0)? "ВКЛ" : "выкл"));
        System.out.println("Флаг 7: "+(( (fs&64)>0)? "ВКЛ" : "выкл"));
        System.out.println("Флаг 8: "+(( (fs&128)>0)?"ВКЛ": "выкл"));
        */

        //4
        /*
        //Нахождение максимального, минимального и среднего в массиве
        Random random = new Random();
        int n = 100;
        int[] array = new int[n];
        int max,min, avg;
        for (int i = 0;i<array.length;i++){
            array[i] = random.nextInt(0,100);
            System.out.print(array[i]+" ");
        }
        max = array[0];
        min = array[0];
        avg = 0;
        for (int j = 0;j<array.length;j++){
            if (max<=array[j]){
                max=array[j];
            }
            if (min>=array[j]){
                min = array[j];
            }
            avg+=array[j];
        }
        avg=avg/array.length;
        System.out.println("\nmax="+max+"\n"+"min="+min+"\n"+"avg="+avg);

        //Сортировка пузырьком
        for (int i=0;i<array.length-1;i++){
            if (array[i]>array[i+1]){
                array[i+1] = array[i];
            }
            System.out.print(array[i]+" ");
        }
        */

        //5
        /*
        for (int i=2;i<=100;i++){
            boolean isPrime = true;
            for (int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }
        }
        */

        //6
    }
}