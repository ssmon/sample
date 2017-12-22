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
public class MP3Player extends Electronics{
    private String color;

    public MP3Player(String color, String manufacturer, double regularPrice) {
        super(manufacturer, regularPrice);
        this.color = color;
    }
    
   public double computeSalesPrice(){
       return super.getRegularPrice()*0.9;
   }
    
}
