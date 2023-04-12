import java.util.Scanner;

public class HasNext {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 1;
        String str = "";
        while (scan.hasNext()){
            str = scan.nextLine();
            System.out.println(n+" "+str);
            n++;
        }
    }
}
