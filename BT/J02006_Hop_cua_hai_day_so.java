package BT;

import java.util.Arrays;
import java.util.Scanner;

public class J02006_Hop_cua_hai_day_so {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] d = new int[1005];
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] a = new int[n], b = new int[m];
        int Max = (int)-1e9;
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            d[a[i]] = 1;
            Max = Math.max(Max, a[i]);
        }
        for(int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
            d[b[i]] = 1;
            Max = Math.max(Max, b[i]);
        }
        Arrays.sort(b);
        for(int i = 0; i <= Max; i++) {
            if(d[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
