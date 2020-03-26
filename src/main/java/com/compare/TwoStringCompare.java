package com.compare;

import java.util.HashMap;
/*
 * This program implements the following exercise described here:
 * http://paultyma.blogspot.com/2010/11/google-interviewing-story.html
 * 
 * Find if each character in the smaller string is in the larger string.
 * Compare speed execution time with different search flows. 
 * 
 * author: Frank Giordano 06/2014
 */
public class TwoStringCompare {

    public static void main(String[] args) {

        // input examples:
        String sourcetext = "192837465QWUIOPUYTERTWYEUIOPLEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZUYTERTWYEUIOPLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZZCVCVNMMZLLOPIOQIUYUWYTRTYIHKKMZMNXNBXVCZBZMNZZJLZOZIUYQRQE25241433648291765KJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMKJKIQUQYQRQETBVXCBMMPOIQUYQRQEWQOLKJHMZNVZC1525378292CNMBVHJMNKLXOIUQYTWRERWYU1238465YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651YTWRERWYU12384651TUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHBUYTLKMNZBXCVZXBTYQYQTRQEEYTUIOOLKKJHHZBUYTYTWRERWYU12384651YTWRERWYU12384651YTWRERYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREYTWRERWYU12384651YTWREWYU1238465114373829ASDFG";
        String searchtext = "ASDFG";

        boolean answer = false;
        long startTime;
        long endTime;

        // first search attempt: search for all the characters in the smaller string
        // that are in the larger string
        // if all match return true. Both strings are unsorted and may contain duplicate
        // characters
        startTime = System.currentTimeMillis();
        answer = Search.sequentialSearch(sourcetext, searchtext);
        endTime = System.currentTimeMillis();

        System.out.println("Is all the text " + searchtext + " included in " + sourcetext + " : " + answer);
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

        // second search attempt with binary search
        answer = false;
        String sourcetext2;
        String searchtext2;
        startTime = System.currentTimeMillis();
        sourcetext2 = QuickSort.qsort(sourcetext.toCharArray(), 0, sourcetext.length() - 1);
        searchtext2 = QuickSort.qsort(searchtext.toCharArray(), 0, searchtext.length() - 1);
        sourcetext2 = myString.removeDuplicates(sourcetext2);
        searchtext2 = myString.removeDuplicates(searchtext2);
        for (int i = 0; i < searchtext2.length(); i++) {
            answer = Search.binarySearch(sourcetext2, searchtext2.charAt(i));
            if (answer == false)
                break;
        }
        endTime = System.currentTimeMillis();

        System.out.println("Is all the sorted text " + searchtext2 + " included in (duplicates removed) " + sourcetext2
                + " : " + answer);
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

        // third search attempt: search for all the characters in the smaller string
        // that are in the larger string
        // if all match return true.
        // this uses a hash table for searching instead of a sequential search
        startTime = System.currentTimeMillis();
        HashMap<Character, Boolean> cache = HashFunc.hashCreate(sourcetext);
        answer = HashFunc.hashSearch(cache, searchtext); // after sorting both strings
        endTime = System.currentTimeMillis();

        System.out.println("Is all the hash sorted text " + searchtext + " included in " + sourcetext + " : " + answer);
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }

}