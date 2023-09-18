package BT;

import java.util.Scanner;

public class J02034_Bo_sung_day_so {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] d = new int[205];
        int r = (int)-1e9;
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            d[a[i]]++;
            r = Math.max(r, a[i]);
        }
        int check = 0;
        for(int i = 1; i <= r; i++) {
            if(d[i] == 0) {
                check = 1;
                System.out.println(i);
            }
        }
        if(check == 0) {
            System.out.println("Excellent!");
        }
    }
}
