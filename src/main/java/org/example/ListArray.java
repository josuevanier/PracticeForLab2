package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ListArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String you would like to enter");


        int numberOfElements = sc.nextInt();

        String[] elements = new  String[numberOfElements];

        for(int i = 0; i < numberOfElements; i++){
            System.out.println("Enter your element");

            elements[i] = sc.next();
        }
        uniqueStringElement(elements);
    }

    public static void uniqueStringElement(String[] elements){
        ArrayList<String> strings = new ArrayList<>();
        Arrays.sort(elements);

        for (int i = 0;  i < elements.length; i++){
           // for(int j = 1; j < elements.length; j++ ){
            if(!strings.contains(elements[i])) {
                strings.add(elements[i]);
            //}
            }
        }
        System.out.println("Your unique elements is : " + strings);
    }

}
