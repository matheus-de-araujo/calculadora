package com.calculadora;

public class App 
{
    public static void main( String[] args )
    {
        CalculadoraBasica cal = new CalculadoraBasica(2, 3);
        cal.soma();
        System.out.println(cal.getResultado());
    }
}
