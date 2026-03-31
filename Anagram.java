package test;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	/*Given two strings s and t, return true if t is an  anagram  of s, and false otherwise. 
	 *Example 1: Input: s = "anagram", t = "nagaram" Output: true Example 2: Input: s = "rat", t = "car" Output: fals*/
	

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        
       System.out.println(isAnagarm(s, t));
    }
    
    private static boolean isAnagarm(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] words = new int[26];
        for (int i = 0; i < s.length(); i++) {
            words[s.charAt(i) - 'a']++; // a - 96, d - 99, index = 3
            words[t.charAt(i) - 'a']--;
        }
        // a, b, c, d, e, f, g, h
        for (int i = 0; i < 26; i++) {
            if (words[i] != 0) {
                return false;
            }
        }
        return true;
        
        // time: O(N) n = size of the string
        // space: O(P). p = size of the character array
    }
}
