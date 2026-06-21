package DAY4;

import java.util.Scanner;

public class Array1st {

    public static void main(String[] args) {

        int n, i, avg, sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of Array : ");
        n = input.nextInt();

        // array creation
        int[] marks = new int[n];

        // store values in array
        for(i = 0; i < n; i++) {
            System.out.println("Enter marks : ");
            marks[i] = input.nextInt();
        }

        // read data from array and calculate sum
        for(i = 0; i < n; i++) {
            sum = sum + marks[i];
        }

        // calculate average
        avg = sum / n;

        System.out.println("Average marks = " + avg);

        input.close();
    }
}