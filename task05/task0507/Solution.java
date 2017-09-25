package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        double sum=0;
        int cnt=0;
        while (i!=-1){
            i = Integer.parseInt(reader.readLine());
            if (i!=-1){
                sum+=i;
                cnt++;
            }
        }
        Double result = sum/cnt;
        System.out.println(result);
    }
}

