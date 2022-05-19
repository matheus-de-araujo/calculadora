package com.calculadora;

public class CalculadoraBasica extends Calculadora{
    CalculadoraBasica (double termoUm, double termoDois) {
        super(termoUm, termoDois);
    }

    CalculadoraBasica (double termoUm) {
        super(termoUm);
    }

    public void soma() {
        super.setResultado(this.getTermoUm() + this.getTermoDois());
    }

    public void subtracao() {
        super.setResultado(this.getTermoUm() - this.getTermoDois());
    }
  
    public void divisao() {
        super.setResultado(this.getTermoUm() / this.getTermoDois());      
    }

    public void multiplicacao() {
        super.setResultado(this.getTermoUm() * this.getTermoDois());      
    }
}
