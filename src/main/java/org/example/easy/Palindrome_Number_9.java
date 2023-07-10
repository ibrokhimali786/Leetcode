package org.example.easy;

public class Palindrome_Number_9 {
    public boolean isPalindrome(int x) {

        if (x < 0) return false;

        int reversed = 0;
        int original = x;
        while (original != 0) {
            reversed = reversed * 10 + original % 10;
            original /= 10;
        }
        return reversed == x;
    }
}
