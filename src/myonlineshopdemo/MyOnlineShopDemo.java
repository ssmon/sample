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
public class MyOnlineShopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Product[] products=new Product[5];
        products[0]=new MP3Player("Grey","IPod",200);
        products[1]=new TV(50,"Sony",2000);
        products[2]=new TV(60,"Samsung",2500);
        products[3]=new  Book(2005,"Java EE Big Picture",50);
        products[4]=new  Book(2017,"Modern Architecture",60);
        
        double totalRegularPrice=0;
        double totalComputeSalesPrice=0;
        
        for(int i=0;i<products.length;i++){
            totalRegularPrice=products[i].getRegularPrice();
            totalComputeSalesPrice=products[i].computeSalesPrice();
            System.out.println("Product Items:"+products[i].getClass().getName());
        }
        
        System.out.println("Total Regular Price:"+totalRegularPrice);
        System.out.println("Compute Sales Prices:"+totalComputeSalesPrice);
    }
}