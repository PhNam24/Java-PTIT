package BT;

import java.util.Scanner;

class Point_J04001 {
    double x, y;
    public Point_J04001(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point_J04001 p) {
        double x0 = this.x - p.x;
        double y0 = this.y - p.y;
        return Math.sqrt(x0 * x0 + y0 * y0);
    }
}

public class J04001_Khai_bao_lop_Point {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-- > 0) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            Point_J04001 a = new Point_J04001(x1, y1);
            Point_J04001 b = new Point_J04001(x2, y2);
            System.out.printf("%.4f\n", a.distance(b));
        }
    }
}
