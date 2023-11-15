package com.sparta.ua;

import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println(isPalindrome("boom"));
        System.out.println(isPalindrome("bob"));
        System.out.println(isPalindrome("jooool"));
        System.out.println(isPalindrome("faaaaaaaf"));
        System.out.println("----------------");
        System.out.println(isPalindrome2("boob"));
        System.out.println(isPalindrome2("blow"));
        System.out.println(isPalindrome2("trust"));
        System.out.println("----------------");
        String[] ddd = {"blld","woow","looool","stood","SuuuuuuuuuuS"};
        System.out.println(getLongestPalindrome(ddd));
    }

    public static boolean isPalindrome(String word){
        boolean palindrome = true;
        int n = word.length();

        Stack<Character> letters = new Stack<>();

        for(char letter: word.toCharArray()){
            letters.push(letter);
        }

        for(int i = 0;i < n/2; i++){
            char let = letters.pop();

            if(let != word.charAt(i)){
                palindrome = false;
                break;
            }
        }

        return palindrome;
    }

    public static boolean isPalindrome2(String word){
        boolean palindrome = false;
        StringBuilder str = new StringBuilder();
        str.append(word);
        str.reverse();

        if(str.toString().equals(word)){
            palindrome = true;
        }

        return palindrome;
    }

    public static String getLongestPalindrome(String[] sentence){
        String result = "";

        for(int i = 0;i < sentence.length;i++){
            String neww = sentence[i];
            if(isPalindrome(neww) && neww.length() > result.length()){
                result = neww;
            }
        }
        return result;
    }
}
