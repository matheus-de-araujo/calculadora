package com.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class senoTest {
    
    @Test
    public void senoDeNumerosPositivos()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(90);
        calculator.seno();
        double expect = 1.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void senoDeNumerosNegativo()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(-90);
        calculator.seno();
        double expect = -1.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void senoDeNumerosFlutuante()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(45.5);
        calculator.seno();
        double expect = 0.7;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }
}
