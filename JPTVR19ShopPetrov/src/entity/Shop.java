/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author pupil
 */

    public class Shop implements Serializable{
    private String name;
    private Integer price;
    private Integer publishedYear;
    private String isbn;

public Shop() {
    }

    public Shop(String name, Integer price, Integer publishedYear, String isbn) {
        this.name = name;
        this.price = price;
        this.publishedYear = publishedYear;
        this.isbn = isbn;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setAuthor(String author) {
        this.price =price;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Integer publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" 
                + "name=" + name 
                + ", price=" + price 
                + ", publishedYear=" + publishedYear 
                + ", isbn=" + isbn 
                + '}';
    }
    
    
    
}
    
