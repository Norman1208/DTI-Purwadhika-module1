package org.example.day4;

public class CaseSwapper {
    public String swapCase(String input){
        StringBuilder swapped = new StringBuilder();

        for (char c : input.toCharArray()){
            if (Character.isUpperCase(c)) {
                swapped.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                swapped.append(Character.toUpperCase(c));
            } else {
                swapped.append(c);
            }
        }
        return swapped.toString();
    }
}
