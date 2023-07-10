package org.example.easy;

public class Roman_To_Integer_13 {
    public int romanToInt(String s) {
        int last = 0;
        int sum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = getValue(s.charAt(i));
            if (value < last) {
                sum -= value;
            }else {
                sum += value;
            }
            last = value;
        }
        return sum;
    }
    int getValue(char symbol) {
        return switch (symbol) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalStateException();
        };
    }
}

