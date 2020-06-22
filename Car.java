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
public abstract class Car {
 
    public Car(CarType model) {
        this.model = model;
        arrangeParts();
    }
 
    private void arrangeParts() {
        // Do one time processing here
    }
 
    // Do subclass level processing in this method
    protected abstract void construct();
 
    private CarType model = null;
 
    public CarType getModel() {
        return model;
    }
 
    public void setModel(CarType model) {
        this.model = model;
    }
}
