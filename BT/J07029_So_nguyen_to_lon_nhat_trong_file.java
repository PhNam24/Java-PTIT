package BT;

import java.util.*;
import java.io.*;
public class J07029_So_nguyen_to_lon_nhat_trong_file {
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
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>)objectInput.readObject();
        int[] d = new int[1000005];
        for(Integer i: a) {
            if(snt(i)) {
                d[i]++;
            }
        }
        int cnt = 0;
        for(int i = 1000000; i >= 2; i--) {
            if(d[i] != 0) {
                cnt++;
                System.out.println(i + " " + d[i]);
            }
            if(cnt == 10) {
                break;
            }
        }
    }
}
