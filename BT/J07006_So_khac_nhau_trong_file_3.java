package BT;

import java.io.*;
import java.util.*;

public class J07006_So_khac_nhau_trong_file_3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>)objectInput.readObject();
        int[] d = new int[1005];
        for(Integer i: a) {
            d[i]++;
        }
        for(int i = 0; i < 1000; i++) {
            if(d[i] != 0) {
                System.out.println(i + " " + d[i]);
            }
        }
    }
}
