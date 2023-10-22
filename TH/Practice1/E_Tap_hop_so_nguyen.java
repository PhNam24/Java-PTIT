package TH.Practice1;

import java.util.*;

public class E_Tap_hop_so_nguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new TreeSet<>();
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            s1.add(a[i]);
        }
        for(int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
            s2.add(b[i]);
        }
        for(Integer i: s1) {
            if(s2.contains(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(Integer i: s1) {
            if(!s2.contains(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(Integer i: s2) {
            if(!s1.contains(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
