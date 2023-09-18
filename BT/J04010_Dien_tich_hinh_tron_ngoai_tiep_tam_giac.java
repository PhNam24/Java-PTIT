package BT;

import java.util.*;

class Point_J04010 {
    private double x, y;
    public Point_J04010() {
        this.x = 0;
        this.y = 0;
    }
    public Point_J04010(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point_J04010 p) {
        double x0 = this.x - p.x;
        double y0 = this.y - p.y;
        return Math.sqrt(x0 * x0 + y0 * y0);
    }
}

class Triangle_J04010 {
    private Point_J04010 A, B, C;
    public Triangle_J04010() {
        this.A = null;
        this.B = null;
        this.C = null;
    }

    public Triangle_J04010(Point_J04010 A, Point_J04010 B, Point_J04010 C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public String circleArea() {
        double c = this.A.distance(this.B);
        double b = this.A.distance(this.C);
        double a = this.B.distance(this.C);
        if (Math.max(a, Math.max(b, c)) * 2 >= a + b + c) {
            return "INVALID";
        }
        double r = (a * b * c) / (Math.sqrt((a + b + c) * (a + b - c) * (-a + b + c) * (a - b + c)));
        return String.format("%.3f",Math.PI * r * r);
    }
}
public class J04010_Dien_tich_hinh_tron_ngoai_tiep_tam_giac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();
            Triangle_J04010 triangle = new Triangle_J04010(new Point_J04010(x1, y1), new Point_J04010(x2, y2), new Point_J04010(x3, y3));
            System.out.println(triangle.circleArea());
        }
    }
}
