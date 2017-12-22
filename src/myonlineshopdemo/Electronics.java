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
public class Electronics extends Product {
    private String manufacturer;

    public Electronics(String manufacturer, double regularPrice) { //constructor midering
        super(regularPrice);
        this.manufacturer = manufacturer;
    }
    
    public double computeSalesPrice(){
        return super.getRegularPrice()*0.6;
       
    }
    
    
}
