/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo.controleclima.cdp;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author aeller
 */
public class ArCondicionado extends Observable{
    private float temperatura;
    ArrayList<SensorPessoas> sensoresPessoas = new ArrayList<>();
    ArrayList<SensorTemperatura> sensoresTemperatura = new ArrayList<>();    
    
    
    public ArCondicionado() {
        
    }

    public float getTemperatura() {
        
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    
    public void addSensorPessoas(SensorPessoas sensor){
        this.sensoresPessoas.add(sensor);
    }
    
    public void addSensorTemperatura(SensorTemperatura sensor){
        this. sensoresTemperatura.add(sensor);
    }
    
    public void calculaTemperatura(){
        float mediaPessoa=0;
        float mediaTemperaturaExterna=0;
        for(SensorPessoas sensorP : sensoresPessoas){
            mediaPessoa+=sensorP.getQtdPessoas();
        }
        mediaPessoa/=sensoresPessoas.size();
        
        for(SensorTemperatura sensorT : sensoresTemperatura){
            mediaTemperaturaExterna+= sensorT.getTemperatura();
        }
        mediaTemperaturaExterna/=sensoresTemperatura.size();
        
        this.setTemperatura(mediaTemperaturaExterna + mediaPessoa);
        
        setChanged();   
        notifyObservers();
    }
}
