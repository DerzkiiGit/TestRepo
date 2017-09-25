package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        even=0;
        odd=0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int value  = Integer.parseInt(reader.readLine());


        while (value!=0){

            int number = value%10;
            value=value/10;
            if (number%2==0){
                even++;
            }else {
                odd++;
            }

        }
        System.out.println(String.format("Even: %d Odd: %d",even,odd));

    }
}
