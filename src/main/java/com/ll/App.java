package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class App {
    void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");

        List<WiseSaying> wiseSayings = new ArrayList<>();

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

                wiseSayings.add(new WiseSaying(wiseSayingCount, wiseSaying, author));
                wiseSayingCount ++;
            } else if (str.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("---------------------");
                for(WiseSaying w : wiseSayings){
                    System.out.println(w.getId() + " / " + w.getAuthor() + " / " + w.getWiseSaying());
                }
            } else if((str.substring(0,6)).equals("삭제?id=")) {
                int findId = parseInt(str.substring(6, str.length()));


                boolean isExist = wiseSayings.stream()
                        .anyMatch(wiseSaying -> wiseSaying.getId() == findId);

                if(isExist) {
                    for (int i = 0; i < wiseSayings.size(); i++) {
                        if(wiseSayings.get(i).getId() == findId){
                            wiseSayings.remove(i);
                            System.out.println(findId + "번 명언이 삭제되엇습니다.");
                            break;
                        }
                    }
                } else {
                    System.out.println(findId + "번 명언은 존재하지 않습니다.");
                }
            }

            else if((str.substring(0,6)).equals("수정?id=")) {
                int findId = parseInt(str.substring(6, str.length()));


                boolean isExist = wiseSayings.stream()
                        .anyMatch(wiseSaying -> wiseSaying.getId() == findId);

                if(isExist) {
                    for (int i = 0; i < wiseSayings.size(); i++) {
                        if(wiseSayings.get(i).getId() == findId){
                            System.out.println("명언(기존): " + wiseSayings.get(i).getWiseSaying());
                            System.out.print("명언 : ");
                            String newWiseSaying = sc.nextLine().trim();
                            System.out.println("작가(기존: "+ wiseSayings.get(i).getAuthor());
                            System.out.print("작가 : ");
                            String newAuthor = sc.nextLine().trim();

                            wiseSayings.get(i).setWiseSaying(newWiseSaying);
                            wiseSayings.get(i).setAuthor(newAuthor);

                            System.out.println(findId + "번 명언이 삭제되엇습니다.");
                            break;
                        }
                    }
                } else {
                    System.out.println(findId + "번 명언은 존재하지 않습니다.");
                }
            }
        }
    }
}
