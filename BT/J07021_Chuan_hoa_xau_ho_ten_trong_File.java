package BT;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07021_Chuan_hoa_xau_ho_ten_trong_File {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DATA.in"));
        while(scanner.hasNextLine()) {
            String tmp = scanner.nextLine();
            if(tmp.equals("END")) {
                break;
            }
            String[] s = tmp.trim().toLowerCase().split("\\s+");
            for(int i = 0; i < s.length; i++) {
                s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
            }
            for(int i = 0; i < s.length; i++) {
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }
}