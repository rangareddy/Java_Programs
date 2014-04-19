package com.ranga;

import java.util.Scanner;

/**
 * @user: Ranga Reddy
 * @date: 19/04/14 06:49 PM
 * @version: 0.1
 */
public class EvenOrOdd {
  public static void main(String[] args) {
    int nos[] = new int[]{0,1};
    String res[] = new String[]{"is Even","is Odd"};
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Number: ");
    int num = scanner.nextInt();
    System.out.println(num + " "+res[nos[num%2]]);
  }
}


/*

Output - 1:
	Enter Number: 
	20
	20 is Even
	
Output - 2:
	Enter Number: 
	143
	143 is Odd
 */