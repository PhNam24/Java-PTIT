package BT;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class J03010_Dia_chi_Email {
    public static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> d = new ArrayList<>();
        while(t-- > 0) {
            String[] s = scanner.nextLine().trim().toLowerCase().split("\\s+");
            String name = s[s.length - 1];
            for(int i = 0 ; i < s.length - 1; i++) {
                name += s[i].charAt(0);
            }
            d.add(name);
            int cnt = Collections.frequency(d, name);
            System.out.print(name);
            if(cnt != 1) {
                System.out.print(cnt);
            }
            System.out.println("@ptit.edu.vn");
        }
    }
}
