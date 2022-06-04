package com.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void somaDeDoisNumeros()
    {
        CalculadoraCientifica calculator = new CalculadoraCientifica(4,5);
        calculator.soma();
        double expect = 9;
        double fuzzFactor = 22.0d / 7.0d;
        assertEquals(expect, calculator.getResultado(), fuzzFactor);
    }
}
