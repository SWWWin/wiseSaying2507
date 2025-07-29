package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");

        List<wiseSaying> wiseSayings = new ArrayList<>();

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

                wiseSayings.add(new wiseSaying(wiseSayingCount, wiseSaying, author));
                wiseSayingCount ++;
            } else if (str.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("---------------------");
                for(wiseSaying w : wiseSayings){
                    System.out.println(w.getId() + " / " + w.getAuthor() + " / " + w.getWiseSaying());
                }
            } else if((str.substring(0,6)).equals("삭제?id=")) {
                int findId = parseInt(str.substring(6, str.length()));
                System.out.println(findId);

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
        }
    }
}

class wiseSaying {
    private int id;
    private String wiseSaying;
    private String author;

    public wiseSaying(int id, String wiseSaying, String author) {
        this.id = id;
        this.wiseSaying = wiseSaying;
        this.author = author;
    }

    public int getId() {return id;}
    public String getWiseSaying() { return wiseSaying; }
    public String getAuthor() { return author; }


    public void setId(int id) {
        this.id = id;
    }

    public void setWiseSaying(String wiseSaying){
        this.wiseSaying = wiseSaying;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}