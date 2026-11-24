package Programs_asked_in_Companies_during_Technical_Rounds;

//  9 Check for Balanced Brackets
//
//Write a program to check whether a given expression containing brackets is balanced or not.
//Allowed Brackets
//( )   { }   [ ]
//Balancing Rules
//• Every opening bracket must have a corresponding closing bracket
//• Brackets must be closed in the correct order
//• Mixed types of brackets are allowed
//The program should return whether the expression is Balanced or Not Balanced.
// Input: Expression = "{[()]}"
//Output: Balanced
//
//Input: Expression = "{[(])}"
//Output: Not Balanced

import java.util.Stack;

public class P9 {
    public static boolean isBalancing(String brackets) {
        Stack<Character> stack = new Stack<>();

        for (char ch : brackets.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(')
                stack.push(ch);
            else {
                if (stack.isEmpty()) return false;

                char last = stack.pop();

                if ((ch == '}' && last != '{') ||
                        (ch == ']' && last != '[') ||
                        (ch == ')' && last != '('))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalancing("{[()]}"));
        System.out.println(isBalancing("{[(])}"));
    }
}
