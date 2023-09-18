package BT;

import java.util.*;

//Khi sub thi doi ten class thanh WordSet
class WordSet_J04022 {
    private Set<String> set = new TreeSet<>();

    public WordSet_J04022(String input) {
        String[] s = input.toLowerCase().split("\\s+");
        Arrays.sort(s);
        this.set.addAll(Arrays.asList(s));
    }

    public WordSet_J04022 union(WordSet_J04022 ws) {
        Set<String> ans = new TreeSet<>(this.set);
        ans.addAll(ws.set);
        String ans1 = "";
        for(String i: ans) {
            ans1 += i + " ";
        }
        return new WordSet_J04022(ans1);
    }

    public WordSet_J04022 intersection(WordSet_J04022 ws) {
        Set<String> ans = new TreeSet<>(this.set);
        ans.retainAll(ws.set);
        String ans1 = "";
        for(String i: ans) {
            ans1 += i + " ";
        }
        return new WordSet_J04022(ans1);
    }

    @Override
    public String toString() {
        String ans = "";
        for(String i: set) {
            ans += i + " ";
        }
        return ans;
    }
}

public class J04022_WordSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet_J04022 s1 = new WordSet_J04022(in.nextLine());
        WordSet_J04022 s2 = new WordSet_J04022(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
