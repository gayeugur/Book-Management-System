/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp;

import java.util.ArrayList;

/**
 *
 * @author gayeu
 */
public abstract class Book {

    String name, author;
    int bookId, NumberofBooks;
    boolean stockStatus;
    static ArrayList booksName = new ArrayList<>();

    public Book(String name, String author, int bookId, int num, boolean stockStatus) {
        this.name = name;
        this.author = author;
        this.bookId = bookId;
        this.NumberofBooks = num;
        this.stockStatus = stockStatus;
        booksName.add("Java");
    }

    public abstract void ListBook();

}
