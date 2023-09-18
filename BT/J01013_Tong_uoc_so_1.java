package BT;

import java.util.Arrays;
import java.util.Scanner;

public class J01013_Tong_uoc_so_1 {
    public static Scanner scanner = new Scanner(System.in);
    static int calc(int[]snt, int n) {
        int sum = 0;
        while(n > 1) {
            sum += snt[n];
            n /= snt[n];
        }
        return sum;
    }
    public static void main(String[] args) {
        int t = scanner.nextInt();
        int[] snt = new int[2000005];
        Arrays.fill(snt, 1);
        snt[0] = 0;
        snt[1] = 0;
        for(int i = 2; i <= 1420; i++) {
            if(snt[i] == 1) {
                for(int j = i * i; j < snt.length; j += i) {
                    if (snt[j] == 1) {
                        snt[j] = i;
                    }
                }
            }
        }
        for(int i = 2; i < snt.length; i++) {
            if(snt[i] == 1) {
                snt[i] = i;
            }
        }
        long ans = 0;
        while(t-- > 0) {
            ans += calc(snt, scanner.nextInt());
        }
        System.out.println(ans);
    }
}
