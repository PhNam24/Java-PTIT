package BT;

import java.util.Scanner;

public class J01005_Chia_tam_giac {
    public static Scanner scanner = new Scanner(System.in);
     public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t > 0) {
            double n = scanner.nextDouble();
            double h = scanner.nextDouble();
            for(int i = 1; i < n; i++) {
                double ans = Math.sqrt(i / n) * h;
                System.out.format("%.6f ", ans);
            }
            System.out.println();
            t--;
        }
    }
}
