package com.ll;

import com.ll.domain.system.SystemController;
import com.ll.domain.wiseSaying.WiseSayingController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner sc = new Scanner(System.in);
    private final List<WiseSaying> wiseSayings = new ArrayList<>();

    void run() {

        System.out.println("== 명언 앱 ==");

        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController(sc);
        while (true) {
            System.out.print("명령) ");
            String str = sc.nextLine().trim();

            Rq rq = new Rq(str);

            switch (rq.getActionName()) {
                case "종료" -> {
                    systemController.actionExit();
                return;
            }

                case "등록" -> wiseSayingController.actionWrite();

                case "목록" -> wiseSayingController.actionList();
                case "삭제" -> wiseSayingController.actionDelete(rq);

                case "수정" -> wiseSayingController.actionModify(rq);

            }
        }
    }


}

