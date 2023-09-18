package BT;

import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;
import java.io.File;

public class J07003_Tach_doi_va_tinh_tong {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner scanner1 = new Scanner(file);
        String s = null;
        while(scanner1.hasNextLine()) {
            s = scanner1.nextLine();
        }
        while(s.length() > 1) {
            int idx = s.length() / 2;
            String a = s.substring(0, idx);
            String b = s.substring(idx);
            BigInteger A = new BigInteger(a);
            BigInteger B = new BigInteger(b);
            System.out.println(A.add(B));
            s = A.add(B).toString();
        }
    }
}
