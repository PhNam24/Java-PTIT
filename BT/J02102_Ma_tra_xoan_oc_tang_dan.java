package BT;

import java.util.*;
public class J02102_Ma_tra_xoan_oc_tang_dan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n * n];
        for(int i = 0; i < n * n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int idx = 0;
        int[][] ans = new int[n][n];
        int h1 = n, c1 = n, h2 = 0, c2 = 0;
        while( idx < n * n )
        {
            for ( int i = c2; i < c1; i++ )
            {
                ans[h2][i] = a[idx++];
            }
            for ( int i = h2 + 1; i < h1; i++ )
            {
                ans[i][c1 - 1] = a[idx++];
            }
            for ( int i = c1 - 2; i >= c2; i-- )
            {
                ans[h1 - 1][i] = a[idx++];
            }
            for ( int i = h1 - 2; i > h2; i-- )
            {
                ans[i][c2] = a[idx++];
            }
            h1--;
            c1--;
            h2++;
            c2++;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
