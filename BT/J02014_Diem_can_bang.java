package BT;

import java.util.Scanner;

public class J02014_Diem_can_bang {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] sum = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if (i == 0) {
                    sum[i] = a[i];
                } else {
                    sum[i] = sum[i - 1] + a[i];
                }
            }
            int idx = -1;
            for(int i = 1; i < n; i++) {
                if(sum[i] - a[i] == sum[n - 1] - sum[i]) {
                    idx = i + 1;
                    break;
                }
            }
            System.out.println(idx);
        }
    }
}
