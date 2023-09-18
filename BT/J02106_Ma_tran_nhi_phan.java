package BT;

import java.util.Scanner;

public class J02106_Ma_tran_nhi_phan {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[][] a = new int[n][3];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < n; i++) {
            int d = 0;
            for(int j = 0; j < 3; j++) {
                if(a[i][j] == 1) {
                    d++;
                }
                else {
                    d--;
                }
            }
            if(d > 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
