package BT;

import java.util.ArrayList;
import java.util.Scanner;

public class J02105_Danh_sach_ke {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        ArrayList<Integer>[] ke = new ArrayList[1005];
        for (int i = 0; i < 1005; i++) {
            ke[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
                if(a[i][j] == 1) {
                    ke[i + 1].add(j + 1);
                }
            }
        }
        for(int i = 1; i <= n; i++) {
            System.out.printf("List(%d) = ", i);
            for(int j = 0; j < ke[i].size(); j++) {
                System.out.print(ke[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}
