package org.example;

public class ArrayUtils {
    static int[] increment(int[] array) {
        int i = array.length;
        int[] newArray = new int[array.length];
        while(i-- != 0){
            newArray[i] = array[i]+1;
        }
        return newArray;
    }

    static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];
        for(int i= 0; i < array.length; i++){
            newArray[i] = array[array.length-1-i];
        }
        return newArray;
    }
}
