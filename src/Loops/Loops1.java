package Loops;

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a,b,n;
        int q = scan.nextInt();
        for (int i=0;i<q;i++){
            a = scan.nextInt();
            b = scan.nextInt();
            n = scan.nextInt();
            int result=a;
            int k = 1;
            for(int j=1;j<=n;j++){
                result+=(k*b);
                k=k*2;
                System.out.print(result+" ");
            }
            System.out.println("");
        }
    }
}
