package com.main;

import java.util.Scanner;

import com.service.DigitSum;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
        int n = sc.nextInt();
        
        
        if (DigitSum.checkSum(n) % 2 == 0) {
              System.out.println("Sum of odd digits is even");

        }else {
              System.out.println("Sum of odd digits is odd");
        }
        sc.close();

	}

}
