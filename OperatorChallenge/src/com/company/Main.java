package com.company;

public class Main {

    public static void main(String[] args) {

        double firstDoubleValue = 20.00d;
        double secondDoubleValue = 80.00d;
        double valueTotal = 100.00d * (firstDoubleValue + secondDoubleValue);
        System.out.println("My total value = " + valueTotal);
        double theReminder = valueTotal % 40.00d;
        System.out.println("the remainder = " + theReminder);
        boolean resIsTure = theReminder == 0 ? true : false;
        System.out.println(resIsTure);

        if (!resIsTure) {
            System.out.println("Got some remainder");
        }

    }
}
