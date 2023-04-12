package PracticeOperators;

import java.util.Scanner;

public class Num1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String inputStr = scan.nextLine();
        int input = Integer.parseInt(inputStr);
        if(input%2!=0){
            System.out.println(input);
        }else {
            System.out.println("Число четное");
        }
    }
}
