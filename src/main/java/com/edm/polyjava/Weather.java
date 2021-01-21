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
public class Weather {
    
   public String temperature;
    
   public String wind;
    
   public String humidity;
    
   public String cloudiness;
    
    public Weather(String initTemperature, String initWind, String initHumidity, String initCloudiness){
        
        temperature = initTemperature;
        wind = initWind;
        humidity = initHumidity;
        cloudiness = initCloudiness;
    }
    
    public void weatherComponents(){
        
        System.out.println("Todays Weather");
        System.out.println("Temperature: " + temperature );
        System.out.println("Wind: " + wind);
        System.out.println("Humidity: " + humidity);
        System.out.println("Cloudiness: " + cloudiness+ "\n");
    
    }
    
}
