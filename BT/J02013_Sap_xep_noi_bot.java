package BT;

import java.util.Scanner;

public class J02013_Sap_xep_noi_bot {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        int d = 0;
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i = 0; i < n - 1; i++) {
            int check = 0;
            for(int j = 0 ; j < n - i - 1; j++) {
                if(a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    check = 1;
                }
            }
            if(check == 0) {
                break;
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
