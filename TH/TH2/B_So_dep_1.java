package TH.TH2;

import java.io.*;
import java.util.*;

public class B_So_dep_1 {

    static boolean check(int n) {
        if(n < 10) {
            return false;
        }
        String s = String.valueOf(n);
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1 = new ArrayList<>();
        a1 = (ArrayList<Integer>)inputStream1.readObject();
        int[] d1 = new int[10000];
        Set<Integer> s1 = new TreeSet<>();
        for (Integer i : a1) {
            if (check(i)) {
                s1.add(i);
            }
            d1[i]++;
        }
        ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = new ArrayList<>();
        a2 = (ArrayList<Integer>)inputStream2.readObject();
        int[] d2 = new int[10000];
        Set<Integer> s2 = new TreeSet<>();
        for (Integer i : a2) {
            if (check(i)) {
                s2.add(i);
            }
            d2[i]++;
        }
        for(Integer i: s1) {
            if(s2.contains(i)) {
                System.out.println(i + " " + d1[i] + " " + d2[i]);
            }
        }
    }
}
