package BT;

import java.util.*;
import java.io.*;
public class J07015_So_nguyen_to_trong_file_nhi_phan {
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
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>)objectInput.readObject();
        int[] d = new int[10005];
        for(Integer i: a) {
            if(snt(i)) {
                d[i]++;
            }
        }
        for(int i = 0; i < 10000; i++) {
            if(d[i] != 0) {
                System.out.println(i + " " + d[i]);
            }
        }
    }
}
