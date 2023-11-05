package TH.TH3;

import java.util.*;
import java.io.*;

class ICPCTeam_TH3 implements Comparable<ICPCTeam_TH3> {
    private String code, name, school;

    public ICPCTeam_TH3(String name, String school) {
        this.code = "team";
        this.name = name;
        this.school = school;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public int compareTo(ICPCTeam_TH3 a) {
        if(!this.school.equals(a.school)) {
            return this.school.compareTo(a.school);
        }
        return this.name.compareTo(a.name);
    }

    public String toString() {
        return this.code + " " + this.name + " " + this.school;
    }
}

public class Bai_4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("TH/TH3/InputFile/INSTITUTION.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<ICPCTeam_TH3> a = new ArrayList<>();
        Map<String, String> m = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = "";
            for(int j = 1; j < input.length; j++) {
                name += input[j];
                if(j < input.length - 1) {
                    name += " ";
                }
            }
            m.put(input[0], name);
        }
        Scanner scanner1 = new Scanner(new File("TH/TH3/InputFile/REGISTER.in"));
        n = Integer.parseInt(scanner1.nextLine());
        for(int i = 0; i < n; i++) {
            String[] input = scanner1.nextLine().split("\\s+");
            int l = Integer.parseInt(input[1]);
            for(int j = 0; j < l; j++) {
                String name = scanner1.nextLine();
                a.add(new ICPCTeam_TH3(name, m.get(input[0])));
            }
        }
        Collections.sort(a);
        for(int i = 0; i < a.size(); i++) {
            String code = "team" + String.format("%02d", i + 1);
            a.get(i).setCode(code);
            System.out.println(a.get(i));
        }
    }
}
