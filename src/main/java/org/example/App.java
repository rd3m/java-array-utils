package org.example;


import java.util.Arrays;

public class App
{

    public static void main( String[] args )
    {
        int[] arrayTest = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(ArrayUtils.increment(arrayTest)));
        System.out.println(Arrays.toString(ArrayUtils.reverse(arrayTest)));

    }


}
