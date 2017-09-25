package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer>people=new HashMap<>();
        people.put("v",500);
        people.put("s",1500);
        people.put("d",2500);
        people.put("q",3500);
        people.put("vw",4500);
        people.put("vd",100);
        people.put("vh",200);
        people.put("vkl",9500);
        people.put("vret",10500);
        people.put("vasd",300);



        return people;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        for(Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue() < 500) {
                it.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}