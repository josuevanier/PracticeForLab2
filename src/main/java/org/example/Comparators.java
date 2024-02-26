package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparators {

    public static void main(String[] args) {
        ArrayList<Author> authors = new ArrayList<Author>();

        authors.add(new Author("Josue", "FOrestal","LOla",4,1977));
        authors.add(new Author("Josue", "BOrestal","LOla",2,2002));
        authors.add(new Author("Josue", "DOrestal","LOla",3,2004));

        // Based on year of Publication
        Collections.sort(authors, new AuthorYearOfPublicationComparator());

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
    int numberOfSells;
    int yearOfPulbication;

    public Author(String firstName, String lastName, String bookName, int numberOfSells,int yearOfPulbication) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookName = bookName;
        this.numberOfSells = numberOfSells;
        this.yearOfPulbication  = yearOfPulbication;
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
class AuthorNameComparator implements Comparator<Author>{

    @Override
    public int compare(Author o1, Author o2) {
        return o1.lastName.compareTo(o2.lastName);
    }
}

class AuthorYearOfPublicationComparator implements Comparator<Author>{

    @Override
    public int compare(Author o1, Author o2) {
        if(o1.yearOfPulbication == o2.yearOfPulbication) return 0;
        else if (o1.yearOfPulbication > o2.yearOfPulbication) return 1;
        else return -1;
    }
}
class AuthorBookName implements Comparator<Author>{

    @Override
    public int compare(Author o1, Author o2) {
        return o1.bookName.compareTo(o2.bookName);
    }
}