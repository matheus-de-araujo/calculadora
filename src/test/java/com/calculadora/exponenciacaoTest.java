package com.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class exponenciacaoTest {
    
    @Test
    public void exponenciacaoDeDoisNumerosPositivos()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(2,4);
        calculator.exponenciacao();
        double expect = 16.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void exponenciacaoDeDoisNumerosNegativo()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(-2,-2);
        calculator.exponenciacao();
        double expect = -0.25;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void somaDeDoisNumerosDistintos()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(-4,5);
        calculator.exponenciacao();
        double expect = -1024.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }
}
