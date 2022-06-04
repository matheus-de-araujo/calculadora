package com.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class logaritmoTest {
    @Test
    public void logaritmoDeNumerosPositivos()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(90);
        calculator.logaritmo();
        double expect = 1.9;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }

    @Test
    public void logaritmoDeNumerosFlutuante()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(45.5);
        calculator.logaritmo();
        double expect = 1.6;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }
}
