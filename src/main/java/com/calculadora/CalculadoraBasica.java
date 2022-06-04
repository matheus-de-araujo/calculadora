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
        if (this.getTermoDois() == 0) {
            System.out.println("Não é possível realizar divisão por ZERO!");
            return;
        }
        super.setResultado(this.getTermoUm() / this.getTermoDois());      
    }

    public void multiplicacao() {
        super.setResultado(this.getTermoUm() * this.getTermoDois());      
    }
}
