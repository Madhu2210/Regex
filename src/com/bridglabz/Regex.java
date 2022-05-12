package com.bridglabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static Pattern pattern = Pattern.compile("abc.[a-z]{0,3}@bl.co.[a-z]{0,2}$");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Email Id: ");
        String testString = scanner.next();
        Matcher matcher = pattern.matcher(testString);

        if (matcher.matches()) {
            System.out.println("Valid");

        } else {
            System.out.println("Not-Valid");
        }
    }
}
