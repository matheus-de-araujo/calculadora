package com.calculadora;

public class CalculadoraCientifica extends CalculadoraBasica{
    CalculadoraCientifica (double termoUm, double termoDois) {
        super(termoUm, termoDois);
    }

    CalculadoraCientifica (double termoUm) {
        super(termoUm);
    }

    public void raizQuadrada() {
        super.setResultado(Math.sqrt(this.getTermoUm()));
    }

    public void seno() {
        super.setResultado(Math.sin(this.getTermoUm()));
    }

    public void cosseno() {
        super.setResultado(Math.cos(this.getTermoUm()));
    }

    public void tangente() {
        super.setResultado(Math.tan(this.getTermoUm()));
    }

    public void logaritmo() {
        super.setResultado(Math.log(this.getTermoUm()));
    }
}
