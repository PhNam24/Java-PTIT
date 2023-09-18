package BT;

import java.io.*;
import java.util.*;

class Person_J07071 implements Comparable<Person_J07071> {
    String fullName;
    String shortName;

    public Person_J07071() {
        this.fullName = null;
        this.shortName = null;
    }

    public Person_J07071(String fullName) {
        this.fullName = fullName;
        this.shortName = "";
        String[] s = fullName.split("\\s+");
        for(int i = 0; i < s.length; i++) {
            this.shortName += s[i].charAt(0);
            if(i < s.length - 1) {
                this.shortName += ".";
            }
        }
    }

    public String getFullName() {
        return this.fullName;
    }
    public String getShortName() {
        return this.shortName;
    }

    @Override
    public String toString() {
        return this.fullName + " " + this.shortName;
    }

    @Override
    public int compareTo(Person_J07071 Person_J07071) {
        String[] s1 = this.fullName.split("\\s+");
        String[] s2 = Person_J07071.fullName.split("\\s+");
        if(!s1[s1.length - 1].equals(s2[s2.length - 1])) {
            return s1[s1.length - 1].compareTo(s2[s2.length - 1]);
        }
        return s1[0].compareTo(s2[0]);
    }
}

public class J07071_Ten_viet_tat {

    static boolean check(String s, Person_J07071 p) {
        String ss = p.getShortName();
        if(s.length() != ss.length()) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') {
                continue;
            }
            if(s.charAt(i) != ss.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(scanner.nextLine());
        Person_J07071[] a = new Person_J07071[n];
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            a[i] = new Person_J07071(name);
        }
        Arrays.sort(a);
        int m = Integer.parseInt(scanner.nextLine());
        while(m-- > 0) {
            String query = scanner.nextLine();
            for(int i = 0; i < n; i++) {
                if(check(query, a[i])) {
                    System.out.println(a[i].getFullName());
                }
            }
        }
    }
}