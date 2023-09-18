package BT;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Customer_J07046 implements Comparable<Customer_J07046> {
    String code;
    String name;
    String room;
    String arrive;
    String leave;
    long stay;
    public Customer_J07046() {
        this.code = null;
        this.name = null;
        this.room = null;
        this.arrive = null;
        this.leave = null;
        this.stay = 0;
    }

    public Customer_J07046(int stt, String name, String room, String arrive, String leave, long stay) {
        this.code = "KH";
        String tmp = String.valueOf(stt);
        for(int i = 0; i < 2 - tmp.length(); i++) {
            this.code += "0";
        }
        this.code += tmp;
        this.name = name;
        this.room = room;
        this.arrive = arrive;
        this.leave = leave;
        this.stay = stay;
    }

    @Override
    public int compareTo(Customer_J07046 Customer_J07046) {
        long ans = this.stay - Customer_J07046.stay;
        return (int)-ans;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.room + " " + this.stay;
    }
}

public class J07046_Danh_sach_luu_tru {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(new File("KHACH.in"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(scanner.nextLine());
        Customer_J07046[] a = new Customer_J07046[n];
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String room = scanner.nextLine();
            String arrive = scanner.nextLine();
            String leave = scanner.nextLine();
            Date firstDay = simpleDateFormat.parse(arrive);
            Date lastDay = simpleDateFormat.parse(leave);
            long stay = (lastDay.getTime() - firstDay.getTime()) / (long)(1000 * 60 * 60 * 24);
            a[i] = new Customer_J07046(i + 1, name, room, arrive, leave, stay);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}