package BT;

import java.util.*;

class Customer_J05050 {
    private String code, type;
    private long cu, moi, heSo, thanhTien, phuTroi, tong;

    public Customer_J05050(int stt, String type, long cu, long moi) {
        this.code = "KH";
        if(stt < 10) {
            this.code += "0" + stt;
        }
        else {
            this.code += stt;
        }
        this.type = type;
        this.cu = cu;
        this.moi = moi;
        if(this.type.equals("KD")) {
            this.heSo = 3;
        }
        else if(this.type.equals("NN")) {
            this.heSo = 5;
        }
        else if(this.type.equals("TT")) {
            this.heSo = 4;
        }
        else if(this.type.equals("CN")) {
            this.heSo = 2;
        }
        this.thanhTien = (this.moi - this.cu) * this.heSo * 550;
        if(this.moi - this.cu < 50) {
            this.phuTroi = 0;
        }
        else if(this.moi - this.cu <= 100) {
            this.phuTroi = Math.round(this.thanhTien * 35.0 / 100);
        }
        else {
            this.phuTroi = this.thanhTien;
        }
        this.tong = this.phuTroi + this.thanhTien;
    }
    @Override
    public String toString() {
        return this.code + " " + this.heSo + " " + this.thanhTien + " " + this.phuTroi + " " + this.tong;
    }
}
public class J05050_Tinh_tien_dien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Customer_J05050> a = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String type = scanner.nextLine();
            long cu = Long.parseLong(scanner.nextLine());
            long moi = Long.parseLong(scanner.nextLine());
            a.add(new Customer_J05050(i + 1, type, cu, moi));
        }
        for(Customer_J05050 i: a) {
            System.out.println(i);
        }
    }
}