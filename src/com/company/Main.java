package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string");
        String string = input.nextLine();
        System.out.println("Middle character of string: '" + string.charAt(string.length()/2));
    }
}
