package org.example.easy;

public class Longest_Common_Prefix_14 {
    public String longestCommonPrefix(String[] strs) {

        String temp = strs[0];

        for (int i = 1; i < strs.length; i++)
            while (!strs[i].startsWith(temp)) {
                temp = temp.substring(0, temp.length() - 1);
                if (temp.isEmpty()) return "";
            }

        return temp;
    }
}
