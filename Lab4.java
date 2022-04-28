package com.company;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Визначення кількості студентів
        int numOfStudents;
        System.out.println("Кількість студентів:");
        while (true) {
            in.nextLine();
            if (!in.hasNextInt()) {
                System.out.println("Введіть ціле число.");
            } else {
                numOfStudents = in.nextInt();
                break;
            }
        }


        //Масив об'єктів класу Student

        Student[] s = new Student[numOfStudents];

        //Введення параметрів об'єктів класу

        for (int i = 0; i < s.length; i++) {
            System.out.format("Ім'я студента №%d:", i + 1);
            String name = in.next();

            //Робимо першу літеру великою

            String nameFirstCapitalLetter = name.substring(0, 1).toUpperCase() + name.substring(1);
            s[i] = new Student(nameFirstCapitalLetter);
            System.out.format("Зріст студента №%d:", i + 1);

            // Перевірка на тип даних

            while (true) {
                in.nextLine();
                if (!in.hasNextFloat()) {
                    System.out.println("Введіть число.");
                } else {
                    s[i].setHeight(in.nextFloat());
                    if (s[i].getHeight() <= 0) {
                        System.out.println("Зріст має бут додатнім числом.");
                    } else if (s[i].getHeight() < 75) {
                        System.out.println("Зріст найнижчої людини світу - 74 см, менше не буває.");
                    } else if (s[i].getHeight() > 272) {
                        System.out.println("Зріст найвищої людини світу - 272 см, більше не буває.");
                    } else {
                        break;
                    }
                }
            }
            System.out.format("Оцінка ЗНО студента №%d:", i + 1);

            while (true) {
                in.nextLine();
                if (!in.hasNextFloat()) {
                    System.out.println("Введіть число.");
                } else {
                    s[i].setZnoMark(in.nextFloat());
                    if (s[i].getZnoMark() < 100 || s[i].getZnoMark() > 200) {
                        System.out.println("Оцінка ЗНО має бути в межах від 100 до 200 балів.");
                    } else {
                        break;
                    }
                }
            }

            System.out.format("Курс студента №%d:", i + 1);
            while (true) {
                in.nextLine();
                if (!in.hasNextInt()) {
                    System.out.println("Введіть ціле число.");
                } else {
                    s[i].setGrade(in.nextInt());
                    if (s[i].getGrade() < 1 || s[i].getGrade() > 6) {
                        System.out.println("Немає такого курсу.");
                    } else {
                        break;
                    }
                }
            }
        }

        //Пустий об'єкт для тимчасового зберігання даних

        Student s1;

        //Бульбашкове сортування

        //Сортування за зростанням
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (j != s.length - 1) {
                    if (s[j].getHeight() > s[j + 1].getHeight()) {
                        s1 = s[j + 1];
                        s[j + 1] = s[j];
                        s[j] = s1;
                    }
                }
            }
        }
        System.out.println("Список, відсортований\nза зростанням зросту:");
        for (Student student : s) {
            System.out.println(student.getName() + "\t" + student.getHeight() + " см;");
        }

        System.out.println("\nСписок, відсортований\nза спаданням оцінки ЗНО:");
        //Сортування за спаданням
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (j != s.length - 1) {
                    if (s[j].getZnoMark() < s[j + 1].getZnoMark()) {
                        s1 = s[j + 1];
                        s[j + 1] = s[j];
                        s[j] = s1;
                    }
                }
            }
        }
        for (Student student : s) {
            System.out.println(student.getName() + "\t" + student.getZnoMark() + " балів;");
        }
    }
}
