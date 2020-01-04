package com.com.mock.preparation.string;

import java.util.HashMap;
import java.util.Map;

public class CountCharInString {
    private static final String CHARACTER = "CHARACTER";
    private static final String NUMBER = "NUMBER";
    private static final String SPACE = "SPACE";
    public static void main(String[] args) {

        Map<String, Integer> counterMap = new HashMap<String, Integer>();

        String str ="9 She can not do anything.. 737643 she is enjoi8";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int asciiValue = ch;

            if((asciiValue>=65 && asciiValue <=90)|| (asciiValue>=97 && asciiValue <=122)){
                storeValue(CHARACTER, counterMap);

            }
            else if(asciiValue>=48 && asciiValue<=57){
                storeValue(NUMBER, counterMap);
            }
            else {
                    storeValue(SPACE, counterMap);
            }
        }
        System.out.println(counterMap);
    }
    private static void storeValue(String key, Map<String, Integer> counterMap){
        if(counterMap.containsKey(key)){
            counterMap.put(key, counterMap.get(key)+1);
        }
        else {
            counterMap.put(key, 1);
        }
    }
}
