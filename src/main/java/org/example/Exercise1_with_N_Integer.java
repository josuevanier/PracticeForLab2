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
            System.out.println("Enter your " + (i + 1) + " num: ");
            integers[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(integers));


        System.out.println(sumOfArray(integers));

        System.out.println(produtOfArray(integers));

       System.out.println(arrayAvg(integers));

       int[] array = {1,1,1,2,3,4};

       elementOccurence(array,1,2,4);
    }

    public static int sumOfArray(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i ++){
            sum += array[i];
        }
        return sum;
    }
    public static int produtOfArray(int[] array){
        int product  = 1;
        for(int i = 0; i < array.length; i++){

            product *= array[i];
        }
        return product;
    }

    public static double arrayAvg(int [] array){
        double avg;
        avg = (double) sumOfArray(array) / array.length;
        return avg;
    }

    public static void elementOccurence(int[] array, int target, int target2, int target3){
        int count = 0;


        for(int i = 0; i < array.length; i++){
                if (array[i] == target) count++;
        }
        System.out.println("[" + target +"]" + ": " + count + "\n");

        count = 0;

        for (int j = 0; j < array.length; j++){
            if(array[j] == target2) count++;
        }
        System.out.println("[" + target2 +"]" + ": " + count + "\n");

        count = 0;

        for(int v = 0; v < array.length; v++){
            if(array[v] == target3) count++;
        }
        System.out.println("[" + target3 + "]" + ": " + count);
    }
}
