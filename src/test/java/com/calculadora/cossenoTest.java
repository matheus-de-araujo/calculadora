package com.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class cossenoTest {
    @Test
    public void cossenoDeNumerosPositivos()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(90);
        calculator.cosseno();
        double expect = 0.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void cossenoDeNumerosNegativo()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(-90);
        calculator.cosseno();
        double expect = 0.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void cossenoDeNumerosFlutuante()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(45.5);
        calculator.cosseno();
        double expect = 0.7;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }
}
