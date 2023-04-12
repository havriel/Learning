package PracticeOperators;

public class Num5 {
    public static void main(String[] args) {
        int n = 0;
        do {
            if (n % 5 == 0) {
                System.out.print(n + ",");
            }
            n++;
        } while (n <= 100);
    }
}
