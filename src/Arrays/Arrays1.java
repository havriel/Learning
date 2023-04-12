package Arrays;


import java.util.Arrays;
import java.util.Random;

public class Arrays1 {
    static Random rand = new Random();
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i=0;i< array.length;i++){
            array[i] = rand.nextInt(100);
        }
        int minValue = array[0];
        System.out.println(Arrays.toString(array));
        for (int i =1;i<array.length;i++){
            if (array[i]<minValue){
                minValue = array[i];
            }
        }
        System.out.println(minValue);

        //Сортировка пузырьком
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
