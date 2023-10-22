package TH.TH2;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class A_Phep_toan_co_ban {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DAYSO.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<BigInteger> a = new ArrayList<>();
        BigInteger sum = new BigInteger("0");
        while(n-- > 0) {
            BigInteger tmp = new BigInteger(scanner.nextLine());
            a.add(tmp);
            sum = sum.add(tmp);
        }
        Collections.sort(a);
        System.out.println(a.get(0));
        System.out.println(a.get(a.size() - 1));
        System.out.println(sum);
    }
}
