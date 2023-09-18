package BT;

import java.io.*;
import java.util.*;

public class J08012_Hinh_sao {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        for (int i = 1; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            a[u]++;
            a[v]++;
        }
        boolean check = true;
        for (int i = 1; i <= n; i++) {
            if (a[i] != 1 && a[i] != n - 1) {
                check = false;
                break;
            }
        }
        if(check) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}