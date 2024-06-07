package org.example;

public class PatternMatchingInstanceOfExample {

    void previous() {

        String obj = "";
        if (obj instanceof String) {
            String s = (String) obj;
            // use s
        }
    }

    void now() {
        Object obj = (Object)"test ";
        if (obj instanceof String s) {
            System.out.println(s.trim());

        }

    }
}
