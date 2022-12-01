package de.neuefische;

import java.util.*;

public class ArrayAndHashMap {

    //Given an integer array nums, return true if any value appears at least twice in the array,
    // and return false if every element is distinct.
    public static boolean containsDuplicate(int[] nums){
        Map<Integer,Integer> mapOfNums=new HashMap<>();
        for (int num:nums){
            mapOfNums.putIfAbsent(num,0);
            mapOfNums.put(num,mapOfNums.get(num)+1);
            if ((mapOfNums.get(num))>1){
                return true;
            }
        }
        return false;
    }


    //Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    //An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    //Input: s = "anagram", t = "nagaram"
    //Output: true

    public static boolean isAnagram(String word1,String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        Map<Character, Integer> mapOfLetters1 = new HashMap<>();
        Map<Character, Integer> mapOfLetters2 = new HashMap<>();
        if (chars1.length == chars2.length) {
            for (int i = 0; i < chars1.length; i++) {
                mapOfLetters1.putIfAbsent(chars1[i], 0);
                mapOfLetters1.put(chars1[i], mapOfLetters1.get(chars1[i]) + 1);

                mapOfLetters2.putIfAbsent(chars2[i], 0);
                mapOfLetters2.put(chars2[i], mapOfLetters2.get(chars2[i]) + 1);
            }
            return mapOfLetters1.equals(mapOfLetters2);
        }
        return false;
    }

    //Given an array of integers nums and an integer target,
    // return indices of the two numbers such that they add up to target.
    public static int[] sumToTarget(int[] nums,int target){
        int[] result= {0,0};

        for (int i=0; i<nums.length; i++){
            int num2 =target-nums[i];
            for (int j=0; j<nums.length; j++){
                if (nums[j]==num2 && i!=j){
                    result= new int[]{j, i};
                }
            }
        }
    return result;
    }

}
