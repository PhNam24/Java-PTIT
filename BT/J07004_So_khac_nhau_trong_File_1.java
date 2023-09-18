package BT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07004_So_khac_nhau_trong_File_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner scanner1 = new Scanner(file);
        int[] d = new int[1005];
        while(scanner1.hasNextLine()) {
            String[] s = scanner1.nextLine().split("\\s+");
            for(int i = 0; i < s.length; i++) {
                d[Integer.valueOf(s[i])]++;
            }
        }
        for(int i = 0; i < 1005; i++) {
            if(d[i] != 0) {
                System.out.println(i + " " + d[i]);
            }
        }
    }
}
