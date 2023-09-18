package BT;

import java.util.Scanner;

public class J01002_Tinh_tong_N_so_nguyen_duong_dau_tien{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t > 0){
            long n = scanner.nextLong();
            System.out.println((n * (n + 1)) / 2);
            t--;
        }
    }
}

