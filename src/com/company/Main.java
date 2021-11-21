package com.company;

import java.util.Scanner;

public class Main {

    public static boolean checkText (String text){

        StringBuilder text1 = new StringBuilder();
        text1.append(text);
        text1.reverse();
        if (text1.toString().equals(text.toString()) == true){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the text: ");
        String palindrome = scanner.nextLine();
        if (checkText(palindrome) == true){
            System.out.printf("%s is palindrome",palindrome);
        }
        else {
            System.out.printf("%s isn't palindrome",palindrome);
        }

    }
}
