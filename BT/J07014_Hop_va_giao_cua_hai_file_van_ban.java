package BT;
import java.util.*;
import java.io.*;
//Khi sub thi doi ten class thanh WordSet_J07014
class WordSet_J07014 {
    private Set<String> set = new TreeSet<>();

    public WordSet_J07014(String inputFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(inputFile));
        String input = "";
        while(scanner.hasNextLine()) {
            input +=  " " + scanner.nextLine().toLowerCase();
        }
        String[] s = input.split("\\s+");
        this.set.addAll(Arrays.asList(s));
    }

    public String union(WordSet_J07014 ws) {
        Set<String> ans = new TreeSet<>(this.set);
        ans.addAll(ws.set);
        String ans1 = "";
        for(String i: ans) {
            ans1 += i + " ";
        }
        return ans1;
    }

    public String intersection(WordSet_J07014 ws) {
        Set<String> ans = new TreeSet<>(this.set);
        ans.retainAll(ws.set);
        String ans1 = "";
        for(String i: ans) {
            ans1 += i + " ";
        }
        return ans1;
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

public class J07014_Hop_va_giao_cua_hai_file_van_ban {
    public static void main(String[] args) throws IOException {
        WordSet_J07014 s1 = new WordSet_J07014("DATA1.in");
        WordSet_J07014 s2 = new WordSet_J07014("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
