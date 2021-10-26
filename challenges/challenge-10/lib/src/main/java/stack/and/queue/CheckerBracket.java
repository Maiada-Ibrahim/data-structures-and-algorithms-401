package stack.and.queue;

import java.util.ArrayList;

public class CheckerBracket {
    static boolean validateBrackets(String str) {
        ArrayList<Character> arrayOfBracket = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '}' || str.charAt(i) == '(' || str.charAt(i) == ')' || str.charAt(i) == '[' || str.charAt(i) == ']') {
                arrayOfBracket.add(str.charAt(i));
            }

        }
        if (arrayOfBracket.size() == 0 || arrayOfBracket.size() % 2 != 0 || arrayOfBracket.size() == 1) {
            return false;
        }

        for (int i = 0; i < arrayOfBracket.size() - 1; i++) {
            char first = arrayOfBracket.get(i);
            char sec = arrayOfBracket.get(i + 1);
            if (sec == '}') {
                if (first == '(' || first == '[') {
                    return false;
                }
            }
            if (sec == ')') {
                if (first == '{' || first == '[') {
                    return false;
                }
            }
            if (sec == ']') {
                if (first == '{' || first == '(') {
                    return false;
                }
            }
        }
        return true;
    }
}