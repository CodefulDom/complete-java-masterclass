package com.theDom;

public class Main {

    public static void main(String[] args) {
        // width of 16(2 bytes)
        var myChar = '\u00A9';
        System.out.println(myChar);

        // variable name is asking the question
        boolean myBoolean = true;
        System.out.println(myBoolean);

        var registeredSymbol = '\u00AE';
        System.out.println(registeredSymbol);
    }
}
