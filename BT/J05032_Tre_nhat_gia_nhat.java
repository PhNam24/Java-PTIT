package BT;

import java.util.*;

class Person_J05032 implements Comparable<Person_J05032>{
    private String name, birth;

    public Person_J05032() {
        this.name = null;
        this.birth = null;
    }

    public Person_J05032(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Person_J05032 a) {
        String[] s1 = this.birth.split("/");
        String[] s2 = a.birth.split("/");
        ArrayList<Integer> time1 = new ArrayList<>();
        ArrayList<Integer> time2 = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            time1.add(Integer.parseInt(s1[i]));
            time2.add(Integer.parseInt(s2[i]));
        }
        if(!time1.get(2).equals(time2.get(2))) {
            return time1.get(2) - time2.get(2);
        }
        else if(!time1.get(1).equals(time2.get(1))) {
            return time1.get(1) - time2.get(1);
        }
        return time1.get(0) - time2.get(0);
    }
}
public class J05032_Tre_nhat_gia_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Person_J05032> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scanner.next();
            String birth = scanner.next();
            a.add(new Person_J05032(name, birth));
        }
        Collections.sort(a);
        System.out.println(a.get(n - 1).getName());
        System.out.println(a.get(0).getName());
    }
}
