package by.it.nakov.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("[ \\-:,\\n]+");
        Matcher matcher = pattern.matcher(Poem.TEXT);
        StringBuilder stringBuilder1 = new StringBuilder();
        Pattern pattern1 = Pattern.compile("[.]{2,}");
        Matcher matcher1 = pattern1.matcher(stringBuilder.append(matcher.replaceAll(" ")));
        stringBuilder1.append(matcher1.replaceAll(""));
        Pattern pattern2 = Pattern.compile("[.!]+");
        String[] arraysParts = pattern2.split(stringBuilder1);
        for (int i = 0; i < arraysParts.length; i++) {
            arraysParts[i] = arraysParts[i].trim();
        }
        for (int i = 0; i < arraysParts.length; i++) {
            for (int j = 0; j < arraysParts.length; j++) {
                if (arraysParts[i].length() < arraysParts[j].length()) {
                    String temp = arraysParts[i];
                    arraysParts[i] = arraysParts[j];
                    arraysParts[j] = temp;
                }
            }
        }
        for (String arrayPart : arraysParts) {
            System.out.println(arrayPart);
        }
    }
}
