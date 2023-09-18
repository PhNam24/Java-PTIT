package BT;

import java.util.Arrays;
import java.util.Scanner;

class Rectangle {
    int height, width;
    String color;
    Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    boolean check() {
        if(this.height <= 0 || this.width <= 0) {
            return false;
        }
        return true;
    }

    int findPerimeter() {
        return (this.height + this.width) * 2;
    }

    int findArea() {
        return this.height * this.width;
    }

    public String getColor() {
        return this.color;
    }
}
public class J04002_Khai_bao_lop_hinh_chu_nhat {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        char[] s = scanner.nextLine().toLowerCase().trim().toCharArray();
        s[0] = Character.toUpperCase(s[0]);
        String tmp = "";
        for(int i = 0; i < s.length; i++) {
            tmp += s[i];
        }
        Rectangle hcn = new Rectangle(h, w, tmp);
        if(!hcn.check()) {
            System.out.println("INVALID");
        }
        else {
            System.out.println(hcn.findPerimeter() + " " + hcn.findArea() + " " + hcn.getColor());
        }
    }
}