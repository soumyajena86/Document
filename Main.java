package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

/******************************************************************************

/ Find Longest Substring Without Repeating Characters 

// Input String : thelongestsubstring 
// Output : ubstring 
// Input String : welcometotheevernorth 
// Output

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String input = "thelongestsubstring"; 
		
		
		System.out.println("Hello World:"+ getLogestSubstring(input));
		input = "welcometotheevernorth"; 
		
		System.out.println("Hello World:"+ getLogestSubstring(input));
		
	}
	
    public static String getLogestSubstring(String param){
    	HashSet<Character> charSet = new HashSet<>();
    	int startIndex = 0 ; int endIndex=0;int maxLength=0;int maxStart=0;
        for(int i=0;i<param.length();i++){
        	Character charVal = param.charAt(i);
        	endIndex = i;
        	while(charSet.contains(charVal)) {
        		charSet.remove(param.charAt(startIndex));
        		startIndex++;
        	}
        	charSet.add(charVal);
        	if(endIndex-startIndex+1>maxLength) {
        		maxLength = endIndex-startIndex+1;
        		maxStart = startIndex;
        	}
        	
        }
        return param.substring(maxStart, maxStart+maxLength);
    }
    
   /* private static String longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        
        int maxLength = 0; // 7
        int start = 0, end = 0;
        
        int l = 0, r = 0;
        while (l <= r && r < s.length()) {
            while (set.contains(s.charAt(r))) {
                int diff = r - l; // 7 - 0 = 7
                if (diff > maxLength) {
                    System.out.println("Diff " + diff);
                    start = l;
                    end = r;
                    maxLength = diff;
                    System.out.println("start " + start);
                    System.out.println("end " + end);
                }
                set.remove(s.charAt(l));
                l++;
            }
            
            set.add(s.charAt(r)); // u,b,s,t,r,i,n,g
            r++;
        }
        
        return s.substring(start, end);
    }*/
    
    
    
}
