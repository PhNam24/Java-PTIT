package BT;

import java.util.Scanner;

public class J02007_Dem_so_lan_xuat_hien {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        int d = 1;
        while(t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] cnt = new int[100005];
            for(int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
            }
            for(int i : a) {
                cnt[i]++;
            }
            System.out.println("Test " + d++ + ":");
            for(int i : a) {
                if(cnt[i] != 0) {
                    System.out.println(i + " xuat hien " + cnt[i] + " lan ");
                    cnt[i] = 0;
                }
            }
        }
    }
}
