package PracticeOperators;

import java.util.Random;

public class Num6 {
    static Random rand = new Random();
    public static void main(String[] args) {
        int number = rand.nextInt(6);
        System.out.println(number);
        int result = 1;
        for (int i=1;i<=number;i++){
            result=result*i;
            System.out.println(result);
        }
    }
}
