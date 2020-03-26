package com.compare;

public class myString {

    public static String removeDuplicates(String text) {

        StringBuilder endResult = new StringBuilder();

        char currentC;
        boolean flag = false;
        for (int i = 0; i < text.length(); i++) {
            currentC = text.charAt(i);
            flag = false;
            for (int y = 0; y < i; y++)
                if (currentC == text.charAt(y)) {
                    flag = true;
                    break;
                }

            if (!flag)
                endResult.append(currentC);
        }

        // System.out.println("result with removed dups: " + endResult);
        return endResult.toString();
    }

}
