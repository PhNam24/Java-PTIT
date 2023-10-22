package BT;

import java.util.*;
import java.io.*;
public class J07023_Nguyen_to_va_thuan_nghich {
    public static boolean snt(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        String tmp = String.valueOf(n);
        for(int i = 0; i < tmp.length() / 2; i++) {
            if(tmp.charAt(i) != tmp.charAt(tmp.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInput1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        int[] d1 = new int[10005];
        ArrayList<Integer> a1 = (ArrayList<Integer>)objectInput1.readObject();
        for(Integer i: a1) {
            if(snt(i)) {
                d1[i]++;
            }
        }
        ObjectInputStream objectInput2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        int[] d2 = new int[10005];
        ArrayList<Integer> a2 = (ArrayList<Integer>)objectInput2.readObject();
        for(Integer i: a2) {
            if(snt(i)) {
                d2[i]++;
            }
        }
        for(int i = 2; i < 10005; i++) {
            if(d1[i] != 0 && d2[i] != 0) {
                System.out.println(i + " " + d1[i] + " " + d2[i]);
            }
        }
    }
}
