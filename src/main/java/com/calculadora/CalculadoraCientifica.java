package com.calculadora;

public class CalculadoraCientifica extends CalculadoraBasica{
    CalculadoraCientifica (double termoUm, double termoDois) {
        super(termoUm, termoDois);
    }

    CalculadoraCientifica (double termoUm) {
        super(termoUm);
    }

    public void raizQuadrada() {
        if(this.getTermoUm() < 0) {
            System.out.println("Não existe raiz quadrada de número negativo");
            return;
        }
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

    public void exponenciacao() {
        super.setResultado(Math.pow(this.getTermoUm(), this.getTermoDois()));
    }

    public void logaritmo() {
        if(this.getTermoUm() <= 0) {
            System.out.println("Não existe resultados para números menor ou igual a ZERO!");
            return;
        }
        super.setResultado(Math.log(this.getTermoUm()));
    }
}
