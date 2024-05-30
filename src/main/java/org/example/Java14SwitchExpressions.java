package org.example;

public class Java14SwitchExpressions {

    void now() {
        int k = 3;
        String s = switch (k) {
            case 1 -> "one";
            case 2 -> "two";
            default -> "many";
        };

    }

    void now2() {
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        Day day = Day.TUESDAY;
        String mood = switch (day) {
            case  MONDAY -> ":(";
            case  TUESDAY, WEDNESDAY, THURSDAY -> ":|";
            case  FRIDAY -> ":)";
            case  SATURDAY, SUNDAY -> ":D";
        };
    }
}
