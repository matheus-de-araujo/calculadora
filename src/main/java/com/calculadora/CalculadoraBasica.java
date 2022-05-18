package com.calculadora;

public class CalculadoraBasica extends Calculadora{
    CalculadoraBasica (float termoUm, float termoDois) {
        super(termoUm, termoDois);
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
