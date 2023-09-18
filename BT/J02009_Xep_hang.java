package BT;

import java.util.*;

class Pair_J02009 implements Comparable<Pair_J02009>{
    private int first;
    private int second;

    public Pair_J02009() {
        this.first = 0;
        this.second = 0;
    }

    public Pair_J02009(int first, int second) {
        this.first = first;
        this.second = second;
    }


    public int getFirst() {
        return this.first;
    }

    public int getSecond() {
        return this.second;
    }

    @Override
    public int compareTo(Pair_J02009 p) {
        if(this.first != p.first) {
            return this.first - p.first;
        }
        return this.second - p.second;
    }
}
public class J02009_Xep_hang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Pair_J02009> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            a.add(new Pair_J02009(scanner.nextInt(), scanner.nextInt()));
        }
        Collections.sort(a);
        int t = a.get(0).getFirst() + a.get(0).getSecond();
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i).getFirst() < t) {
                t += a.get(i).getSecond();
            }
            else {
                t = a.get(i).getFirst() + a.get(i).getSecond();
            }
        }
        System.out.println(t);
    }
}
