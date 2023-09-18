package BT;

import java.util.Scanner;
public class J01001_Hinh_chu_nhat{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int a = scanner.nextInt();
        int b = scanner.nextInt(); 
        if(a <= 0 || b <= 0){
            System.out.println(0);
        }
        else{
            System.out.println((a + b) * 2 + " " + a * b);
        }
    }
}