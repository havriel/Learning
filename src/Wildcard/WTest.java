package Wildcard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();

        int n = scanner.nextInt();
        for (int i =1;i<=n;i++){
            Animal animal = new Animal(i);
            animalList.add(animal);
        }

        show(animalList);
    }

    private static void show(List<Animal> animals){
        System.out.println(animals);
    }
}
