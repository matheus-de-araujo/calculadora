package com.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class tangenteTest {
    @Test
    public void tangenteDeNumerosPositivos()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(90);
        calculator.tangente();
        double expect = 0.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void tangenteDeNumerosNegativo()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(-90);
        calculator.tangente();
        double expect = 0.0;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void tangenteDeNumerosFlutuante()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(45.5);
        calculator.tangente();
        double expect = 18.81;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }
}
