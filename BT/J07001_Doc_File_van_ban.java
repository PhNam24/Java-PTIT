package BT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001_Doc_File_van_ban {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner scanner1 = new Scanner(file);
        String s = null;
        while(scanner1.hasNextLine()) {
            s = scanner1.nextLine();
            System.out.println(s);
        }
    }
}
