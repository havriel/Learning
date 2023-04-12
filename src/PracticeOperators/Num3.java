package PracticeOperators;

import java.util.Scanner;

public class Num3 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int day = scan.nextInt();
        switch (day){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Выходной");
                break;
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Число должно быть от 1 до 7!");
                break;
        }
    }
}
