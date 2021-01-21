/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edm.polyjava;

/**
 *
 * @author user
 */
public class Rainy extends Weather{
    
    String wet;
    
    public Rainy(String initTemperature, String initWind, String initHumidity, String initCloudiness, String initWet){
        
        super(initTemperature, initWind, initHumidity, initCloudiness);
        wet = initWet;
    }
    
    public void weatherComponents(){
        
        System.out.println("And Now The Rainy Tuesday....");
        System.out.println("Temperature: " + temperature);
        System.out.println("Wind: " + wind);
        System.out.println("Humidity: " + humidity);
        System.out.println("Cloudiness: " + cloudiness);
        System.out.println("Wet: " + wet + "\n");
        
    }
    
}
