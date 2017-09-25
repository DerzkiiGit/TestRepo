package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int checkFour = a%4;
        int checkHundred = a%100;
        int checkFourHundred = a%400;
        if ((checkFour==0&checkHundred!=0)||checkFourHundred==0){
            System.out.println("количество дней в году: 366");
        }else{
            System.out.println("количество дней в году: 365");
        }
    }
}