package com.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class divisaoTest {
    
    @Test
    public void divisaoDeDoisNumerosPositivos()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(15,3);
        calculator.divisao();
        double expect = 5.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void divisaoDeDoisNumerosNegativo()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(-15,-3);
        calculator.divisao();
        double expect = 5.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void divisaoDeDoisNumerosDistintos()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(-15,5);
        calculator.divisao();
        double expect = -5.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }
}
