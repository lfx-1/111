import MainAndSon.demo1;
import OO.Main2;
import Things.Main4;
import pipe.Main3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("请选择你要使用的风格：");
        System.out.println("1 主程序-子程序软件体系结构");
        System.out.println("2 面向对象软件体系结构");
        System.out.println("3 事件系统软件体系结构");
        System.out.println("4 管道-过滤软件体系结构");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            demo1.main1();
        }
        else if (a == 2) {
            Main2.main2();
        }
        else if (a == 3) {
            Main3.main3();
        }
        else {
            Main4.main4();
        }


    }
}