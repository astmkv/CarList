package com.company;

import java.util.Scanner;

public class Truck extends Car {
    public Truck() {
        String className = "Truck";
    }

    public Truck(String make, String model, String cat, String type, String number, String year, String trailer) {
        super(make, model, cat, type, number, year, trailer);
    }

    @Override
    public String[][] input(Scanner in) {
        String className = "Truck";
        String arrCarList[][] = new String[7][1];
        System.out.println("Укажите технические данные для ТС");

        System.out.print("Марка: ");
        make = in.next();
        arrCarList[0][0] = make;

        System.out.print("Модель: ");
        model = in.next();
        arrCarList[1][0] = model;

        System.out.print("Категория: ");
        System.out.print("1 - C, 2 - C1, 3 - CE, 4 - C1E: ");
        int select = in.nextInt();
        switch (select) {
            case 1 -> cat = "C";
            case 2 -> cat = "C1";
            case 3 -> cat = "CE";
            case 4 -> cat = "C1E";
        }
        arrCarList[2][0] = cat;

        System.out.print("Тип: ");

            System.out.print("1 - N2, 2 - N3: ");
            select = in.nextInt();
            switch (select) {
                case 1 -> type = "N2";
                case 2 -> type = "N3";
            }

        arrCarList[3][0] = type;

        System.out.print("Госномер: ");
        number = in.next();
        arrCarList[4][0] = number;

        System.out.print("Год выпуска: ");
        year = in.next();
        arrCarList[5][0] = year;

        System.out.print("Прицеп: ");
        switch (cat) {
            case "C1":
                System.out.print("1 - без прицепа, 2 - прицеп О3: ");
                select = in.nextInt();
                switch (select) {
                    case 1 -> trailer = "-";
                    case 2 -> trailer = "O3";
                } break;
            case "CE":
                System.out.print("1 - без прицепа, 2 - прицеп О2: ");
                select = in.nextInt();
                switch (select) {
                    case 1 -> trailer = "-";
                    case 2 -> trailer = "O2";
                }break;
            case "C1E":
                System.out.print("1 - без прицепа, 2 - прицеп О4: ");
                select = in.nextInt();
                switch (select) {
                    case 1 -> trailer = "-";
                    case 2 -> trailer = "O4";
                }break;
        }
        arrCarList[6][0] = trailer;
        return arrCarList;
    }
}
