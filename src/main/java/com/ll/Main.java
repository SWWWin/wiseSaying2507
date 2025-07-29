package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");

        int wiseSayingCount = 1;
        while(true) {
            System.out.print("명령) ");
            String str = sc.nextLine().trim();
            if(str.equals("종료")) break;
            else if(str.equals("등록")){
                System.out.print("명언 : ");
                String wiseSaying = sc.nextLine().trim();

                System.out.print("작가 : ");
                String author = sc.nextLine().trim();
                System.out.println(wiseSayingCount + "번 명언이 등록되었습니다.");
                wiseSayingCount ++;
            }
        }
    }
}
