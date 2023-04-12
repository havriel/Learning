package PracticeOperators;

import java.util.Scanner;

public class Num2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int input = scan.nextInt();
        if (input>=0&&input<=10){
            System.out.println("Положительное число меньше 10 или ноль");
        }else{
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }
}
