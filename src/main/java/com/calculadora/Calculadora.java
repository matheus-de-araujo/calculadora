package com.calculadora;

public class Calculadora {
    private float termoUm;

    private float termoDois;

    private float resultado;

    public float getTermoUm() {
        return termoUm;
    }
    
    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public float getTermoDois() {
        return termoDois;
    }

    public void setTermoDois(float termoDois) {
        this.termoDois = termoDois;
    }

    public void setTermoUm(float termoUm) {
        this.termoUm = termoUm;
    }
}
