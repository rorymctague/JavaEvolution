package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambdas {

    // introduced in java8
    // https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
    // https://www.baeldung.com/java-8-sort-lambda
    // https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html#syntax
    // https://www.javatpoint.com/java-lambda-expressions

    class Human {
        private String name;
        private int age;

        public Human(String name, int age) {
        }

        public String getName() {
            return name;
        }

        // standard constructors, getters/setters, equals and hashcode
    }

    public void previous() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Sarah", 10));
        humans.add(new Human("Jack", 12));

        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return h1.getName().compareTo(h2.getName());
            }
        });
    }

    public void now() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Sarah", 10));
        humans.add(new Human("Jack", 12));

        humans.sort(
                (Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));
    }

    /* Why is this better than an interface with a default method? That would still have to be instantiated.
    One method only is key.

    Object being instantiated from functional interface, argument-list, arrow-token, body/implementation
     */
    @FunctionalInterface  //It is optional
    interface Drawable{
        public void draw();
    }

    public class LambdaExpressionExample2 {
        public static void main(String[] args) {
            int width=10;

            //with lambda
            // instantiate and provide the implementation
            Drawable d2=()->{
                System.out.println("Drawing "+width);
            };
            d2.draw();
        }
    }

    interface Sayable{
        public String say(String name);
    }

    public class LambdaExpressionExample4{
        public static void main(String[] args) {

            // Lambda expression with single parameter.
            Sayable s1=(name)->{
                return "Hello, "+name;
            };
            System.out.println(s1.say("Sonoo"));

            // You can omit function parentheses
            Sayable s2= name ->{
                return "Hello, "+name;
            };
            System.out.println(s2.say("Sonoo"));
        }
    }
}
