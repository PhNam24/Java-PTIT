package BT;

import java.util.*;
import java.io.*;

public class J07085_Tong_chu_so {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>)objectInput.readObject();
        for(String string: a) {
            String tmp = "";
            boolean checkZero = true;
            int sum = 0;
            for(int i = 0; i < string.length(); i++) {
                if(Character.isDigit(string.charAt(i))) {
                    if(string.charAt(i) == '0') {
                        if(!checkZero) {
                            tmp += string.charAt(i);
                        }
                    }
                    else {
                        tmp += string.charAt(i);
                        checkZero = false;
                    }
                    sum += string.charAt(i) - '0';
                }
            }
            System.out.println(tmp + " " + sum);
        }
    }
}
