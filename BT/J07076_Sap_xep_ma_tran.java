package BT;
import java.util.*;
import java.io.*;
public class J07076_Sap_xep_ma_tran {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int column = scanner.nextInt();
            int[][] a = new int[n][m];
            ArrayList<Integer> b = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    a[i][j] = scanner.nextInt();
                    if(j == column - 1) {
                        b.add(a[i][j]);
                    }
                }
            }
            Collections.sort(b);
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(j == column - 1) {
                        System.out.print(b.get(i) + " ");
                    }
                    else {
                        System.out.print(a[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
