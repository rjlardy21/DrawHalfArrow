
//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           TextConverter
// Files:           a list of all source files used by that program
// Course:          CS200 Spring 2018
//
// Author:          Reece Lardy
// Email:           rlardy@wisc.edu
// Lecturer's Name: Mark Renault
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully 
// acknowledge and credit those sources of help here.  Instructors and TAs do 
// not need to be credited here, but tutors, friends, relatives, room mates 
// strangers, etc do.  If you received no outside help from either type of 
// source, then please explicitly indicate NONE.
//
// Persons:         identify each person and describe their help in detail
// Online Sources:  identify each URL and describe their assistance in detail
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

import java.util.Scanner;

public class TextConverter {
	public static String action1337(String userstring) {
		userstring = userstring.replace("L", "1");
		userstring = userstring.replace("l", "1");
		userstring = userstring.replace("E", "3");
		userstring = userstring.replace("e", "3");
		userstring = userstring.replace('T', '7');
		userstring = userstring.replace('t', '7');
		userstring = userstring.replace('O', '0');
		userstring = userstring.replace('o', '0');
		userstring = userstring.replace('S', '$');
		userstring = userstring.replace('s', '$');
		return userstring;
	}

	public static void testAction1337() {
		boolean error = false;

		String input1 = "LEeTs";
		String expected1 = "1337$";
		String input2 = "LEeTse";
		String expected2 = "1337$3";
		String input3 = "LEeTss";
		String expected3 = "1337$$";
		String result1 = action1337(input1);
		String result2 = action1337(input2);
		String result3 = action1337(input3);
		if (!result1.equals(expected1)) {
			error = true;
			System.out.println(
					"1) testAction1337 with input " + input1 + ", expected: " + expected1 + " but result:" + result1);
		}
		if (!result2.equals(expected2)) {
			error = true;
			System.out.println(
					"2) testAction1337 with input " + input2 + ", expected: " + expected2 + " but result:" + result2);
		}
		if (!result3.equals(expected3)) {
			error = true;
			System.out.println(
					"3) testAction1337 with input " + input3 + ", expected: " + expected3 + " but result:" + result3);
		}
		if (error) {
			System.out.println("testAction1337 failed");
		} else {
			System.out.println("testAction1337 passed");
		}
	}

	public static String actionReverse(String current) {
		String finito = "";
		char[] ua = current.toCharArray();
		for (int i = ua.length - 1; i >= 0; i--) {
			finito = finito.concat(String.valueOf(ua[i]));
		}
		return finito;
	}

	public static void testActionReverse() {
		boolean error = false;

		String input1 = "Abc";
		String expected1 = "cbA";
		String input2 = "12";
		String input3 = "23";
		String exp2 = "21";
		String exp3 = "32";
		String result1 = actionReverse(input1);
		if (!result1.equals(expected1)) {
			error = true;
			System.out.println("1) testActionReverse with input " + input1 + ", expected: " + expected1 + " but result:"
					+ result1);
		}
		String result2 = actionReverse(input2);
		if (!result2.equals(exp2)) {
			error = true;
			System.out.println(
					"2) testActionReverse with input " + input2 + ", expected: " + exp2 + " but result:" + result2);
		}
		String result3 = actionReverse(input3);
		if (!result1.equals(exp3)) {
			error = true;
			System.out.println(
					"3) testActionReverse with input " + input3 + ", expected: " + exp3 + " but result:" + result3);
		}

		if (error) {
			System.out.println("testActionReverse failed");
		} else {
			System.out.println("testActionReverse passed");
		}
	}

	/**
	 * Provides the main menu for the text converter and calls methods based on menu
	 * options chosen.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Text Converter.");
		System.out.println("Available Actions:");
		System.out.println("  1337) convert to 1337-speak");
		System.out.println("  rev) reverse the string");
		System.out.println("  quit) exit the program");
		System.out.println("");
		System.out.print("Please enter a string: ");
		String userstring = sc.nextLine();
		boolean quit = false;
		while (!quit) {
			System.out.print("Action (1337, rev, quit): ");
			String cmd = sc.nextLine();
			if (cmd.equals("1337")) {
				System.out.println(action1337(userstring));
				userstring = action1337(userstring);
				cmd = "";
			} else if (cmd.equals("rev")) {
				System.out.println(actionReverse(userstring));
				userstring = actionReverse(userstring);
				cmd = "";
			} else if (cmd.equals("quit")) {
				System.out.println("See you next time!");
				quit = true;
			} else {
				System.out.println("Unrecognized action.");
				System.out.println(userstring);
				cmd = "";
			}
		}

		// testAction1337(); //uncomment to run the tests
		// testActionReverse(); //uncomment to run the tests
	}
}
