package BT;

import java.util.Scanner;
public class J01008_Phan_tich_thua_so_nguyen_to {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        int d = 1;
        while(t-- > 0) {
            int n = scanner.nextInt();
            System.out.print("Test " + d++ + ": ");
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    int cnt = 0;
                    while (n % i == 0) {
                        n /= i;
                        cnt++;
                    }
                    System.out.print(i + "(" + cnt + ") ");
                }
            }
            if(n > 1) {
                System.out.print(n + "(1)");
            }
            System.out.println();
        }
    }
}
