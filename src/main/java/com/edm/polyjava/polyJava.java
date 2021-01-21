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
public class polyJava {
    
    public static void main(String[] args){
        
        Weather today = new Weather("18 Degree Celsius", "to north","28","normal");
        Sunny monday = new Sunny("30 Degree Celsius", "normal","10","clear", "fun and cool");
        Rainy tuesday = new Rainy("15 Degree Celsius", "to south","20","to much", "wetty day");
        
        today.weatherComponents();
        monday.weatherComponents();
        tuesday.weatherComponents();
    
    }
    
}
