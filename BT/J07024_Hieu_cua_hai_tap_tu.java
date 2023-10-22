package BT;

import java.util.*;
import java.io.*;
//Khi sub thi doi ten class thanh WordSet_J07024_J07014
class WordSet_J07024 {
    private Set<String> set = new TreeSet<>();

    public WordSet_J07024(String inputFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(inputFile));
        String input = "";
        while(scanner.hasNextLine()) {
            input +=  " " + scanner.nextLine().toLowerCase();
        }
        String[] s = input.split("\\s+");
        this.set.addAll(Arrays.asList(s));
    }

    public String difference(WordSet_J07024 s) {
        String ans = "";
        for(String i: this.set) {
            if(!s.set.contains(i)) {
                ans += i + " ";
            }
        }
        return ans;
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
public class J07024_Hieu_cua_hai_tap_tu {
    public static void main(String[] args) throws IOException {
        WordSet_J07024 s1 = new WordSet_J07024("DATA1.in");
        WordSet_J07024 s2 = new WordSet_J07024("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
