package com.sokalski;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("Minimum: " + returnedMin);
    }

    public static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[count];
        int i = 0;

        while(i < count) {
            System.out.println("Enter your number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                myArray[i] = number;
                i++;
            }
            scanner.nextLine();

        }
        scanner.close();
        return myArray;
    }

    public static int findMin(int[] array) {
        int current_min = Integer.MAX_VALUE;
        for(int i = 0; i<array.length - 1; i++) {
            if(array[i] < array[i+1]) {
                int value = array[i];

                if(value < current_min) {
                    current_min = value;
                }
            }
        }
        return current_min;
    }


}

