package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ArrayAndHashMapTest {
    @Test
    void containsDuplicate_returnTrueIfContainsDuplicate() {
        //given
        int[] nums={1,2,3,2,4,5,12};
        //when
        boolean actual = ArrayAndHashMap.containsDuplicate(nums);
        //then
        Assertions.assertTrue(actual);
    }

    @Test
    void containsDuplicate_returnFalschIfNotContainDuplicate() {
        //given
        int[] nums={1,2,3,4,5,12};
        //when
        boolean actual = ArrayAndHashMap.containsDuplicate(nums);
        //then
        Assertions.assertFalse(actual);
    }

    @Test
    void isAnagram_returnTrueIfIsAnagram() {
        //given
        String str1="anagram";
        String str2="nagaram";
        //when
        boolean actual = ArrayAndHashMap.isAnagram(str1,str2);
        //then
        Assertions.assertTrue(actual);
    }

    @Test
    void isAnagram_returnFalseIfNotAnagram() {
        //given
        String str1="car";
        String str2="cat";
        //when
        boolean actual = ArrayAndHashMap.isAnagram(str1,str2);
        //then
        Assertions.assertFalse(actual);
    }

    @Test
    void isAnagram_returnFalseIfLengthNotSame() {
        //given
        String str1="cart";
        String str2="cat";
        //when
        boolean actual = ArrayAndHashMap.isAnagram(str1,str2);
        //then
        Assertions.assertFalse(actual);
    }

    @Test
    void returnIndicesOf2NumsThatSumUpToTarget() {
        //given
        int[] nums={3,2,7,11,15};
        int target=9;
        //when
        int[] actual = ArrayAndHashMap.sumToTarget(nums,target);
        //then
        Assertions.assertArrayEquals(new int[]{1, 2}, actual);
    }





}