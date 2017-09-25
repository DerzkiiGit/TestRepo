package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());

        if (a < 1000 & a >= 1){

            if (a % 2 == 0) {
                System.out.print("четное");
            } else if (a % 2 != 0) {
                System.out.print("нечетное");
            }

        if (a < 10) {
            System.out.println(" однозначное число");
        }
        if (a >= 10 && a < 100) {
            System.out.println(" двузначное число");
        }
        if (a >= 100 && a < 1000) {
            System.out.println(" трехзначное число");
        }
    }
    }


}
