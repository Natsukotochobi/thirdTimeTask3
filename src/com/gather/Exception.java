package com.gather;

public class Exception {
    public static void main(String[] args) {
        int buy = -1;
        int totalAmount = buy * 1000;

        try {
            if (buy < 0){
                throw new java.lang.Exception("入力できない数値です。");
            } else {
                System.out.println("合計金額は" + totalAmount + "です。");
            }
        } catch (java.lang.Exception e){
            e.printStackTrace();
        }


        String[] character = {"うさまる", "ふなっしー", "ピカチュウ"};

        int index = 4;
        try {
            System.out.println(character[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("配列の範囲を超えています");
        }



    }
}
