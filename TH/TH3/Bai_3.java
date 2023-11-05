package TH.TH3;

import java.util.*;
import java.io.*;

class Matrix_TH3 {
    private int n, m;
    private int[][] matrix = new int[n][m];

    public Matrix_TH3(int n, int m, int[][] matrix) {
        this.n = n;
        this.m = m;
        this.matrix = matrix;
    }

    public void sortByColumn(int column) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < this.n; i++) {
            for(int j = 0; j < this.m; j++) {
                if(j == column) {
                    a.add(this.matrix[i][j]);
                }
            }
        }
        Collections.sort(a);
        int d = 0;
        for(int i = 0; i < this.n; i++) {
            for(int j = 0; j < this.m; j++) {
                if(j == column) {
                    this.matrix[i][j] = a.get(d++);
                }
            }
        }
    }

    public int[][] getMatrix() {
        return this.matrix;
    }
}

public class Bai_3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("TH/TH3/InputFile/MATRIX.in"));
        int t = Integer.parseInt(scanner.nextLine());
        for (int d = 0; d < t; d++) {
            String[] input1 = scanner.nextLine().trim().split("\\s+");
            int n = Integer.parseInt(input1[0]);
            int m = Integer.parseInt(input1[1]);
            int column = Integer.parseInt(input1[2]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            Matrix_TH3 a = new Matrix_TH3(n, m, matrix);
            a.sortByColumn(column - 1);
            matrix = a.getMatrix();
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            if(d < t - 1) {
                scanner.nextLine();
            }
        }
    }
}
