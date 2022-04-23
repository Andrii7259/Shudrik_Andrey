package com.company;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Масив об'єктів класу Student
        Student[] s = new Student[3];
        System.out.println("Введіть параметри кожного студента \nчерез пробіл (Ім'я Зріст Оцінка Курс), натисніть Enter");
        //Введення параметрів об'єктів классу
        Student Tom = new Student("Tom", 179, 199, 4);
        while (true){
            try{
                for (int i = 0; i < s.length; i++) {
                    s[i] = new Student(in.next(), in.nextInt(), in.nextInt(), in.nextInt());

                }break;

            }catch (Exception e){
                System.out.println("Введіть дані необхідних типів.");

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
        System.out.println("Том відвідав лекцію" + " " + Tom.visitLections(17) + " " + "разів.");
    }
}
