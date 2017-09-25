package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int[]houses = new int[15];
        for (int i = 0; i <houses.length ; i++) {
            houses[i]=Integer.parseInt(reader.readLine());
        }

        int even=0;
        int notEven=0;
        for (int i = 0; i <houses.length ; i++) {
           if (i==0|i%2==0){
            even+=houses[i];
            }
           if (i%2!=0){
               notEven+=houses[i];
           }


        }
        if (even>notEven){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else if(even<notEven){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
