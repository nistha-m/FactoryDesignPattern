/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarFactoryy;

/**
 *
 * @author NISTHA
 */
public class SmallCar extends Car {
 
    SmallCar() {
        super(CarType.SMALL);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building small car");
       
    }
}