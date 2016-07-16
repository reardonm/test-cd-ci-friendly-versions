package com.terradatum;

/**
 * Created by rbellamy on 7/16/16.
 */
public class SomeOtherLibrary {
    private SomeLibrary someLibrary;

    public SomeOtherLibrary() {
        getSomeLibrary().setSomeValue(1);
    }

    public SomeLibrary getSomeLibrary() {
        return someLibrary;
    }

    public void setSomeLibrary(SomeLibrary someLibrary) {
        this.someLibrary = someLibrary;
    }
}
