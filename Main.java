package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        n = in.nextInt();
        arr = new int[n];
        int res = 0;
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            res += arr[i];
        }
        System.out.println("Sum of array elements - " + res);
        // write your code here
    }
}
