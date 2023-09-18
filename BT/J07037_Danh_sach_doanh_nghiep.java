package BT;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Company_J07037 implements Comparable<Company_J07037> {
    String code;
    String name;
    int sv;
    public Company_J07037() {
        this.code = null;
        this.name = null;
        this.sv = 0;
    }

    public Company_J07037(String code, String name, int sv) {
        this.code = code;
        this.name = name;
        this.sv = sv;
    }

    @Override
    public int compareTo(Company_J07037 Company_J07037) {
        return this.code.compareTo(Company_J07037.code);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.sv;
    }
}

public class J07037_Danh_sach_doanh_nghiep {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(scanner.nextLine());
        Company_J07037[] a = new Company_J07037[n];
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            int sv = Integer.parseInt(scanner.nextLine());
            a[i] = new Company_J07037(code, name, sv);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}