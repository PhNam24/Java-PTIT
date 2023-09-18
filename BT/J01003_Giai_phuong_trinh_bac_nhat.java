package BT;

import java.util.Scanner;

public class J01003_Giai_phuong_trinh_bac_nhat {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = scanner.nextInt(); 
        if(a == 0) {
            if(b == 0) System.out.println("VSN");
            else System.out.println("VN");
        }
        else {
            System.out.format("%.2f", (double)-b / a);
        }
    }
}
