package Algorithms;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSearch {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<File> fileArrayList = new ArrayList<>();
        searchFiles(new File("C:\\"), fileArrayList);
        for (File file:fileArrayList){
            System.out.println(file.getAbsolutePath());
        }
    }
    private static void searchFiles(File rootFile, List<File> filesList){
        if (rootFile.isDirectory()){
            System.out.println("searching at: "+rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles!=null){
                for (File file:directoryFiles){
                    if (file.isDirectory()){
                        searchFiles(file, filesList);
                    }else {
                        if (file.getName().toLowerCase().endsWith(".cpp")){
                            filesList.add(file);
                        }
                    }
                }
            }
        }
    }
}
