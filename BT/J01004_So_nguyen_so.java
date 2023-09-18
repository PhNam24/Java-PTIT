package BT;

import java.util.Scanner;

public class J01004_So_nguyen_so {
    public static Scanner scanner = new Scanner(System.in);
    public static int snt(int n) {
        if(n < 2) return 0;
        if(n % 2 == 0) return 0;
        for(int i = 3; i <= Math.sqrt(n); i += 2) {
            if(n % i == 0) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t > 0) {
            int n = scanner.nextInt();
            if(snt(n) == 0) System.out.println("NO");
            else System.out.println("YES");
            t--;
        }

    }
}
