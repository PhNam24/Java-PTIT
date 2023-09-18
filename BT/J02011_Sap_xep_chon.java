package BT;

import java.util.Scanner;

public class J02011_Sap_xep_chon {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i = 0; i < n - 1; i++) {
            int idx = i;
            for(int j = i + 1; j < n; j++) {
                if(a[idx] > a[j]) {
                    idx = j;
                }
            }
            int tmp = a[i];
            a[i] = a[idx];
            a[idx] = tmp;
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
