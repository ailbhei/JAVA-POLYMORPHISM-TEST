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
public class Sunny extends Weather {
    
    public String shine;
    
    public Sunny(String initTemperature, String initWind, String initHumidity, String initCloudiness, String initShine){
        
        super(initTemperature, initWind, initHumidity, initCloudiness);
        shine = initShine;
    
    }
    
    public void weatherComponents(){
        
        System.out.println("Oh It's Monday. What a sunny day!");
        System.out.println("Temperature: " + temperature);
        System.out.println("Wind: " + wind);
        System.out.println("Humidity: " + humidity);
        System.out.println("Cloudiness: " + cloudiness);
        System.out.println("Shine: " + shine + "\n");
        
    }
    
    }
    

