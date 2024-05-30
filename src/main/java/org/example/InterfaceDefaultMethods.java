package org.example;

public class InterfaceDefaultMethods {

    // https://www.baeldung.com/java-static-default-methods

    // Allow default implementations on an interface rather than forcing each implementer to override and implement themselves

     interface Vehicle {

        String getBrand();

        String speedUp();

        String slowDown();


        // These don't have to be implemented by implementers
        default String turnAlarmOn() {
            return "Turning the vehicle alarm on.";
        }

        default String turnAlarmOff() {
            return "Turning the vehicle alarm off.";
        }
    }

    public class Car implements Vehicle {

        private String brand;

        // constructors/getters

        @Override
        public String getBrand() {
            return brand;
        }

        @Override
        public String speedUp() {
            return "The car is speeding up.";
        }

        @Override
        public String slowDown() {
            return "The car is slowing down.";
        }
    }
}
