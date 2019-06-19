package day12;

import java.util.Scanner;

public class Demo_1 {
    // 如果是字符串常量和字符串变量equals比较，尽量把常量放在前面因为变量有可能是null那样的话会出现空指针异常
    public static void main(String[] args) {
        demo_1();

    }
 
    private static void demo_1() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String userName = sc.nextLine();
            System.out.println("请输入密码");
            String password = sc.nextLine();
            if ("admin".equals(userName) && "admin".equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("您的3次机会已用完");
                } else {
                    System.out.println("用户名或密码错误,请重新录入。您还有" + (2 - i) + "次机会");
                }

            }
        }
    }

}
