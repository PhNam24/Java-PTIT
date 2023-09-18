package BT;

import java.util.Scanner;

class Point {
    private double x, y;
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner scanner) {
        return new Point(scanner.nextDouble(), scanner.nextDouble());
    }
    public double getDistance(Point p) {
        double x0 = this.x - p.x;
        double y0 = this.y - p.y;
        return Math.sqrt(x0 * x0 + y0 * y0);
    }
}

class Triangle {
    private Point A, B, C;
    public Triangle() {
        this.A = null;
        this.B = null;
        this.C = null;
    }

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public boolean valid() {
        double c = this.A.getDistance(this.B);
        double b = this.A.getDistance(this.C);
        double a = this.B.getDistance(this.C);
        if (Math.max(a, Math.max(b, c)) * 2 >= a + b + c) {
            return false;
        }
        return true;
    }
    public String getPerimeter() {
        double c = this.A.getDistance(this.B);
        double b = this.A.getDistance(this.C);
        double a = this.B.getDistance(this.C);
        return String.format("%.3f", a + b + c);
    }
}
public class J04019_Lop_Triangle_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
