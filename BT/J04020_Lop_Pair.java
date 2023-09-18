package BT;

import java.util.*;
//Khi sub thi doi ten class thanh Pair
class Pair_J04020<T, U> {
    private T first;
    private U second;
    public Pair_J04020() {
        this.first = null;
        this.second = null;
    }

    public Pair_J04020(T first, U second) {
        this.first = first;
        this.second = second;
    }

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

    public boolean isPrime() {
        if(!snt((Integer)this.first) || !snt((Integer)this.second)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return this.first + " " + this.second;
    }
}
public class J04020_Lop_Pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair_J04020<Integer, Integer> p = new Pair_J04020<>(i, n-i);
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
