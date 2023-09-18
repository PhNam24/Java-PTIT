package BT;
import java.util.*;
import java.io.*;
public class J07005_So_khac_nhau_trong_File {
    public static void main(String[] args) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] d = new int[1005];
        for(int i = 0; i < 100000; i++) {
            d[dataInputStream.readInt()]++;
        }
        for(int i = 0 ; i < 1000; i++) {
            if(d[i] != 0) {
                System.out.println(i + " " + d[i]);
            }
        }
    }
}
