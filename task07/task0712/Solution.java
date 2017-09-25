package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>strings = new ArrayList<>();
        int smallest=0;
        int biggest=0;
        for (int i = 0; i <10 ; i++) {
            String string = reader.readLine();
            if (i==0){
                smallest=string.length();
                biggest=string.length();
            }

            if (string.length()<smallest){
                smallest=string.length();
            }
            if (string.length()>biggest){
                biggest=string.length();
            }
            strings.add(string);
        }


        for (String s :strings) {

            if (s.length()==smallest){
                System.out.println(s);
                break;
            }
            if (s.length()==biggest){
                System.out.println(s);
                break;
            }

        }


    }
}
