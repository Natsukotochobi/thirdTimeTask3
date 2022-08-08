package com.gather;

import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {
            Map<String, String> residentsList = new HashMap<>();

            //mapにデータを格納
            residentsList.put("名古屋市", "田中太郎");
            residentsList.put("半田市", "佐藤ハナコ");
            residentsList.put("東郷町", "斉藤次郎");
            residentsList.put("飛島村", "近藤ヨシコ");

            //mapの内容を出力
            System.out.println(residentsList.get("東郷町"));
            residentsList.entrySet().stream()
                    .map(e -> e.getKey() + "在住" + ":" + e.getValue())
                    .forEach(System.out::println);
        }

}
