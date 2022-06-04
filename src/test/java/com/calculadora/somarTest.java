package com.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class somarTest {
    
    @Test
    public void somaDeDoisNumerosPositivos()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(4,5);
        calculator.soma();
        double expect = 9.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void somaDeDoisNumerosNegativo()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(-4,-5);
        calculator.soma();
        double expect = -9.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void somaDeDoisNumerosDistintos()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(-4,5);
        calculator.soma();
        double expect = 1.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }
}
