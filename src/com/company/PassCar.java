package com.company;

import java.util.Scanner;

public class PassCar extends Car {
    public PassCar() {
        String className = "Truck";
    }

    public PassCar(String make, String model, String cat, String type, String number, String year, String trailer) {
        super(make, model, cat, type, number, year, trailer);
    }

    @Override
    public String[][] input(Scanner in) {
        String className = "PassCar";
        String arrCarList[][] = new String[7][1];
        System.out.println("Укажите технические данные для ТС");

        System.out.print("Марка: ");
        make = in.next();
        arrCarList[0][0] = make;

        System.out.print("Модель: ");
        model = in.next();
        arrCarList[1][0] = model;

        System.out.print("1 - D, 2 - D1, 3 - DE, 4 - D1E: ");
        int select = in.nextInt();
        switch (select) {
            case 1 -> cat = "D";
            case 2 -> cat = "D1";
            case 3 -> cat = "DE";
            case 4 -> cat = "D1E";
        }
        arrCarList[2][0] = cat;

        System.out.print("Тип: ");

        System.out.print("1 - M2, 2 - M3: ");
        select = in.nextInt();
        switch (select) {
            case 1 -> type = "M2";
            case 2 -> type = "M3";
        }

        arrCarList[3][0] = type;

        System.out.print("Госномер: ");
        number = in.next();
        arrCarList[4][0] = number;

        System.out.print("Год выпуска: ");
        year = in.next();
        arrCarList[5][0] = year;

        System.out.print("Прицеп");
        switch (cat) {

            case "DE":
                System.out.print("1 - без прицепа, 2 - прицеп О2: ");
                select = in.nextInt();
                switch (select) {
                    case 1 -> trailer = "-";
                    case 2 -> trailer = "O2";
                }
                break;
            case "D1E":
                System.out.print("1 - без прицепа, 2 - прицеп О3, 3 - прицеп О4: ");
                select = in.nextInt();
                switch (select) {
                    case 1 -> trailer = "-";
                    case 2 -> trailer = "O3";
                    case 3 -> trailer = "O4";
                }
                break;
        }
        arrCarList[6][0] = trailer;

        return arrCarList;
    }
}