package com.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class multiplicacaoTest {
    @Test
    public void multiplicacaoDeDoisNumerosPositivos()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(15,3);
        calculator.multiplicacao();
        double expect = 45.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void multiplicacaoDeDoisNumerosNegativo()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(-15,-3);
        calculator.multiplicacao();
        double expect = 45.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void multiplicacaoDeDoisNumerosDistintos()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(-15,3);
        calculator.multiplicacao();
        double expect = -45.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }
}
