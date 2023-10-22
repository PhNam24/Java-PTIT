package BT;

import java.util.*;

class Company_J05029 implements Comparable<Company_J05029> {
    private String code;
    private String name;
    private int sv;
    public Company_J05029() {
        this.code = null;
        this.name = null;
        this.sv = 0;
    }

    public Company_J05029(String code, String name, int sv) {
        this.code = code;
        this.name = name;
        this.sv = sv;
    }

    public int getSv() {
        return this.sv;
    }

    @Override
    public int compareTo(Company_J05029 a) {
        if(this.sv != a.sv) {
            return -(this.sv - a.sv);
        }
        return this.code.compareTo(a.code);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.sv;
    }
}
public class J05029_Danh_sach_doanh_nghiep_nhan_sinh_vien_thuc_tap_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Company_J05029> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            int sv = Integer.parseInt(scanner.nextLine());
            a.add(new Company_J05029(code, name, sv));
        }
        Collections.sort(a);
        int q = scanner.nextInt();
        while(q-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", l, r);
            for(Company_J05029 i: a) {
                if(i.getSv() >= l && i.getSv() <= r) {
                    System.out.println(i);
                }
            }
        }
    }
}
