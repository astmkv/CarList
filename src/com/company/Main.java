package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    EasyCar c1 = new EasyCar();
    Truck c2 = new Truck();
    PassCar c3 = new PassCar();
//
//    c1.input(in);
//    c2.input(in);
//    c3.input(in);
//
    Car.showTable(c1.input(in), c2.input(in), c3.input(in));


    }
}
