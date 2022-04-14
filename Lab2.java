package com.company;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//	int C5 = 1300 % 5; //C = a * B, a = const
//  int C7 = 1330 % 7; //type = double
//  int C11 = 1330 % 11; //Знайти середнє значення елементів матриці


        // перевірка на тип даних
        int numOfRow;
        while (true) {
            System.out.println("Кількіть рядків:");
            try {
                numOfRow = Integer.parseInt(scanner.next());
                if (numOfRow < 100) {
                    break;
                }else{
                    System.out.println("Занадто велике число");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введіть, будь ласка, число типу int.\n");

            }
        }

        int numOfCol;
        while (true) {
            System.out.println("Кількіть стовпців:");
            try {
                numOfCol = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введіть, будь ласка, число типу int.\n");
            }
        }
        // сформували матрицю В,
        double[][] matrix_B = new double[numOfRow][numOfCol];
        for (int i = 0; i < numOfRow; i++) {
            for (int j = 0; j < numOfCol; j++) {
                while (true) {
                    System.out.format("Елемент з індексом[%d][%d]:\n", i, j);
                    try {
                        matrix_B[i][j] = Double.parseDouble(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Можна тільки число\n");
                    }
                }
            }
        }


        int Row_B, Column_B;
        //відобразили матрицю В
        System.out.format("Матриця B:\n");
        for (Row_B = 0; Row_B < numOfRow; Row_B++) {
            for (Column_B = 0; Column_B < numOfCol; Column_B++) {
                System.out.format("%10.2f", matrix_B[Row_B][Column_B]);
            }
            System.out.println();
        }

        //Створили матрицю С, такого ж розміру
        double coefficient;
        while(true) {
            System.out.println("Введіть коефіцієнт:");
            try {
                coefficient = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Можна тільки числа");
            }
        }
        double[][] matrix_C = new double[matrix_B.length][numOfCol];
        int row_C, column_C;
        double sumOfElements = 0d;
        System.out.format("Матриця С = %1f * B:\n", coefficient);
        for (row_C = 0; row_C < numOfRow; row_C++) {
            for (column_C = 0; column_C < numOfCol; column_C++) {
                matrix_C[row_C][column_C] = coefficient * matrix_B[row_C][column_C];
                sumOfElements += matrix_C[row_C][column_C];
                System.out.format("%10.2f", matrix_C[row_C][column_C]);
            }
            System.out.println();
        }
        double average_Value = sumOfElements / (numOfCol * numOfRow);
        System.out.format("Середнє значення елементів матриці: %.4f\n ", average_Value);


    }
}





