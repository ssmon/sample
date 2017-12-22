/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myonlineshopdemo;

/**
 *
 * @author Dell5458
 */
public class Book extends Product {
    private int yearPublished;
    private String publisher;

    public Book(int yearPublished, String publisher, double regularPrice) {
        super(regularPrice);
        this.yearPublished = yearPublished;
        this.publisher = publisher;
    }
    
    public double computeSalesPrice(){
        return super.getRegularPrice()*0.5;
    }
}
