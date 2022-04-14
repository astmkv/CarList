package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Car {

    Scanner in = new Scanner(System.in);

    protected String className = "Car";
    protected String make;
    protected String model;
    protected String cat;
    protected String type;
    protected String number;
    protected String year;
    protected String trailer;
    private Object String;

    public Car(String make, String model, String cat, String type, String number, String year, String trailer) {
        this.make = make;
        this.model = model;
        this.cat = cat;
        this.type = type;
        this.number = number;
        this.year = year;
        this.trailer = trailer;
    }

    public Car() {
    }

    public String[][] input(Scanner in) {

        String arrCarList[][] = new String[7][1];
        System.out.println("Укажите технические данные для ТС");

        System.out.print("Марка: ");
        make = in.nextLine();
        arrCarList[0][0] = make;

        System.out.print("Модель: ");
        model = in.nextLine();
        arrCarList[1][0] = model;

        System.out.print("Категория: ");
        if (className.equals("EasyCar")) {
            System.out.print("1 - B, 2 - BE: ");
            int select = in.nextInt();
            switch (select) {
                case 1 -> cat = "B";
                case 2 -> cat = "BE";

            }
        } else if (className.equals("Truck")) {
            System.out.print("1 - C, 2 - C1, 3 - CE, 4 - C1E: ");
            int select = in.nextInt();
            switch (select) {
                case 1 -> cat = "C";
                case 2 -> cat = "C1";
                case 3 -> cat = "CE";
                case 4 -> cat = "C1E";
            }
        } else if (className.equals("PassCar")) {
            System.out.print("1 - D, 2 - D1, 3 - DE, 4 - D1E: ");
            int select = in.nextInt();
            switch (select) {
                case 1 -> cat = "D";
                case 2 -> cat = "D1";
                case 3 -> cat = "DE";
                case 4 -> cat = "D1E";
            }
        }
        arrCarList[2][0] = cat;

        System.out.print("Тип: ");

        switch (cat) {
            case "B", "BE":
                System.out.print("1 - M1, 2 - N1: ");
                int select = in.nextInt();
                switch (select) {
                    case 1 -> type = "M1";
                    case 2 -> type = "N1";
                }
                break;
            case "C", "C1", "CE", "C1E":
                System.out.print("1 - N2, 2 - N3: ");
                select = in.nextInt();
                switch (select) {
                    case 1 -> type = "N2";
                    case 2 -> type = "N3";
                }
            case "D", "D1", "DE", "D1E":
                System.out.print("1 - M2, 2 - M3: ");
                select = in.nextInt();
                switch (select) {
                    case 1 -> type = "M2";
                    case 2 -> type = "M3";
                }
        }

        arrCarList[3][0] = type;

        System.out.print("Госномер: ");
        number = in.nextLine();
        arrCarList[4][0] = number;

        System.out.print("Год выпуска: ");
        year = in.nextLine();
        arrCarList[5][0] = year;

        System.out.print("Прицеп");
        switch (type) {
            case "B":
                System.out.print("1 - без прицепа, 2 - прицеп О1: ");
                int select = in.nextInt();
                switch (select) {
                    case 1 -> trailer = "-";
                    case 2 -> trailer = "O1";
                }
            case "BE", "CE", "DE":
                System.out.print("1 - без прицепа, 2 - прицеп О2: ");
                select = in.nextInt();
                switch (select) {
                    case 1 -> trailer = "-";
                    case 2 -> trailer = "O2";
                }
            case "C1":
                System.out.print("1 - без прицепа, 2 - прицеп О3: ");
                select = in.nextInt();
                switch (select) {
                    case 1 -> trailer = "-";
                    case 2 -> trailer = "O3";
                }
            case "C1E":
                System.out.print("1 - без прицепа, 2 - прицеп О4: ");
                select = in.nextInt();
                switch (select) {
                    case 1 -> trailer = "-";
                    case 2 -> trailer = "O4";
                }

            case "D1E":
                System.out.print("1 - без прицепа, 2 - прицеп О3, 3 - прицеп О4: ");
                select = in.nextInt();
                switch (select) {
                    case 1 -> trailer = "-";
                    case 2 -> trailer = "O3";
                    case 3 -> trailer = "O4";
                }
        }
        arrCarList[6][0] = trailer;

        return arrCarList;
    }

    public static void showTable(String[][] easyCar, String[][] truck, String[][] PassCar) {
        String headline[] = {"МАРКА: ", "МОДЕЛЬ: ", "КАТЕГОРИЯ: ", "ТИП: ", "ГОСНОМЕР: ", "ГОД ВЫПУСКА: ", "ПРИЦЕП: "};
        String[][] table = new String[7][4];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    table[i][j] = headline[i];
                } else if (j == 1) {
                    table[i][j] = easyCar[i][0];
                } else if (j == 2) {
                    table[i][j] = truck[i][0];
                } else if (j == 3) {
                    table[i][j] = PassCar[i][0];
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(table[i][j] + "\t");
            }
        }
    }
}