package test;
import java.util.Stack;

import java.util.Stack;

public class StringExpander {
	 public static void main(String[] args) {
	        String input = "2[2[aa]2[bb]1[cc]f]";
	        String output = expandString(input);
	        System.out.println(output);  // Output should be: aabbbbccfaabbbbccf
	    }
    public static String expandString(String input) {
        Stack<Integer> counts = new Stack<>();  // Stack to hold the repeat counts
        Stack<StringBuilder> resultStack = new Stack<>();  // Stack to hold intermediate strings
        StringBuilder current = new StringBuilder();  // To build the final result
        int i = 0;

        while (i < input.length()) {
            char c = input.charAt(i);

            // If the current character is a digit, find the full number
            if (Character.isDigit(c)) {
                int count = 0;
                while (Character.isDigit(input.charAt(i))) {
                    count = Integer.parseInt(String.valueOf(c));
                    i++;
                }
                counts.push(count);  // Push the number to the stack
            } 
            // If the current character is '[', start a new segment
            else if (c == '[') {
                resultStack.push(current);  // Push the current string to the stack
                current = new StringBuilder();  // Start a new string
                i++;
            } 
            // If the current character is ']', repeat the string inside the brackets
            else if (c == ']') {
                StringBuilder temp = current;
                current = resultStack.pop();  // Get the previous string
                int repeatTimes = counts.pop();  // Get the repeat count
                
                // Append the repeated string
                for (int j = 0; j < repeatTimes; j++) {
                    current.append(temp);
                }
                i++;
            } 
            // If the character is a letter, add it to the current string
            else {
                current.append(c);
                i++;
            }
        }

        return current.toString();  // Final expanded string
    }

}
