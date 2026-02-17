package com.mathi27.exception;

import java.util.Scanner;

import com.mathi27.exception.custom.DivideByZeroException;

public class DivideByZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a numerator number value to perform the division:");
        int numerator = scanner.nextInt();
        System.out.println("Please enter a denominator number value to perform the division:");
        int denominator = scanner.nextInt();
        if(denominator==0){
            throw new DivideByZeroException("Denominator can't be zero");
        }
        int result = numerator/denominator;
        System.out.println(result);
    }

}
