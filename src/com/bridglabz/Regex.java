package com.bridglabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    static Pattern pattern = Pattern.compile("([0-9]*[A-Z])[0-9a-zA-Z]{7,}");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Password: ");
        String testString = scanner.next();
        Matcher matcher = pattern.matcher(testString);

        if (matcher.matches()) {
            System.out.println("Valid");

        } else {
            System.out.println("Not-Valid");
        }
    }
}
