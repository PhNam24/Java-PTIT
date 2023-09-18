package BT;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class J02022_So_xa_cach {
    public static int n;
    public static int[] mark = new int[15];
    public static int[] a = new int[15];
    static int check() {
        for(int i = 1; i < n; i++) {
            if(Math.abs(a[i] - a[i + 1]) == 1) {
                return 0;
            }
        }
        return 1;
    }
    static void in() {
        for(int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    static void Try(int i) {
        for(int j = 1; j <= n; j++) {
            if(mark[j] == 0) {
                mark[j] = 1;
                a[i] = j;
                if(i == n) {
                    if(check() == 1) {
                        in();
                    }
                }
                else {
                    Try(i + 1);
                }
                mark[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            Arrays.fill(mark, 0);
            Arrays.fill(a, 0);
            n = scanner.nextInt();
            Try(1);
        }
    }
}
