/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo.controleclima.cdp;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author aeller
 */
public class TemperaturaMonitor implements Observer {
    public float temperaturaFixa;

    public TemperaturaMonitor(float temperaturaFixa) {
        this.temperaturaFixa = temperaturaFixa;
    }

    public float getTemperaturaFixa() {
        return temperaturaFixa;
    }

    public void setTemperaturaFixa(float temperaturaFixa) {
        this.temperaturaFixa = temperaturaFixa;
    }
    
    

    @Override
    public void update(Observable obs, Object arg) {
        ArCondicionado ar =  (ArCondicionado) obs;
        if(ar.getTemperatura() != temperaturaFixa){
            System.out.println("Observada temperatuda de " + ar.getTemperatura() + " mudada para "+ temperaturaFixa);
            ar.setTemperatura(temperaturaFixa);
        }
    }
    
}
