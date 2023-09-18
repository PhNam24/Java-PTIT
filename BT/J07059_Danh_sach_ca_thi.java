package BT;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class CaThi_J07059 implements Comparable<CaThi_J07059> {
    String code;
    String date;
    String time;
    String room;
    long count;

    public CaThi_J07059() {
        this.code = null;
        this.date = null;
        this.time = null;
        this.room = null;
        this.count = 0;
    }

    public CaThi_J07059(int stt, String date, String time, String room, long count) {
        this.code = "C";
        String tmp = String.valueOf(stt);
        for(int i = 0; i < 3 - tmp.length(); i++) {
            this.code += "0";
        }
        this.code += tmp;
        this.date = date;
        this.time = time;
        this.room = room;
        this.count = count;
    }

    @Override
    public int compareTo(CaThi_J07059 CaThi_J07059) {
        if(this.count != CaThi_J07059.count) {
            return (int)(this.count - CaThi_J07059.count);
        }
        return this.code.compareTo(CaThi_J07059.code);
    }

    @Override
    public String toString() {
        return this.code + " " + this.date + " " + this.time + " " + this.room;
    }
}

public class J07059_Danh_sach_ca_thi {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(new File("CaThi_J07059.in"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("hh:mm");
        int n = Integer.parseInt(scanner.nextLine());
        CaThi_J07059[] a = new CaThi_J07059[n];
        for(int i = 0; i < n; i++) {
            String date = scanner.nextLine();
            String time = scanner.nextLine();
            String room = scanner.nextLine();
            Date d = simpleDateFormat.parse(date);
            Date t = simpleTimeFormat.parse(time);
            long count = d.getTime() + t.getTime();
            a[i] = new CaThi_J07059(i + 1, date, time, room, count);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}