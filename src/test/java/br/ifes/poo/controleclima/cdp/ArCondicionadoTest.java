/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo.controleclima.cdp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alessandro Eller
 */
public class ArCondicionadoTest {
    
    public ArCondicionadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTemperatura method, of class ArCondicionado.
     */
    
    
    @Test
    public void  testControleTemperatura(){
        float temperaturaFixa = 22;
        TemperaturaMonitor monitor = new TemperaturaMonitor(temperaturaFixa);
        
        ArCondicionado ar = new ArCondicionado();
        ar.addObserver(monitor);
        
        ar.addSensorPessoas(new SensorPessoas(9));
        ar.addSensorPessoas(new SensorPessoas(10));
        ar.addSensorPessoas(new SensorPessoas(11));
        
        ar.addSensorTemperatura(new SensorTemperatura(24));
        ar.addSensorTemperatura(new SensorTemperatura(25));
        ar.addSensorTemperatura(new SensorTemperatura(26));
        
        ar.calculaTemperatura();
        
        assertEquals(ar.getTemperatura(), temperaturaFixa,0);
    }

}
