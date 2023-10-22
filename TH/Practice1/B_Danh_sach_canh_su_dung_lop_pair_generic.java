package TH.Practice1;

import java.util.*;

class Pair_B<T, U> implements Comparable<Pair_B<T, U>> {
    private T first;
    private U second;
    public Pair_B() {
        this.first = null;
        this.second = null;
    }

    public Pair_B(T first, U second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + this.first + "," + this.second + ")";
    }

    public boolean equals(Pair_B<T, U> p) {
       if(this.first != p.first || this.second != p.second) {
           return false;
       }
       return true;
    }
    public int compareTo(Pair_B<T, U> p) {
        if(this.first != p.first) {
            if((Integer)this.first < (Integer)p.first) {
                return -1;
            }
            else if((Integer)this.first > (Integer)p.first) {
                return 1;
            }
        }
        if((Integer)this.second < (Integer)p.second) {
            return -1;
        }
        if((Integer)this.second > (Integer)p.second) {
            return -1;
        }
        return 0;
    }
}
public class B_Danh_sach_canh_su_dung_lop_pair_generic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        Set<Pair_B<Integer, Integer>> s = new TreeSet<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
                if(a[i][j] == 1) {
                    int first, second;
                    if(i < j) {
                        first = i;
                        second = j;
                    }
                    else {
                        first = j;
                        second = i;
                    }
                    Pair_B<Integer, Integer> p = new Pair_B<>(first + 1, second + 1);
                    if(!s.contains(p)) {
                        System.out.println(p);
                        s.add(p);
                    }
                }
            }
        }
    }
}
