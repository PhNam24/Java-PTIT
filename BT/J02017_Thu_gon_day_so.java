package BT;

import java.util.ArrayList;
import java.util.Scanner;

public class J02017_Thu_gon_day_so {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int i = 1;
        while(i < a.size()) {
            if((a.get(i) + a.get(i - 1)) % 2 == 0) {
                a.remove(i);
                a.remove(i - 1);
                if(i > 1) {
                    i--;
                }
            }
            else {
                i++;
            }
        }
        System.out.println(a.size());
    }
}
