package BT;

import java.util.Scanner;

public class J02012_Sap_xep_chen {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int idx = i;
            while(idx > 0 && a[idx] < a[idx - 1]) {
                int tmp = a[idx];
                a[idx] = a[idx - 1];
                a[idx - 1] = tmp;
                idx--;
            }
            System.out.print("Buoc " + i + ": ");
            for(int j = 0; j <= i; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
