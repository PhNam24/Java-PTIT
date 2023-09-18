package BT;

import java.util.Scanner;

public class J01014_Uoc_so_nguyen_to_lon_nhat {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0) {
            long n = scanner.nextLong();
            int ans = 1;
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    ans = i;
                    while(n % i == 0) {
                        n /= i;
                    }
                }
            }
            if(n > 1) {
                System.out.println(n);
            }
            else {
                System.out.println(ans);
            }
        }
    }
}
