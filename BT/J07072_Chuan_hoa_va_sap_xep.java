package BT;

import java.io.*;
import java.util.*;

public class J07072_Chuan_hoa_va_sap_xep {
    public static String normalization(String ss) {
        String[] s = ss.trim().toLowerCase().split("\\s+");
        String ans = "";
        for(int i = 0; i < s.length; i++) {
            ans += s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
            if(i < s.length - 1) {
                ans += " ";
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DANHSACH.in"));
        ArrayList<String> a = new ArrayList<>();
        while(scanner.hasNextLine()) {
            a.add(normalization(scanner.nextLine()));
        }

        Comparator<String> cmp = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String[] ss = a.split("\\s+");
                String[] ss1 = b.split("\\s+");
                String ho1 = ss[0], ho2 = ss1[0];
                String ten1 = ss[ss.length - 1], ten2 = ss1[ss1.length - 1];
                String dem1 = "", dem2 = "";
                for(int i = 1; i < ss.length - 1; i++) {
                    dem1 += ss[i];
                }
                for(int i = 1; i < ss1.length - 1; i++) {
                    dem2 += ss1[i];
                }
                if(!ten1.equals(ten2)) {
                    return ten1.compareTo(ten2);
                }
                else if(!ho1.equals(ho2)) {
                    return ho1.compareTo(ho2);
                }
                return dem1.compareTo(dem2);
            }
        };

        Collections.sort(a, cmp);
        for(String i : a) {
            System.out.println(i);
        }
    }
}