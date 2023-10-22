package BT;

import java.util.*;

class Club_J05070 {
    private String code, name;
    private long price;
    public Club_J05070(String code, String name, long price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    public String getCode() {
        return this.code;
    }
    public String getName() {
        return this.name;
    }
    public long getPrice() {
        return this.price;
    }
}

class Match_J05070 implements Comparable<Match_J05070> {

    private String code, name;
    private long price;
    private long soLuong, thanhTien;
    public Match_J05070(String code, String name, long price, long soLuong) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.soLuong = soLuong;
        this.thanhTien = this.soLuong * this.price;
    }
    @Override
    public int compareTo(Match_J05070 a) {
        if(this.thanhTien != a.thanhTien) {
            if(this.thanhTien > a.thanhTien) {
                return -1;
            }
            else {
                return 1;
            }
        }
        return this.name.compareTo(a.name);
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.thanhTien;
    }
}
public class J05070_Cau_lac_bo_bong_da_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Club_J05070> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            long price = Long.parseLong(scanner.nextLine());
            a.add(new Club_J05070(code, name, price));
        }
        int q = Integer.parseInt(scanner.nextLine());
        ArrayList<Match_J05070> b = new ArrayList<>();
        while(q-- > 0) {
            String query = scanner.next();
            long soLuong = scanner.nextLong();
            for(Club_J05070 i: a) {
                if(query.substring(1, 3).equals(i.getCode())) {
                    b.add(new Match_J05070(query, i.getName(), i.getPrice(), soLuong));
                    break;
                }
            }
        }
        Collections.sort(b);
        for(Match_J05070 i: b) {
            System.out.println(i);
        }
    }
}
