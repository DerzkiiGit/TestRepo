package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        int first = a-10;
        int second = b-10;

        if (abs(first)<abs(second)){
            System.out.println(a);
        }else if(abs(first)>abs(second)){
            System.out.println(b);
        }else{
           int rnd = (int) (Math.random()*2);
            if (rnd==0){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}