package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {

    public static void main(String[] args) {
        ArrayList<Author> authors = new ArrayList<Author>();

        authors.add(new Author("Josue", "FOrestal","LOla",4));
        authors.add(new Author("Josue", "BOrestal","LOla",2));
        authors.add(new Author("Josue", "DOrestal","LOla",3));

        Collections.sort(authors);

        // Cannot print the values as an object if you don't have a toString method
        for(Author author : authors){
            System.out.println( author.firstName + " " + author.lastName + " " + author.bookName);
        }
    }
}
class Author implements  Comparable<Author>{
    String firstName;
    String lastName;
    String bookName;
    int numberOfSells = 0;

    public Author(String firstName, String lastName, String bookName, int numberOfSells) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookName = bookName;
        this.numberOfSells = numberOfSells;
    }
    // Problem with comparator one of the major problem with comperator  its the comperator interface only have one method
    // if you want to compare based  sort based on different data field you will have to change the code
    @Override
    public int compareTo(Author o) {
      // Bigger value to smaller value
        if(this.numberOfSells == o.numberOfSells) return 0;
        else if (this.numberOfSells > o.numberOfSells) return -1;
        else return 1;
    }
}
