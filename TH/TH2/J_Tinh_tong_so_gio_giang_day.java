package TH.TH2;

import java.util.*;
import java.io.*;

class GiangVien_J {
    private String ma, ten;
    private double gio;

    public GiangVien_J(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        this.gio = 0;
    }

    public void setGio(double gio) {
        this.gio = gio;
    }

    public String getMa() {
        return this.ma;
    }

    public double getGio() {
        return this.gio;
    }

    @Override
    public String toString() {
        return this.ten + " " + String.format("%.2f", this.gio);
    }
}
public class J_Tinh_tong_so_gio_giang_day {
    public static void main(String[] args) throws IOException {
        Scanner scanner1 = new Scanner(new File("MONHOC.in"));
        while(scanner1.hasNextLine()) {
            scanner1.nextLine();
        }

        Scanner scanner2 = new Scanner((new File("GIANGVIEN.in")));
        ArrayList<GiangVien_J> a = new ArrayList<>();
        int n = Integer.parseInt(scanner2.nextLine());
        for(int i = 0; i < n; i++) {
            String[] input = scanner2.nextLine().split("\\s+");
            String ma = input[0];
            String ten = "";
            for(int j = 1; j < input.length; j++) {
                ten += input[j];
                if(j < input.length - 1) {
                    ten += " ";
                }
            }
            a.add(new GiangVien_J(ma, ten));
        }

        Scanner scanner3 = new Scanner(new File("GIOCHUAN.in"));
        n = Integer.parseInt(scanner3.nextLine());
        for(int i = 0; i < n; i++) {
            String[] input = scanner3.nextLine().split("\\s+");
            String ma = input[0];
            double gio = Double.parseDouble(input[2]);
            for(GiangVien_J j: a) {
                if(j.getMa().equals(ma)) {
                    j.setGio(j.getGio() + gio);
                }
            }
        }
        for(GiangVien_J i: a) {
            System.out.println(i);
        }
    }
}
