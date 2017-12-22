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
public class Product {
    private double regularPrice;
    
    public Product(double regularPrice){
        this.regularPrice=regularPrice;
    }
    
    public double computeSalesPrice(){
        return 0;
    }
    
    public double getRegularPrice(){
        return regularPrice;
    }
}
