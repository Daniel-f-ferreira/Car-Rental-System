/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import ooc.enums.Make;
import ooc.enums.Month;
import java.util.Map;

/**
 * This is one of the interfaces you need to implement
 * 
 * @author apont
 */
public interface CarInterface {
    
class Car implements CarInterface
{
    private int id;
    private Make make;
    private double rate;
    private Month calendar;
    private static int counter = 1;

    // The ID starts as 1 and increases when a new car is created
    public Car() {
        id = counter;
        counter++;
    }

    public Map<Month, boolean[]> createAvailability(){

    }
    
    public Make getMake(){
        return make;
    }
    
    public void setMake(Make make){
        this.make = make;
    }
    
    public double getRate(){
        return rate;
    }
    
    public void setRate(double rate){
        this.rate = rate;
    }
    
    public Map<Month, boolean[]> getAvailability();
    
    public void setAvailability(Map<Month, boolean[]> availability);
    
    public int getId(){
        return id;
    }
    
    public boolean isAvailable(Month month, int day);
    
    public boolean book(Month month, int day);
}
    
    /**
     * Returns whether or not the car is available on the given month and day. 
     * Month is an Emum, day is an int within the limits of the number of days
     * in a given month
     * 
     * @param month Month being checked
     * @param day date being checked
     * @return  true or false if it is available or not
     */
    public boolean isAvailable(Month month, int day);
    
    /**
     * Book a room on the given month and day. To book a room its availability 
     * is changed to false on the given month and day. 
     * This should return true or false if this change is successfully made
     * 
     * @param month month to book
     * @param day date to book
     * @return true or false if the booking is completed
     */
    public boolean book(Month month, int day);
    
    
}
