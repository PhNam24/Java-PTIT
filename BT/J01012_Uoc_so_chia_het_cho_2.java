package BT;

import java.util.Scanner;

public class J01012_Uoc_so_chia_het_cho_2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            if(n % 2 == 1) {
                System.out.println(0);
            }
            else {
                int cnt = 1;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        if(i % 2 == 0) {
                            cnt++;
                        }
                        if((n / i) % 2 == 0 && (n / i) != Math.sqrt(n)) {
                            cnt++;
                        }
                    }
                }
                System.out.println(cnt);
            }
        }
    }
}
