/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.poo.controleclima.cdp.ArCondicionado;
import br.ifes.poo.controleclima.cdp.SensorPessoas;
import br.ifes.poo.controleclima.cdp.SensorTemperatura;
import br.ifes.poo.controleclima.cdp.TemperaturaMonitor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;;

/**
 *
 * @author aeller
 */
public class TesteControleClima {
    
    public TesteControleClima() {
    }
    
  
    
    @Before
    public void setUp() {
        
    }
    
    @Test
    public testeControleTemperatura(){
        TemperaturaMonitor monitor = new TemperaturaMonitor(56);
        
        ArCondicionado ar = new ArCondicionado();
        ar.addObserver(monitor);
        
        ar.addSensorPessoas(new SensorPessoas(9));
        ar.addSensorPessoas(new SensorPessoas(10));
        ar.addSensorPessoas(new SensorPessoas(11));
        
        ar.addSensorTemperatura(new SensorTemperatura(24));
        ar.addSensorTemperatura(new SensorTemperatura(25));
        ar.addSensorTemperatura(new SensorTemperatura(26));
        
        float resultado = ar.getTemperatura();
        Assert.assertEquals(35.0, resultado);
        
        ar.calculaTemperatura();
        
        resultado = ar.getTemperatura();
        
        Assert.assertEquals(25.0 ,resultado);
    }
}
