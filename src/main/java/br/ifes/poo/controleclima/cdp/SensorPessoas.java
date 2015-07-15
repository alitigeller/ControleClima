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
public class SensorPessoas {
    private int qtdPessoas;

    public SensorPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public SensorPessoas() {
    }    
    
    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
    
    
}
