package com.terradatum;

/**
 * Created by rbellamy on 7/16/16.
 */
public class SomeMain {
    public static void main(String[] argv) {
        System.out.println("Goodbye world!");
        SomeOtherLibrary someOtherLibrary = new SomeOtherLibrary();
        System.out.println(".... SomeOtherLibrary: " + someOtherLibrary.getSomeLibrary().getSomeValue());
    }
}
