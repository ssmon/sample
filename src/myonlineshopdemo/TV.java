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
public class TV extends Electronics {
    private int size;

    public TV(int size, String manufacturer, double regularPrice) {
        super(manufacturer, regularPrice);
        this.size = size;
    }
    
    public double computeSalesPrice(){
        return super.getRegularPrice()*0.8;
    }
    
}
