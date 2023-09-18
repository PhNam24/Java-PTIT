package BT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
//Khi sub thi doi ten class thanh Pair
class Pair_J07017<T, U> {
    T first;
    U second;

    public Pair_J07017(T first, U second) {
        this.first = first;
        this.second = second;
    }
    public boolean snt(int n) {
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
    public boolean isPrime() {
        if(!snt((Integer) this.first) || !snt((Integer)this.second)) {
            return false;
        }
        return true;
    }

    @Override public String toString() {
        return String.valueOf(this.first) + " " + String.valueOf(this.second);
    }
}

public class J07017_Lop_Pair {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair_J07017<Integer, Integer> p = new Pair_J07017<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}