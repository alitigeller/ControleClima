/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo.controleclima.cdp;

/**
 *
 * @author aeller
 */
public class App {
    
    public static void main (String[] args){
        TemperaturaMonitor monitor = new TemperaturaMonitor(56);
        
        ArCondicionado ar = new ArCondicionado();
        ar.addObserver(monitor);
        
        ar.addSensorPessoas(new SensorPessoas(9));
        ar.addSensorPessoas(new SensorPessoas(10));
        ar.addSensorPessoas(new SensorPessoas(11));
        
        ar.addSensorTemperatura(new SensorTemperatura(24));
        ar.addSensorTemperatura(new SensorTemperatura(25));
        ar.addSensorTemperatura(new SensorTemperatura(26));
        
        ar.calculaTemperatura();
    }
}
