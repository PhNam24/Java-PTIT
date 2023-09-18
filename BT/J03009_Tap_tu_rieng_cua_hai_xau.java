package BT;

import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class J03009_Tap_tu_rieng_cua_hai_xau {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            String[] s1 = scanner.nextLine().split("\\s+");
            String[] s2 = scanner.nextLine().split("\\s+");
            LinkedHashSet<String> hashSet1 = new LinkedHashSet<>(Arrays.asList(s1));
            LinkedHashSet<String> hashSet2 = new LinkedHashSet<>(Arrays.asList(s2));
            s1 = hashSet1.toArray(new String[0]);
            s2 = hashSet2.toArray(new String[0]);
            Arrays.sort(s1);
            Arrays.sort(s2);
            for(int i = 0; i < s1.length; i++) {
                if(!Arrays.asList(s2).contains(s1[i])) {
                    System.out.print(s1[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
