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
public class SensorTemperatura {
    float temperatura;

    public SensorTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public SensorTemperatura() {
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    
    
}
