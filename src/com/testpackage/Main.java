package com.testpackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы через пробел:");
        int size = scanner.nextInt();
        int size2 = scanner.nextInt();
        int[][] matrix = new int[size][size2];
        System.out.println("Введите данные для матрицы: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
                System.out.print(matrix[i][j] + " ");
            }

        }
        int[][] rotateMatrix = rotateNinetyDegreesCounterclockwise(matrix);
        print(rotateMatrix);
    }

    private static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    private static int[][] rotateNinetyDegreesCounterclockwise(int[][] array) {
        int indexI = 0;
        int indexJ = 0;
        int[][] result = new int[array[0].length][array.length];
        for (int j = 0; j < array.length; j++) {
            System.out.print("\n");
            if (indexI != 0) {
                indexJ++;
                indexI = 0;
            }
            for (int i = array[0].length - 1; i >= 0; i--) {
                result[indexI][indexJ] = array[j][i];
                indexI++;
            }
        }
        return result;
    }

}

