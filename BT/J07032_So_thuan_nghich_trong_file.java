package BT;

import java.io.*;
import java.util.*;
public class J07032_So_thuan_nghich_trong_file {
    static boolean check(String s) {
       if(s.length() % 2 == 0 || s.length() == 1) {
           return false;
       }
       for(int i = 0; i < s.length(); i++) {
           if(s.charAt(i) == '0' || s.charAt(i) == '2' || s.charAt(i) == '4' || s.charAt(i) == '6' || s.charAt(i) == '8') {
               return false;
           }
           if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
               return false;
           }
       }
       return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInput1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream objectInput2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>)objectInput1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>)objectInput2.readObject();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        int[] d = new int[1000005];
        for(Integer i: a1) {
            if(check(String.valueOf(i))) {
                s1.add(i);
                d[i]++;
            }
        }
        for(Integer i: a2) {
            if(check(String.valueOf(i))) {
                s2.add(i);
                d[i]++;
            }
        }
        int cnt = 0;
        for(int i = 0; i < 1000005; i++) {
            if(d[i] != 0 && s1.contains(i) && s2.contains(i)) {
                System.out.println(i + " " + d[i]);
                cnt++;
            }
            if(cnt == 10) {
                break;
            }
        }
    }
}
