package BT;

import java.util.*;

class ComplexNumber_J04018 {
    private int real, imaginary;
    public ComplexNumber_J04018() {
        this.real = 0;
        this.imaginary = 0;
    }
    public ComplexNumber_J04018(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber_J04018 add(ComplexNumber_J04018 a) {
        int real = this.real + a.real;
        int imaginary = this.imaginary + a.imaginary;
        return new ComplexNumber_J04018(real, imaginary);
    }
    public ComplexNumber_J04018 multiply(ComplexNumber_J04018 a) {
        int real = this.real * a.real - this.imaginary * a.imaginary;
        int imaginary = this.real * a.imaginary + this.imaginary * a.real;
        return new ComplexNumber_J04018(real, imaginary);
    }
    @Override
    public String toString() {
        if(this.imaginary < 0) {
            return this.real + " - " + Math.abs(this.imaginary) + "i";
        }
        return this.real + " + " + Math.abs(this.imaginary) + "i";
    }
}
public class J04018_So_phuc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int r1 = scanner.nextInt();
            int i1 = scanner.nextInt();
            int r2 = scanner.nextInt();
            int i2 = scanner.nextInt();
            ComplexNumber_J04018 a = new ComplexNumber_J04018(r1, i1);
            ComplexNumber_J04018 b = new ComplexNumber_J04018(r2, i2);
            ComplexNumber_J04018 c = a.add(b).multiply(a);
            ComplexNumber_J04018 d = a.add(b);
            d = d.multiply(d);
            System.out.println(c + ", " + d);
        }
    }
}
