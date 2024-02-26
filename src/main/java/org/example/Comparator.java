package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {

    public static void main(String[] args) {
        ArrayList<Author> authors = new ArrayList<Author>();

        authors.add(new Author("Josue", "FOrestal","LOla"));
        authors.add(new Author("Josue", "BOrestal","LOla"));
        authors.add(new Author("Josue", "DOrestal","LOla"));

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

    public Author(String firstName, String lastName, String bookName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookName = bookName;
    }
    // Problem with comparator one of the major problem with comperator  its the comperator interface only have one method
    // if you want to compare based  sort based on different data field you will have to change the code
    @Override
    public int compareTo(Author o) {
        return this.lastName.compareTo(o.lastName); // comparing the current object with the object o;
    }
}
