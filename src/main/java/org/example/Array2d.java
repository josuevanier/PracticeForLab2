package org.example;

public class Array2d {
    public static void main(String[] args) {

<<<<<<< HEAD
        int[][] myArray = {{1,2},
                {2,3},
                {3,4}
        };

        sumOfRow(myArray);
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
=======
>>>>>>> origin/main
    }
}
