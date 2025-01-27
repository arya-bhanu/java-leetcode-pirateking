package org.example;

import java.util.*;

public class Solution {
    public static boolean isValid(String s) {
        Map<String, String> map = new HashMap<>();
        Stack<String> stack = new Stack<>();
        map.put("(",")");
        map.put("{","}");
        map.put("[","]");
        for (Character a : s.toCharArray()){
            /*pembuka*/
            if(map.containsKey(a.toString())){
                stack.add(a.toString());
            }else
            /*penutup*/
            if(map.containsValue(a.toString())){
                if(stack.isEmpty()) return false;
                String peek = stack.peek();
                if(!map.get(peek).equals(a.toString())){
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static int romanToInt(String s) {
        Map<String, Integer> symbolValue = new HashMap<>();
        List<String> strQ = new LinkedList<>();
        for (Character sChar: s.toCharArray()){
            strQ.add(sChar.toString());
        }
        symbolValue.put("I",1);
        symbolValue.put("V",5);
        symbolValue.put("X",10);
        symbolValue.put("L",50);
        symbolValue.put("C",100);
        symbolValue.put("D",500);
        symbolValue.put("M",1000);
        int total = 0;

        while (!strQ.isEmpty()){
            String peekA = strQ.getFirst();
            if(strQ.size() == 1) {
                total += symbolValue.get(peekA);
                break;
            }
            String peekB = strQ.get(1);
            int valA = symbolValue.get(peekA);
            int valB = symbolValue.get(peekB);
            if(valA < valB){
                total += valB - valA;
                strQ.removeFirst();
                strQ.removeFirst();
            }else {
                total += symbolValue.get(peekA);
                strQ.removeFirst();
            }
        }

        return total;
    }
}
