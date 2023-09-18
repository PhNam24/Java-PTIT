package BT;

import java.io.*;
import java.util.*;


class LoaiPhong_J07045 implements Comparable<LoaiPhong_J07045> {
    String code;
    String type;
    String price;
    String fee;
    public LoaiPhong_J07045() {
        this.code = null;
        this.type = null;
        this.price = null;
        this.fee = null;
    }

    public LoaiPhong_J07045(String input) {
        String[] s = input.split("\\s+");
        this.code = s[0];
        this.type = s[1];
        this.price = s[2];
        this.fee = s[3];
    }

    @Override
    public int compareTo(LoaiPhong_J07045 LoaiPhong_J07045) {
        return this.type.compareTo(LoaiPhong_J07045.type);
    }

    @Override
    public String toString() {
        return this.code + " " + this.type + " " + this.price + " " + this.fee;
    }
}

public class J07045_Loai_phong {

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong_J07045> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong_J07045(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong_J07045 tmp : ds){
            System.out.println(tmp);
        }
    }
    public static void main7977124(String[] args) throws IOException {
        ArrayList<LoaiPhong_J07045> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong_J07045(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong_J07045 tmp : ds){
            System.out.println(tmp);
        }
    }
    public static void main1278775(String[] args) throws IOException {
        ArrayList<LoaiPhong_J07045> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong_J07045(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong_J07045 tmp : ds){
            System.out.println(tmp);
        }
    }
}
