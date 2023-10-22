package BT;

import java.util.*;

class Club_J05069 {
    private String code, name;
    private long price;
    public Club_J05069(String code, String name, long price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    public String getCode() {
        return this.code;
    }
    public String getName() {
        return this.name;
    }
    public long getPrice() {
        return this.price;
    }
}
public class J05069_Cau_lac_bo_bong_da_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Club_J05069> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            long price = Long.parseLong(scanner.nextLine());
            a.add(new Club_J05069(code, name, price));
        }
        int q = Integer.parseInt(scanner.nextLine());
        ArrayList<String> ans = new ArrayList<>();
        while(q-- > 0) {
            String query = scanner.next();
            long soLuong = scanner.nextLong();
            for(Club_J05069 i: a) {
                if(query.substring(1, 3).equals(i.getCode())) {
                    ans.add(String.format("%s %s %d", query, i.getName(), soLuong * i.getPrice()));
                    break;
                }
            }
        }
        for(String i: ans) {
            System.out.println(i);
        }
    }
}
