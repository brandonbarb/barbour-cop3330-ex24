/*
 *  UCF COP3330 Summer 2021 Assignment 24 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    static int isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return 0;
        } else {
            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();
            int check = 0;
            for (int i = 0; i <= s1.length - 1; i++) {
                for (int n = 0; n <= s2.length - 1; n++) {
                    if (s1[i] == s2[n]) {
                        check = check + 1;
                        s2[n] = 0;
                    }
                }
            }
            if (check == str1.length()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = input.next();
        System.out.print("Enter the second string: ");
        String str2 = input.next();
        if (isAnagram(str1, str2) == 1) {
            System.out.printf("\"%s\" and \"%s\" are anagrams.", str1, str2);
        }
        else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", str1, str2);
        }
    }
}
