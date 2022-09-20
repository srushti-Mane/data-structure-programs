package com.datastructure;
import java.util.*;
public class BalancedParenthesis {
    public static boolean balancedParenthesis(String str) {
            Stack stack = new Stack();
            for (int i = 0; i < str.length(); i++) {
                char x = str.charAt(i);
                if (x == '(' || x == '[' || x == '{') {
                    stack.push(x);
                    continue;
                }
                if (stack.isEmpty()) return false;
                char check;
                switch (x) {
                    case ')':
                        check = (char) stack.pop();
                        if (check == '{' || check == '[') return false;
                        break;
                    case '}':
                        check = (char) stack.pop();
                        if (check == '(' || check == '[') return false;
                        break;
                    case ']':
                        check = (char) stack.pop();
                        if (check == '(' || check == '{') return false;
                        break;
                }
            }
            return (stack.isEmpty());
        }
        public
        static void main(String[] args) {
            String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
            if (balancedParenthesis(str))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }


