package com.examples.HackerRank;

public class Parser {
    static String isBalanced(String str) {
        while (str.contains("()") || str.contains("{}")) {
            str = str.replaceAll("\\(\\)", "")
                    .replaceAll("\\{\\}", "");
        }
        if (str.length() == 0) {
            ;
            return str;

        }
        return null;

    }
}