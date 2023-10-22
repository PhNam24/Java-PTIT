package BT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

class SinhVien {
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;
    public SinhVien (int id, String ten, String lop, String ngaysinh, float gpa) throws ParseException {
        this.ma = "B20DCCN";
        if(id < 10) {
            this.ma += "00" + id;
        }
        else if(id < 100) {
            this.ma += "0" + id;
        }
        else {
            this.ma += id;
        }
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh = simpleDateFormat.parse(ngaysinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.ngaysinh.getDate() + "/" + this.ngaysinh.getMonth() + "/" + this.ngaysinh.getYear() + " " + String.format("%.2f", this.gpa);
    }
}
public class J07013_Danh_sach_sinh_vien_trong_file_nhi_phan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> a = (ArrayList<SinhVien>)objectInput.readObject();
        for(SinhVien i: a) {
            System.out.println(i);
        }
    }
}
