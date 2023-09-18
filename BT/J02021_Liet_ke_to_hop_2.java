package BT;

import java.util.ArrayList;
import java.util.Scanner;

public class J02021_Liet_ke_to_hop_2 {
    public static Scanner scanner = new Scanner(System.in);
    public static int cnt = 0;
    public static int[] a = new int[15];
    static void Try(int i, int n, int k) {
        for (int j = a[i - 1] + 1; j <= n - k + i; j++) {
            a[i] = j;
            if (i == k) {
                cnt++;
                for(int l = 1; l <= k; l++) {
                    System.out.print(a[l]);
                }
                System.out.print(" ");
            }
            else {
                Try(i + 1, n, k);
            }
        }
    }
    public static void main(String[] args) {
        int n = scanner.nextInt(), k = scanner.nextInt();
        Try(1, n, k);
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
