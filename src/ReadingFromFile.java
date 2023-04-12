import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "Admin" + separator + "Desktop" + separator + "Test.txt";
        File file = new File(path);

        Scanner scan = new Scanner(file);
        /*while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }*/

        String line = scan.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;
        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.print(Arrays.toString(numbers));
        scan.close();
    }
}
