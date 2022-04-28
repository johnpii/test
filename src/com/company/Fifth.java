package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args)
    {
        //а
        Double double1 = Double.valueOf("5");
        //b
        double double2 = Double.parseDouble("4");
        //c
        Double double3 = Double.valueOf(44);
        System.out.println(double3.byteValue());
        System.out.println(double3.shortValue());
        System.out.println(double3.intValue());
        System.out.println(double3.longValue());
        System.out.println(double3.floatValue());
        System.out.println(double3.doubleValue());
        //d
        System.out.println();
        System.out.println(double3);
        //e
        String d = Double.toString(3.14);
    }
}
