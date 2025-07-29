package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== 명언 앱 ==");

        while(true) {
            System.out.print("명령) ");
            String str = sc.nextLine().trim();
            if(str.equals("종료")) break;
        }
    }
}
