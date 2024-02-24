package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1_with_N_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.MAX_VALUE;
        while (n > 10) {
            System.out.println("How many integer you want to enter");
            n = sc.nextInt();

            if(n == 0 ) {
                System.out.println("Are you sure ? ");
                String answer = sc.nextLine();
                if(answer.equalsIgnoreCase("yes")) break;
            }
        }

        int[]  integers = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter your " + n + "num: ");
            integers[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(integers));
    }
}
