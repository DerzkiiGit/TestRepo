package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>ints=new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            ints.add(Integer.parseInt(reader.readLine()));
        }

        int maxEquals=0;
        int currEquals=0;

        for (int i = 0; i <ints.size() ; i++) {
            if (i>0){
                if (ints.get(i).equals(ints.get(i-1))){
                    if (currEquals==0){
                        currEquals=2;
                    }else {
                        currEquals++;
                    }

                }else {
                    if(currEquals>maxEquals){
                        maxEquals=currEquals;
                        currEquals=0;
                    }else {
                        currEquals=0;
                    }
                }
            }
        }
        if (currEquals>maxEquals)maxEquals=currEquals;
        if (maxEquals==0)maxEquals=1;
        System.out.println(maxEquals);

    }
}