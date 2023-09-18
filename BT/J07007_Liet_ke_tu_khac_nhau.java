package BT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
//Khi sub thi doi ten class thanh WordSet
class WordSet_J07007 {
    Set<String> set;

    public WordSet_J07007(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        this.set = new TreeSet<>();
        while(scanner.hasNext()) {
            this.set.add(scanner.next().toLowerCase());
        }
    }

    @Override public String toString() {
        String s = "";
        for(String i : this.set) {
            s += i + '\n';
        }
        return s;
    }
}


public class J07007_Liet_ke_tu_khac_nhau {
    public static void main(String[] args) throws IOException {
        WordSet_J07007 ws = new WordSet_J07007("VANBAN.in");
        System.out.println(ws);
    }
    public static void main6744243(String[] args) throws IOException {
        WordSet_J07007 ws = new WordSet_J07007("VANBAN.in");
        System.out.println(ws);
    }
}
