package TH.TH2;

import java.util.*;

class User_F {
    private String userName, passWord;
    private int loginSuccess;
    public User_F() {
        this.userName = null;
        this.passWord = null;
        this.loginSuccess = 0;
    }
    public User_F(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public void setLoginSuccess(int loginSuccess) {
        this.loginSuccess = loginSuccess;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public int getLoginSuccess() {
        return this.loginSuccess;
    }
}

public class F_Lop_User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<User_F> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            a.add(new User_F(input[0], input[1]));
        }
        int m = Integer.parseInt(scanner.nextLine());
        while(m-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            for(User_F i: a) {
                if(i.getUserName().equals(input[0]) && i.getPassWord().equals(input[1])) {
                    i.setLoginSuccess(i.getLoginSuccess() + 1);
                }
            }
        }
        for(User_F i: a) {
            System.out.print(i.getLoginSuccess() + " ");
        }
    }
}
