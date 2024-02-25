package org.example;

public class Array2d {
    public static void main(String[] args) {

        int[][] myArray = {
                {1,2,3,4},
                {2,3,5,6},
                {3,4,7,8}
        };

        //sumOfRow(myArray);

        //maxOfAnArray(myArray);

        columnsSums(myArray);
    }

    public static void sumOfRow(int[][] array){
        int sum = 0;
        // Assuming each array have the same number of elements
        // so not ragged array
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
            System.out.println("Sum of row " + i + " : " + sum);
            sum = 0;
        }

    }
    public static void maxOfAnArray(int[][] array){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                max = Math.max(max,array[i][j]);
            }
            System.out.println("Max of " + i + " : " + max);
            max = Integer.MIN_VALUE;
        }
    }
    public static void columnsSums(int[][] array){
        int sum = 0;

        for(int i = 0; i < array[0].length; i++){
            for(int j = 0; j < array.length; j++){
                sum += array[j][i];
            }
            System.out.println("Sum of " + i+ " : " + sum);
            sum = 0;
        }
    }
}
