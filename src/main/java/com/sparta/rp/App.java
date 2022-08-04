package com.sparta.rp;

/**
 * compareTo compares the position of other enum constant in the list
 * ordinal tells the position of the enum constant in the list
 * valueof returns the
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Days myDay = Days.FRIDAY;
        System.out.println(myDay.valueOf("SUNDAY"));
    }
}
