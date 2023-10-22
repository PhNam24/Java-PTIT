package BT;

import java.util.*;

class Company_J05028 implements Comparable<Company_J05028> {
    String code;
    String name;
    int sv;
    public Company_J05028() {
        this.code = null;
        this.name = null;
        this.sv = 0;
    }

    public Company_J05028(String code, String name, int sv) {
        this.code = code;
        this.name = name;
        this.sv = sv;
    }

    @Override
    public int compareTo(Company_J05028 a) {
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
public class J05028_Danh_sach_doanh_nghiep_nhan_sinh_vien_thuc_tap_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Company_J05028> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            int sv = Integer.parseInt(scanner.nextLine());
            a.add(new Company_J05028(code, name, sv));
        }
        Collections.sort(a);
        for(Company_J05028 i: a) {
            System.out.println(i);
        }
    }
}
