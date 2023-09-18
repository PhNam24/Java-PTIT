package BT;

import java.util.Scanner;

public class J02103_Tich_ma_tran_voi_chuyen_vi_cua_no {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        int d = 1;
        while(t-- > 0) {
            int n = scanner.nextInt(), m = scanner.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    a[i][j] = scanner.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            int[][] c = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    c[i][j] = 0;
                    for(int k = 0; k < m; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Test " + d++ + ":");
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
