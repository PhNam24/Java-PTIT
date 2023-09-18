package BT;
import java.util.*;
import java.io.*;
public class J07040_Liet_ke_theo_thu_tu_xuat_hien {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Scanner scanner = new Scanner(new File("VANBAN.in"));
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a = (ArrayList<String>)objectInput.readObject();
        ArrayList<String> a1 = new ArrayList<>();
        while(scanner.hasNextLine()) {
            String[] s = scanner.nextLine().toLowerCase().split("\\s+");
            a1.addAll(Arrays.asList(s));
        }
        ArrayList<String> a2 = new ArrayList<>();
        for(String i: a) {
            String[] s = i.toLowerCase().split("\\s+");
            a2.addAll(Arrays.asList(s));
        }
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();
        ArrayList<String> ans = new ArrayList<>();
        for(String i: a1) {
            if(!s1.contains(i)) {
                ans.add(i);
                s1.add(i);
            }
        }
        for(String i: a2) {
            s2.add(i);
        }
        for(String i: ans) {
            if(s2.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
