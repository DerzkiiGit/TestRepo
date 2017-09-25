package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>strings = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            strings.add(reader.readLine());
        }
        String current="";
        int length=0;

        for (int i = 0; i <strings.size() ; i++) {

            current=strings.get(i);
            if (i==0){
            length=current.length();
                continue;
            }
            if (length>current.length()){
                System.out.println(i);
                break;
            }else {
                length=current.length();
            }
        }




    }
}

