package org.example;

public class Comparator {

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

    @Override
    public int compareTo(Author o) {
        return this.lastName.compareTo(o.lastName); // comparing the current object with the object o;
    }
}
