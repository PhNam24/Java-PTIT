package BT;

import java.util.*;

class Point3D {
    private int x, y, z;
    public Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        Point3D AB = new Point3D(p1.x - p2.x, p1.y - p2.y, p1.z - p2.z);
        Point3D AC = new Point3D(p1.x - p3.x, p1.y - p3.y, p1.z - p3.z);
        Point3D AD = new Point3D(p1.x - p4.x, p1.y - p4.y, p1.z - p4.z);
        Point3D coHuong = new Point3D(AB.y * AC.z - AB.z * AC.y, AB.z * AC.x - AB.x * AC.z, AB.x * AC.y - AB.y * AC.x);
        int voHuong = coHuong.x * AD.x + coHuong.y * AD.y + coHuong.z * AD.z;
        if(voHuong == 0) {
            return true;
        }
        return false;
    }
}

public class J04011_Bon_diem_tren_mat_phang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
