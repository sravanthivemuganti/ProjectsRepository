package com.apex.practice;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		// char[] brackets = {'{', '(', '[', ']', ')', '}' };
		System.out.println("Check brackets are balanced");
		Scanner sc = new Scanner(System.in);
		String bracketsString = sc.next();
		char[] brackets = bracketsString.toCharArray();
		try {
			if (checkBrackets(brackets))
				System.out.println("Balanced");
			else
				System.out.println("Not Balanced");
		} catch (Exception e) {
			System.out.println("Not Balanced");
		}
	}

	public static boolean checkBrackets(char[] brackets) throws Exception {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < brackets.length; i++) {
			if ((brackets[i] == '{') || (brackets[i] == '(') || (brackets[i] == '[')) {
				st.push(brackets[i]);
			} else if ((brackets[i] == '}') || (brackets[i] == ')') || (brackets[i] == ']')) {
				if (!matchBrackets(st.pop(), brackets[i])) {
					return false;
				}
			}
		}
		for (int i = 0; i < brackets.length; i++) {
			if ((brackets[i] == '{') || (brackets[i] == '(') || (brackets[i] == '[')) {
				if (st.empty()) {
					return true;
				} else {
					//System.out.println("Stack is not empty");
					return false;
				}
		}
		}return false;
	}

	public static boolean matchBrackets(char pop, char brackets) {
		System.out.print(pop);
		System.out.print(brackets);
		if (pop == '{' && brackets == '}')
			return true;
		else if (pop == '(' && brackets == ')')
			return true;
		else if (pop == '[' && brackets == ']')
			return true;
		else
			return false;
	}
}
