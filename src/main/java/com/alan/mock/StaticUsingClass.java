package com.alan.mock;

/**
 * @author asmith
 */
public class StaticUsingClass {

    public String getStaticString() {

        String s = StaticClass.returnString();
        String s2 = StaticClass.returnString();

        return StaticClass.returnString();
    }

}
