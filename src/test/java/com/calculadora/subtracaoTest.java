package com.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class subtracaoTest {
    
    @Test
    public void subtrairDeDoisNumerosPositivos()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(4,5);
        calculator.subtracao();
        double expect = -1.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void subtrairDeDoisNumerosNegativo()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(-4,-5);
        calculator.subtracao();
        double expect = 1.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void subtrairDeDoisNumerosDistintos()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(-4,5);
        calculator.subtracao();
        double expect = -9.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }
}
