package BT;
import java.util.Scanner;
import java.math.*;

class Point_J04008 {
    double x, y;

    public Point_J04008(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point_J04008 p) {
        double x0 = this.x - p.x;
        double y0 = this.y - p.y;
        return Math.sqrt(x0 * x0 + y0 * y0);
    }
}

class Triangle_J04008 {
    Point_J04008 A, B, C;

    public Triangle_J04008(Point_J04008 A, Point_J04008 B, Point_J04008 C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public boolean check() {
        double AB = this.A.distance(this.B);
        double AC = this.A.distance(this.C);
        double BC = this.B.distance(this.C);
        if(Math.max(AB, Math.max(AC, BC)) * 2 >= AB + AC +BC) {
            return false;
        }
        return true;
    }

    public Double perimeter() {
        double AB = this.A.distance(this.B);
        double AC = this.A.distance(this.C);
        double BC = this.B.distance(this.C);
        return AB + AC + BC;
    }
}

public class J04008_Chu_vi_tam_giac{

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
            Triangle_J04008 a = new Triangle_J04008(new Point_J04008(x1, y1),new Point_J04008(x2, y2),new Point_J04008(x3, y3));
            if(!a.check()) {
                System.out.println("INVALID");
            }
            else {
                System.out.printf("%.3f\n", a.perimeter());
            }
        }
    }
}