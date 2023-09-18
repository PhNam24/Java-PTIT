package BT;

import java.io.*;
import java.util.*;
public class J07031_Cap_so_nguyen_to_trong_file_2 {
    static boolean snt(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
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
        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(Integer i: a1) {
            if(snt(i)) {
                s1.add(i);
            }
        }
        for(Integer i: a2) {
            if(snt(i)) {
                s2.add(i);
            }
        }
        for(Integer i: s1) {
            if(s1.contains(1000000 - i) && !s2.contains(i) && !s2.contains(1000000 - i) && i + i < 1000000) {
                System.out.println(i + " " + (1000000 - i));
            }
        }
    }
}
