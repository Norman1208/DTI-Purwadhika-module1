package org.example.day2;

public class removeString {
    public String removeFirstOccurence(String input, String searchString) {
        int index = input.indexOf(searchString);
        if (index != -1) {
            return input.substring(0, index) + input.substring(index + searchString.length());
        } else {
            return input;
        }
    }
}
