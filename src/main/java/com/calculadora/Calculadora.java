package com.calculadora;

public class Calculadora {

    /* Construtor */
    Calculadora(double termoUm, double termoDois) {
        this.termoUm   = termoUm;
        this.termoDois = termoDois;
    }

    Calculadora(double termoUm) {
        this.termoUm   = termoUm;
    }

    private double termoUm;

    private double termoDois;

    private double resultado;

    public double getTermoUm() {
        return termoUm;
    }
    
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getTermoDois() {
        return termoDois;
    }

    public void setTermoDois(double termoDois) {
        this.termoDois = termoDois;
    }

    public void setTermoUm(double termoUm) {
        this.termoUm = termoUm;
    }
}
