package com.calculadora;

public class App 
{
    public static void main( String[] args )
    {
        CalculadoraCientifica cal = new CalculadoraCientifica(2);
        cal.raizQuadrada();
        System.out.println(cal.getResultado());
    }
}
