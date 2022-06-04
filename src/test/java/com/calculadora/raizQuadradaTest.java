package com.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class raizQuadradaTest {
    
    @Test
    public void raizQuadradaDeNumeroPositivo()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(16);
        calculator.raizQuadrada();
        double expect = 4.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void raizQuadradaDeNumeroNegativo()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(-16);
        calculator.raizQuadrada();
        double expect = 0.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }
}
